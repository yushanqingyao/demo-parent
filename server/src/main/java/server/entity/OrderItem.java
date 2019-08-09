package server.entity;

import javax.persistence.*;

@Table(name = "`amazon_order_item_16bbc787af901`")
public class OrderItem {
    /**
     * 亚马逊卖家id
     */
    @Id
    @Column(name = "`seller_id`")
    private String sellerId;

    /**
     * 亚马逊所定义的订单编码
     */
    @Id
    @Column(name = "`amazon_order_id`")
    private String amazonOrderId;

    /**
     * 主键，亚马逊定义的订单商品识别号
     */
    @Id
    @Column(name = "`order_item_id`")
    private String orderItemId;

    /**
     * 卖家主账号
     */
    @Column(name = "`uid`")
    private String uid;

    /**
     * 数据拉取时间
     */
    @Column(name = "`pull_data_time`")
    private Integer pullDataTime;

    /**
     * 数据更新时间
     */
    @Column(name = "`update_data_time`")
    private Integer updateDataTime;

    /**
     * 商品的亚马逊标准识别号 (ASIN)
     */
    @Column(name = "`asin`")
    private String asin;

    /**
     * 商品的卖家 SKU
     */
    @Column(name = "`seller_sku`")
    private String sellerSku;

    /**
     * 商品名称
     */
    @Column(name = "`title`")
    private String title;

    /**
     * 下面两个子元素的父元素
     */
    @Column(name = "`quantity_ordered`")
    private Integer quantityOrdered;

    /**
     * 已配送的商品数量
     */
    @Column(name = "`quantity_shipped`")
    private Integer quantityShipped;

    /**
     * 货币代码
     */
    @Column(name = "`item_cc`")
    private String itemCc;

    /**
     * 订单商品的售价，单位分
     */
    @Column(name = "`item_amount`")
    private Integer itemAmount;

    /**
     * 订单商品的售价,单位美分（估值）
     */
    @Column(name = "`item_to_dollar`")
    private Integer itemToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`shipping_cc`")
    private String shippingCc;

    /**
     * 运费，单位分
     */
    @Column(name = "`shipping_amount`")
    private Integer shippingAmount;

    /**
     * 运费，单位美分
     */
    @Column(name = "`shipping_to_dollar`")
    private Integer shippingToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`gift_wrap_cc`")
    private String giftWrapCc;

    /**
     * 商品的礼品包装费
     */
    @Column(name = "`gift_wrap_amount`")
    private Integer giftWrapAmount;

    /**
     * 商品的礼品包装费,美分估值
     */
    @Column(name = "`gift_wrap_to_dollar`")
    private Integer giftWrapToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`item_tax_cc`")
    private String itemTaxCc;

    /**
     * 商品价格的税费
     */
    @Column(name = "`item_tax_amount`")
    private Integer itemTaxAmount;

    /**
     * 商品价格的税费,美分估值
     */
    @Column(name = "`item_tax_to_dollar`")
    private Integer itemTaxToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`shipping_tax_cc`")
    private String shippingTaxCc;

    /**
     * 运费的税费
     */
    @Column(name = "`shipping_tax_amount`")
    private Integer shippingTaxAmount;

    /**
     * 运费的税费,美分估值
     */
    @Column(name = "`shipping_tax_to_dollar`")
    private Integer shippingTaxToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`gift_warp_tax_cc`")
    private String giftWarpTaxCc;

    /**
     * 礼品包装费的税费
     */
    @Column(name = "`gift_warp_tax_amount`")
    private Integer giftWarpTaxAmount;

    /**
     * 礼品包装费的税费,美分估值
     */
    @Column(name = "`gift_warp_tax_to_dollar`")
    private Integer giftWarpTaxToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`shipping_discount_cc`")
    private String shippingDiscountCc;

    /**
     * 运费的折扣
     */
    @Column(name = "`shipping_discount_amount`")
    private Integer shippingDiscountAmount;

    /**
     * 运费的折扣,美分估值
     */
    @Column(name = "`shipping_discount_to_dollar`")
    private Integer shippingDiscountToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`promotion_discount_cc`")
    private String promotionDiscountCc;

    /**
     * 报价中的全部促销折扣总计
     */
    @Column(name = "`promotion_discount_amount`")
    private Integer promotionDiscountAmount;

    /**
     * 报价中的全部促销折扣总计,美分估值
     */
    @Column(name = "`promotion_discount_to_dollar`")
    private Integer promotionDiscountToDollar;

    /**
     * promotionId 元素列表,逗号拼接
     */
    @Column(name = "`promotion_ids`")
    private String promotionIds;

    /**
     * 货币代码
     */
    @Column(name = "`cod_fee_cc`")
    private String codFeeCc;

    /**
     * COD 服务费用
     */
    @Column(name = "`cod_fee_amount`")
    private Integer codFeeAmount;

    /**
     * COD 服务费用,美分估值
     */
    @Column(name = "`cod_fee_to_dollar`")
    private Integer codFeeToDollar;

    /**
     * 货币代码
     */
    @Column(name = "`cod_fee_discount_cc`")
    private String codFeeDiscountCc;

    /**
     * 货到付款费用的折扣
     */
    @Column(name = "`cod_fee_discount_amount`")
    private Integer codFeeDiscountAmount;

    /**
     * 货到付款费用的折扣,美分折算
     */
    @Column(name = "`cod_fee_discount_to_dollar`")
    private Integer codFeeDiscountToDollar;

    /**
     * 买家指定的礼品包装等级
     */
    @Column(name = "`gift_wrap_level`")
    private String giftWrapLevel;

    /**
     * 商品的状况
     */
    @Column(name = "`condition_id`")
    private String conditionId;

    /**
     * 商品的子状况
     */
    @Column(name = "`condition_subtype_id`")
    private String conditionSubtypeId;

    /**
     * 订单预约送货上门的开始日期（目的地时区）
     */
    @Column(name = "`scheduled_delivery_start_date`")
    private String scheduledDeliveryStartDate;

    /**
     * 订单预约送货上门的终止日期（目的地时区）
     */
    @Column(name = "`scheduled_delivery_end_date`")
    private String scheduledDeliveryEndDate;

    /**
     * 送达时间
     */
    @Column(name = "`shipment_date`")
    private Integer shipmentDate;

    /**
     * 送达时间原始字符串
     */
    @Column(name = "`shipment_date_str`")
    private String shipmentDateStr;

    /**
     * 买家提供的礼品消息
     */
    @Column(name = "`gift_message_text`")
    private String giftMessageText;

    /**
     * 卖家描述的商品状况
     */
    @Column(name = "`condition_note`")
    private String conditionNote;

    /**
     * 获取亚马逊卖家id
     *
     * @return seller_id - 亚马逊卖家id
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * 设置亚马逊卖家id
     *
     * @param sellerId 亚马逊卖家id
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 获取亚马逊所定义的订单编码
     *
     * @return amazon_order_id - 亚马逊所定义的订单编码
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * 设置亚马逊所定义的订单编码
     *
     * @param amazonOrderId 亚马逊所定义的订单编码
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * 获取主键，亚马逊定义的订单商品识别号
     *
     * @return order_item_id - 主键，亚马逊定义的订单商品识别号
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * 设置主键，亚马逊定义的订单商品识别号
     *
     * @param orderItemId 主键，亚马逊定义的订单商品识别号
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 获取卖家主账号
     *
     * @return uid - 卖家主账号
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置卖家主账号
     *
     * @param uid 卖家主账号
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取数据拉取时间
     *
     * @return pull_data_time - 数据拉取时间
     */
    public Integer getPullDataTime() {
        return pullDataTime;
    }

    /**
     * 设置数据拉取时间
     *
     * @param pullDataTime 数据拉取时间
     */
    public void setPullDataTime(Integer pullDataTime) {
        this.pullDataTime = pullDataTime;
    }

    /**
     * 获取数据更新时间
     *
     * @return update_data_time - 数据更新时间
     */
    public Integer getUpdateDataTime() {
        return updateDataTime;
    }

    /**
     * 设置数据更新时间
     *
     * @param updateDataTime 数据更新时间
     */
    public void setUpdateDataTime(Integer updateDataTime) {
        this.updateDataTime = updateDataTime;
    }

    /**
     * 获取商品的亚马逊标准识别号 (ASIN)
     *
     * @return asin - 商品的亚马逊标准识别号 (ASIN)
     */
    public String getAsin() {
        return asin;
    }

    /**
     * 设置商品的亚马逊标准识别号 (ASIN)
     *
     * @param asin 商品的亚马逊标准识别号 (ASIN)
     */
    public void setAsin(String asin) {
        this.asin = asin;
    }

    /**
     * 获取商品的卖家 SKU
     *
     * @return seller_sku - 商品的卖家 SKU
     */
    public String getSellerSku() {
        return sellerSku;
    }

    /**
     * 设置商品的卖家 SKU
     *
     * @param sellerSku 商品的卖家 SKU
     */
    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    /**
     * 获取商品名称
     *
     * @return title - 商品名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品名称
     *
     * @param title 商品名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取下面两个子元素的父元素
     *
     * @return quantity_ordered - 下面两个子元素的父元素
     */
    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * 设置下面两个子元素的父元素
     *
     * @param quantityOrdered 下面两个子元素的父元素
     */
    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    /**
     * 获取已配送的商品数量
     *
     * @return quantity_shipped - 已配送的商品数量
     */
    public Integer getQuantityShipped() {
        return quantityShipped;
    }

    /**
     * 设置已配送的商品数量
     *
     * @param quantityShipped 已配送的商品数量
     */
    public void setQuantityShipped(Integer quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    /**
     * 获取货币代码
     *
     * @return item_cc - 货币代码
     */
    public String getItemCc() {
        return itemCc;
    }

    /**
     * 设置货币代码
     *
     * @param itemCc 货币代码
     */
    public void setItemCc(String itemCc) {
        this.itemCc = itemCc;
    }

    /**
     * 获取订单商品的售价，单位分
     *
     * @return item_amount - 订单商品的售价，单位分
     */
    public Integer getItemAmount() {
        return itemAmount;
    }

    /**
     * 设置订单商品的售价，单位分
     *
     * @param itemAmount 订单商品的售价，单位分
     */
    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
        this.itemToDollar = itemAmount;
    }

    /**
     * 获取订单商品的售价,单位美分（估值）
     *
     * @return item_to_dollar - 订单商品的售价,单位美分（估值）
     */
    public Integer getItemToDollar() {
        return itemToDollar;
    }

    /**
     * 设置订单商品的售价,单位美分（估值）
     *
     * @param itemToDollar 订单商品的售价,单位美分（估值）
     */
    public void setItemToDollar(Integer itemToDollar) {
        this.itemToDollar = itemToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return shipping_cc - 货币代码
     */
    public String getShippingCc() {
        return shippingCc;
    }

    /**
     * 设置货币代码
     *
     * @param shippingCc 货币代码
     */
    public void setShippingCc(String shippingCc) {
        this.shippingCc = shippingCc;
    }

    /**
     * 获取运费，单位分
     *
     * @return shipping_amount - 运费，单位分
     */
    public Integer getShippingAmount() {
        return shippingAmount;
    }

    /**
     * 设置运费，单位分
     *
     * @param shippingAmount 运费，单位分
     */
    public void setShippingAmount(Integer shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    /**
     * 获取运费，单位美分
     *
     * @return shipping_to_dollar - 运费，单位美分
     */
    public Integer getShippingToDollar() {
        return shippingToDollar;
    }

    /**
     * 设置运费，单位美分
     *
     * @param shippingToDollar 运费，单位美分
     */
    public void setShippingToDollar(Integer shippingToDollar) {
        this.shippingToDollar = shippingToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return gift_wrap_cc - 货币代码
     */
    public String getGiftWrapCc() {
        return giftWrapCc;
    }

    /**
     * 设置货币代码
     *
     * @param giftWrapCc 货币代码
     */
    public void setGiftWrapCc(String giftWrapCc) {
        this.giftWrapCc = giftWrapCc;
    }

    /**
     * 获取商品的礼品包装费
     *
     * @return gift_wrap_amount - 商品的礼品包装费
     */
    public Integer getGiftWrapAmount() {
        return giftWrapAmount;
    }

    /**
     * 设置商品的礼品包装费
     *
     * @param giftWrapAmount 商品的礼品包装费
     */
    public void setGiftWrapAmount(Integer giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }

    /**
     * 获取商品的礼品包装费,美分估值
     *
     * @return gift_wrap_to_dollar - 商品的礼品包装费,美分估值
     */
    public Integer getGiftWrapToDollar() {
        return giftWrapToDollar;
    }

    /**
     * 设置商品的礼品包装费,美分估值
     *
     * @param giftWrapToDollar 商品的礼品包装费,美分估值
     */
    public void setGiftWrapToDollar(Integer giftWrapToDollar) {
        this.giftWrapToDollar = giftWrapToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return item_tax_cc - 货币代码
     */
    public String getItemTaxCc() {
        return itemTaxCc;
    }

    /**
     * 设置货币代码
     *
     * @param itemTaxCc 货币代码
     */
    public void setItemTaxCc(String itemTaxCc) {
        this.itemTaxCc = itemTaxCc;
    }

    /**
     * 获取商品价格的税费
     *
     * @return item_tax_amount - 商品价格的税费
     */
    public Integer getItemTaxAmount() {
        return itemTaxAmount;
    }

    /**
     * 设置商品价格的税费
     *
     * @param itemTaxAmount 商品价格的税费
     */
    public void setItemTaxAmount(Integer itemTaxAmount) {
        this.itemTaxAmount = itemTaxAmount;
    }

    /**
     * 获取商品价格的税费,美分估值
     *
     * @return item_tax_to_dollar - 商品价格的税费,美分估值
     */
    public Integer getItemTaxToDollar() {
        return itemTaxToDollar;
    }

    /**
     * 设置商品价格的税费,美分估值
     *
     * @param itemTaxToDollar 商品价格的税费,美分估值
     */
    public void setItemTaxToDollar(Integer itemTaxToDollar) {
        this.itemTaxToDollar = itemTaxToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return shipping_tax_cc - 货币代码
     */
    public String getShippingTaxCc() {
        return shippingTaxCc;
    }

    /**
     * 设置货币代码
     *
     * @param shippingTaxCc 货币代码
     */
    public void setShippingTaxCc(String shippingTaxCc) {
        this.shippingTaxCc = shippingTaxCc;
    }

    /**
     * 获取运费的税费
     *
     * @return shipping_tax_amount - 运费的税费
     */
    public Integer getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    /**
     * 设置运费的税费
     *
     * @param shippingTaxAmount 运费的税费
     */
    public void setShippingTaxAmount(Integer shippingTaxAmount) {
        this.shippingTaxAmount = shippingTaxAmount;
    }

    /**
     * 获取运费的税费,美分估值
     *
     * @return shipping_tax_to_dollar - 运费的税费,美分估值
     */
    public Integer getShippingTaxToDollar() {
        return shippingTaxToDollar;
    }

    /**
     * 设置运费的税费,美分估值
     *
     * @param shippingTaxToDollar 运费的税费,美分估值
     */
    public void setShippingTaxToDollar(Integer shippingTaxToDollar) {
        this.shippingTaxToDollar = shippingTaxToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return gift_warp_tax_cc - 货币代码
     */
    public String getGiftWarpTaxCc() {
        return giftWarpTaxCc;
    }

    /**
     * 设置货币代码
     *
     * @param giftWarpTaxCc 货币代码
     */
    public void setGiftWarpTaxCc(String giftWarpTaxCc) {
        this.giftWarpTaxCc = giftWarpTaxCc;
    }

    /**
     * 获取礼品包装费的税费
     *
     * @return gift_warp_tax_amount - 礼品包装费的税费
     */
    public Integer getGiftWarpTaxAmount() {
        return giftWarpTaxAmount;
    }

    /**
     * 设置礼品包装费的税费
     *
     * @param giftWarpTaxAmount 礼品包装费的税费
     */
    public void setGiftWarpTaxAmount(Integer giftWarpTaxAmount) {
        this.giftWarpTaxAmount = giftWarpTaxAmount;
    }

    /**
     * 获取礼品包装费的税费,美分估值
     *
     * @return gift_warp_tax_to_dollar - 礼品包装费的税费,美分估值
     */
    public Integer getGiftWarpTaxToDollar() {
        return giftWarpTaxToDollar;
    }

    /**
     * 设置礼品包装费的税费,美分估值
     *
     * @param giftWarpTaxToDollar 礼品包装费的税费,美分估值
     */
    public void setGiftWarpTaxToDollar(Integer giftWarpTaxToDollar) {
        this.giftWarpTaxToDollar = giftWarpTaxToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return shipping_discount_cc - 货币代码
     */
    public String getShippingDiscountCc() {
        return shippingDiscountCc;
    }

    /**
     * 设置货币代码
     *
     * @param shippingDiscountCc 货币代码
     */
    public void setShippingDiscountCc(String shippingDiscountCc) {
        this.shippingDiscountCc = shippingDiscountCc;
    }

    /**
     * 获取运费的折扣
     *
     * @return shipping_discount_amount - 运费的折扣
     */
    public Integer getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    /**
     * 设置运费的折扣
     *
     * @param shippingDiscountAmount 运费的折扣
     */
    public void setShippingDiscountAmount(Integer shippingDiscountAmount) {
        this.shippingDiscountAmount = shippingDiscountAmount;
    }

    /**
     * 获取运费的折扣,美分估值
     *
     * @return shipping_discount_to_dollar - 运费的折扣,美分估值
     */
    public Integer getShippingDiscountToDollar() {
        return shippingDiscountToDollar;
    }

    /**
     * 设置运费的折扣,美分估值
     *
     * @param shippingDiscountToDollar 运费的折扣,美分估值
     */
    public void setShippingDiscountToDollar(Integer shippingDiscountToDollar) {
        this.shippingDiscountToDollar = shippingDiscountToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return promotion_discount_cc - 货币代码
     */
    public String getPromotionDiscountCc() {
        return promotionDiscountCc;
    }

    /**
     * 设置货币代码
     *
     * @param promotionDiscountCc 货币代码
     */
    public void setPromotionDiscountCc(String promotionDiscountCc) {
        this.promotionDiscountCc = promotionDiscountCc;
    }

    /**
     * 获取报价中的全部促销折扣总计
     *
     * @return promotion_discount_amount - 报价中的全部促销折扣总计
     */
    public Integer getPromotionDiscountAmount() {
        return promotionDiscountAmount;
    }

    /**
     * 设置报价中的全部促销折扣总计
     *
     * @param promotionDiscountAmount 报价中的全部促销折扣总计
     */
    public void setPromotionDiscountAmount(Integer promotionDiscountAmount) {
        this.promotionDiscountAmount = promotionDiscountAmount;
    }

    /**
     * 获取报价中的全部促销折扣总计,美分估值
     *
     * @return promotion_discount_to_dollar - 报价中的全部促销折扣总计,美分估值
     */
    public Integer getPromotionDiscountToDollar() {
        return promotionDiscountToDollar;
    }

    /**
     * 设置报价中的全部促销折扣总计,美分估值
     *
     * @param promotionDiscountToDollar 报价中的全部促销折扣总计,美分估值
     */
    public void setPromotionDiscountToDollar(Integer promotionDiscountToDollar) {
        this.promotionDiscountToDollar = promotionDiscountToDollar;
    }

    /**
     * 获取promotionId 元素列表,逗号拼接
     *
     * @return promotion_ids - promotionId 元素列表,逗号拼接
     */
    public String getPromotionIds() {
        return promotionIds;
    }

    /**
     * 设置promotionId 元素列表,逗号拼接
     *
     * @param promotionIds promotionId 元素列表,逗号拼接
     */
    public void setPromotionIds(String promotionIds) {
        this.promotionIds = promotionIds;
    }

    /**
     * 获取货币代码
     *
     * @return cod_fee_cc - 货币代码
     */
    public String getCodFeeCc() {
        return codFeeCc;
    }

    /**
     * 设置货币代码
     *
     * @param codFeeCc 货币代码
     */
    public void setCodFeeCc(String codFeeCc) {
        this.codFeeCc = codFeeCc;
    }

    /**
     * 获取COD 服务费用
     *
     * @return cod_fee_amount - COD 服务费用
     */
    public Integer getCodFeeAmount() {
        return codFeeAmount;
    }

    /**
     * 设置COD 服务费用
     *
     * @param codFeeAmount COD 服务费用
     */
    public void setCodFeeAmount(Integer codFeeAmount) {
        this.codFeeAmount = codFeeAmount;
    }

    /**
     * 获取COD 服务费用,美分估值
     *
     * @return cod_fee_to_dollar - COD 服务费用,美分估值
     */
    public Integer getCodFeeToDollar() {
        return codFeeToDollar;
    }

    /**
     * 设置COD 服务费用,美分估值
     *
     * @param codFeeToDollar COD 服务费用,美分估值
     */
    public void setCodFeeToDollar(Integer codFeeToDollar) {
        this.codFeeToDollar = codFeeToDollar;
    }

    /**
     * 获取货币代码
     *
     * @return cod_fee_discount_cc - 货币代码
     */
    public String getCodFeeDiscountCc() {
        return codFeeDiscountCc;
    }

    /**
     * 设置货币代码
     *
     * @param codFeeDiscountCc 货币代码
     */
    public void setCodFeeDiscountCc(String codFeeDiscountCc) {
        this.codFeeDiscountCc = codFeeDiscountCc;
    }

    /**
     * 获取货到付款费用的折扣
     *
     * @return cod_fee_discount_amount - 货到付款费用的折扣
     */
    public Integer getCodFeeDiscountAmount() {
        return codFeeDiscountAmount;
    }

    /**
     * 设置货到付款费用的折扣
     *
     * @param codFeeDiscountAmount 货到付款费用的折扣
     */
    public void setCodFeeDiscountAmount(Integer codFeeDiscountAmount) {
        this.codFeeDiscountAmount = codFeeDiscountAmount;
    }

    /**
     * 获取货到付款费用的折扣,美分折算
     *
     * @return cod_fee_discount_to_dollar - 货到付款费用的折扣,美分折算
     */
    public Integer getCodFeeDiscountToDollar() {
        return codFeeDiscountToDollar;
    }

    /**
     * 设置货到付款费用的折扣,美分折算
     *
     * @param codFeeDiscountToDollar 货到付款费用的折扣,美分折算
     */
    public void setCodFeeDiscountToDollar(Integer codFeeDiscountToDollar) {
        this.codFeeDiscountToDollar = codFeeDiscountToDollar;
    }

    /**
     * 获取买家指定的礼品包装等级
     *
     * @return gift_wrap_level - 买家指定的礼品包装等级
     */
    public String getGiftWrapLevel() {
        return giftWrapLevel;
    }

    /**
     * 设置买家指定的礼品包装等级
     *
     * @param giftWrapLevel 买家指定的礼品包装等级
     */
    public void setGiftWrapLevel(String giftWrapLevel) {
        this.giftWrapLevel = giftWrapLevel;
    }

    /**
     * 获取商品的状况
     *
     * @return condition_id - 商品的状况
     */
    public String getConditionId() {
        return conditionId;
    }

    /**
     * 设置商品的状况
     *
     * @param conditionId 商品的状况
     */
    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    /**
     * 获取商品的子状况
     *
     * @return condition_subtype_id - 商品的子状况
     */
    public String getConditionSubtypeId() {
        return conditionSubtypeId;
    }

    /**
     * 设置商品的子状况
     *
     * @param conditionSubtypeId 商品的子状况
     */
    public void setConditionSubtypeId(String conditionSubtypeId) {
        this.conditionSubtypeId = conditionSubtypeId;
    }

    /**
     * 获取订单预约送货上门的开始日期（目的地时区）
     *
     * @return scheduled_delivery_start_date - 订单预约送货上门的开始日期（目的地时区）
     */
    public String getScheduledDeliveryStartDate() {
        return scheduledDeliveryStartDate;
    }

    /**
     * 设置订单预约送货上门的开始日期（目的地时区）
     *
     * @param scheduledDeliveryStartDate 订单预约送货上门的开始日期（目的地时区）
     */
    public void setScheduledDeliveryStartDate(String scheduledDeliveryStartDate) {
        this.scheduledDeliveryStartDate = scheduledDeliveryStartDate;
    }

    /**
     * 获取订单预约送货上门的终止日期（目的地时区）
     *
     * @return scheduled_delivery_end_date - 订单预约送货上门的终止日期（目的地时区）
     */
    public String getScheduledDeliveryEndDate() {
        return scheduledDeliveryEndDate;
    }

    /**
     * 设置订单预约送货上门的终止日期（目的地时区）
     *
     * @param scheduledDeliveryEndDate 订单预约送货上门的终止日期（目的地时区）
     */
    public void setScheduledDeliveryEndDate(String scheduledDeliveryEndDate) {
        this.scheduledDeliveryEndDate = scheduledDeliveryEndDate;
    }

    /**
     * 获取送达时间
     *
     * @return shipment_date - 送达时间
     */
    public Integer getShipmentDate() {
        return shipmentDate;
    }

    /**
     * 设置送达时间
     *
     * @param shipmentDate 送达时间
     */
    public void setShipmentDate(Integer shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    /**
     * 获取送达时间原始字符串
     *
     * @return shipment_date_str - 送达时间原始字符串
     */
    public String getShipmentDateStr() {
        return shipmentDateStr;
    }

    /**
     * 设置送达时间原始字符串
     *
     * @param shipmentDateStr 送达时间原始字符串
     */
    public void setShipmentDateStr(String shipmentDateStr) {
        this.shipmentDateStr = shipmentDateStr;
    }

    /**
     * 获取买家提供的礼品消息
     *
     * @return gift_message_text - 买家提供的礼品消息
     */
    public String getGiftMessageText() {
        return giftMessageText;
    }

    /**
     * 设置买家提供的礼品消息
     *
     * @param giftMessageText 买家提供的礼品消息
     */
    public void setGiftMessageText(String giftMessageText) {
        this.giftMessageText = giftMessageText;
    }

    /**
     * 获取卖家描述的商品状况
     *
     * @return condition_note - 卖家描述的商品状况
     */
    public String getConditionNote() {
        return conditionNote;
    }

    /**
     * 设置卖家描述的商品状况
     *
     * @param conditionNote 卖家描述的商品状况
     */
    public void setConditionNote(String conditionNote) {
        this.conditionNote = conditionNote;
    }
}