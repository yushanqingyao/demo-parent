package server.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import server.entity.Feedback;
import server.entity.Order;
import server.entity.OrderItem;
import server.entity.Refundment;
import server.model.ProductEnum;
import server.util.RandomUtil;
import server.util.Utils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper itemMapper;

    @Autowired
    private RefundmentMapper refundmentMapper;


    private String uid;
    private String sellerId;
    private String marketplaceId;

    @Before
    public void b() {
        uid = "16bbc787af901";
        sellerId = "A14TXKJTC9GEG8";
        marketplaceId = "ATVPDKIKX0DER";
    }

    @Test
    public void randomFeedback() {
        String[] orders = {"111-1573146-7713860", "111-1700037-5853807", "111-1728904-9464248", "111-2477460-1033848", "111-2511218-6037869", "111-4857759-0058659", "111-4878624-7584249", "111-5338317-7674649", "111-5387451-4393029", "111-5388181-6082603", "111-5695099-4095437", "111-5767207-2103405", "111-5961266-9223424", "111-7486686-1863428", "111-7783712-0621829", "111-7800716-1724244", "111-8147843-3986609", "111-8211317-8257014", "111-8374460-2794602", "111-8394861-4825013", "111-9746629-3722651", "111-9819900-3305011", "111-9918478-6408238", "112-1069282-5916237", "112-2255709-8134605", "112-2487600-8347467", "112-3486086-1073059", "112-4589032-1165065", "112-4675480-0589854", "112-5288896-1798667", "112-5395526-0738624", "112-5520615-2021020", "112-5768089-2134649", "112-6935575-2505856", "112-7067759-4197045", "112-7127919-0080253", "112-7195130-4875425", "112-7458501-4501846", "112-7930055-0565014", "112-8224309-4927463", "112-8531586-7881015", "112-9800124-8225048", "113-0640735-6890643", "113-0964665-1863409", "113-1152664-5468236", "113-1161421-9301065", "113-1562660-0499465", "113-2441629-5900230", "113-2618404-8889013", "113-2730317-1180253", "113-2884428-8972203", "113-3098543-6664250", "113-3576290-4493047", "113-4075231-0068241", "113-5886282-6695436", "113-6387299-5505821", "113-6526735-6188253", "113-6667524-5912248", "113-7034571-3385002", "113-7230224-5569834", "113-8547769-8025822", "113-8859220-2228213", "113-9068941-9494611", "113-9080078-1273035", "113-9449349-3559432", "113-9694573-2329831", "113-9958428-8315432", "114-0204555-3447459", "114-0751697-3261826", "114-0820177-7548222", "114-1088959-3705054", "114-1215703-1471400", "114-1224331-1308216", "114-1812529-3687444", "114-1908422-7578639", "114-2483882-5951427", "114-2569651-3729024", "114-3723535-2028269", "114-4219473-5837835", "114-4546385-1470623", "114-4879123-9301023", "114-4964945-8147458", "114-5252445-1517005", "114-5364453-0938655", "114-5677334-8605040", "114-5847949-6952231", "114-6081836-2846616", "114-6142159-8197047", "114-6478016-3627455", "114-7422272-7314610", "114-8140321-2609849", "114-8798934-3614653", "114-9098416-6409060", "114-9417619-5608256"};
        for (String orderId : orders) {
            Order orderParam = new Order();
            orderParam.setSellerId(sellerId);
            orderParam.setAmazonOrderId(orderId);
            Order order = orderMapper.selectOne(orderParam);
            Feedback feedback = Feedback.builder().uid(uid).sellerId(sellerId).marketplaceId(marketplaceId).orderId(orderId).purchaseDate(order.getPurchaseDate())
                    .purchaseDateStr(order.getPurchaseDateStr()).pullDataTime((int) System.currentTimeMillis() / 1000).updateDataTime((int) System.currentTimeMillis() / 1000)
                    .storeCode(String.format("%s_%s", marketplaceId, sellerId)).feedbackDate(RandomUtil.randomFeedbackDate(order.getPurchaseDate()))
                    .comment(RandomUtil.randomComment()).rating(RandomUtil.randomRating()).buyerEmail(order.getBuyerEmail()).buyerName(order.getBuyerName()).dataSource("mws")
                    .build();
            feedbackMapper.insertSelective(feedback);
        }

    }

    @Test
    public void randomRefundment() {
//        String[] orders = {"111-1573146-7713860", "111-1700037-5853807", "111-1728904-9464248", "111-2477460-1033848", "111-2511218-6037869", "111-4857759-0058659", "111-4878624-7584249", "111-5338317-7674649", "111-5387451-4393029", "111-5388181-6082603", "111-5695099-4095437", "111-5767207-2103405", "111-5961266-9223424", "111-7486686-1863428", "111-7783712-0621829", "111-7800716-1724244", "111-8147843-3986609", "111-8211317-8257014", "111-8374460-2794602", "111-8394861-4825013", "111-9746629-3722651", "111-9819900-3305011", "111-9918478-6408238", "112-1069282-5916237", "112-2255709-8134605", "112-2487600-8347467", "112-3486086-1073059", "112-4589032-1165065", "112-4675480-0589854", "112-5288896-1798667", "112-5395526-0738624", "112-5520615-2021020", "112-5768089-2134649", "112-6935575-2505856", "112-7067759-4197045", "112-7127919-0080253", "112-7195130-4875425", "112-7458501-4501846", "112-7930055-0565014", "112-8224309-4927463", "112-8531586-7881015", "112-9800124-8225048", "113-0640735-6890643", "113-0964665-1863409", "113-1152664-5468236", "113-1161421-9301065", "113-1562660-0499465", "113-2441629-5900230", "113-2618404-8889013", "113-2730317-1180253", "113-2884428-8972203", "113-3098543-6664250", "113-3576290-4493047", "113-4075231-0068241", "113-5886282-6695436", "113-6387299-5505821", "113-6526735-6188253", "113-6667524-5912248", "113-7034571-3385002", "113-7230224-5569834", "113-8547769-8025822", "113-8859220-2228213", "113-9068941-9494611", "113-9080078-1273035", "113-9449349-3559432", "113-9694573-2329831", "113-9958428-8315432", "114-0204555-3447459", "114-0751697-3261826", "114-0820177-7548222", "114-1088959-3705054", "114-1215703-1471400", "114-1224331-1308216", "114-1812529-3687444", "114-1908422-7578639", "114-2483882-5951427", "114-2569651-3729024", "114-3723535-2028269", "114-4219473-5837835", "114-4546385-1470623", "114-4879123-9301023", "114-4964945-8147458", "114-5252445-1517005", "114-5364453-0938655", "114-5677334-8605040", "114-5847949-6952231", "114-6081836-2846616", "114-6142159-8197047", "114-6478016-3627455", "114-7422272-7314610", "114-8140321-2609849", "114-8798934-3614653", "114-9098416-6409060", "114-9417619-5608256"};
        Example ex = new Example(Refundment.class);
        ex.setDistinct(true);
        ex.selectProperties("orderId");
        List<Refundment> refundments = refundmentMapper.selectByExample(ex);

        for (Refundment r : refundments) {
            String orderId = r.getOrderId();
            OrderItem itemParam = new OrderItem();
            itemParam.setSellerId(sellerId);
            itemParam.setAmazonOrderId(orderId);
            List<OrderItem> select = itemMapper.select(itemParam);

            Refundment rParam = new Refundment();
            rParam.setSellerId(sellerId);
            rParam.setOrderId(orderId);
            List<Refundment> select1 = refundmentMapper.select(rParam);
            for (int i = 0; i < select1.size(); i++) {
                Order order = new Order();
                order.setSellerId(sellerId);
                order.setAmazonOrderId(orderId);
                Order order1 = orderMapper.selectOne(order);

                Refundment refundment = select1.get(i);
                OrderItem orderItem = select.get(i);

                refundment.setQuantity(orderItem.getQuantityOrdered());
                refundment.setAsin(orderItem.getAsin());
                int random = RandomUtil.randomRetuenDate(order1.getPurchaseDate());
                refundment.setReturnDate(random);
                refundment.setReturnDateStr(Utils.dateToXmlDate(random));
                refundment.setAmount(orderItem.getItemAmount());
                refundment.setProductName(orderItem.getTitle());
                refundmentMapper.updateByPrimaryKeySelective(refundment);
            }

        }

    }

    @Test
    public void randomOrder() {
        Page<Order> orderPage = null;
        int pageNum = 1;
        int pageSize = 100;
        do {
            orderPage = PageHelper.startPage(pageNum, pageSize).doSelectPage(() -> orderMapper.selectAll());
            List<Order> result = orderPage.getResult();
            for (Order order : result) {
                OrderItem item = new OrderItem();
                item.setAmazonOrderId(order.getAmazonOrderId());
                item.setSellerId(order.getSellerId());
                List<OrderItem> items = itemMapper.select(item);
                int amount = 0;
                for (OrderItem orderItem : items) {
                    ProductEnum product = RandomUtil.randomProduct();

                    Integer quantityOrdered = orderItem.getQuantityOrdered();

                    orderItem.setAsin(product.name());
                    orderItem.setTitle(product.getSubject());
                    if (quantityOrdered != null) {
                        orderItem.setItemAmount(quantityOrdered * product.getPrice());
                        amount += quantityOrdered * product.getPrice();
                    }
                    itemMapper.updateByPrimaryKeySelective(orderItem);
                }
                if (amount > 0) {
                    order.setAmount(amount);
                }
                int random = RandomUtil.random();
                order.setLastUpdateDate(random);
                order.setPurchaseDate(random);
                order.setPurchaseDateStr(Utils.dateToXmlDate(random));

                orderMapper.updateByPrimaryKeySelective(order);
            }

            pageNum++;
        } while (orderPage.size() == 100);
    }


}