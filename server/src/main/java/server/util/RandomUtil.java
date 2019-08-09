package server.util;

import server.model.ProductEnum;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomUtil {

    public static final String[] comment = {"Horrible", "Na", "Bien", "ok", "Okay", "The back of the item was scratched up. Very dissatisfied", "No comment", "Worked for one day only"};

    private static int random = (int) (Math.random() * 10);// 生成种子
    private static Random rand = new Random(random);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }


    public static int random(int a, int b) {
        if (a > b) {
            int i = a - b;
            return rand.nextInt(i) + b;
        } else if (b > a) {
            int i = b - a;
            return rand.nextInt(i) + a;
        } else {
            return a;
        }
    }

    public static int latestWeek() {
        return latestNumDay(7);
    }


    public static int latestNumDay(int num) {
        long l = System.currentTimeMillis();
        return random((int) (l / 1000), (int) ((l / 1000) - 3600 * 24 * num));
    }

    /**
     * 随机返回一个时间戳 单位秒
     *
     * @return
     */
    public static int random() {
        Integer[] arr = {7, 30, 60, 60, 60, 300, 300, 300, 300, 300};
        Integer random = random(arr);
        return latestNumDay(random);
    }

    public static String randomComment() {
        return random(comment);
    }

    public static ProductEnum randomProduct() {
        return random(ProductEnum.class);
    }

    public static int randomRetuenDate(Integer purchaseDate) {
        Integer a = purchaseDate + 3600 * 24 * 2;
        Integer b = purchaseDate + 3600 * 24 * 30;

        long l = System.currentTimeMillis();
        if ((b * 1000L) > l) {
            b = purchaseDate + 3600 * 24 * 6;
        }
        return random(a, b);
    }

    public static String randomFeedbackDate(Integer purchaseDate) {
        int i = randomRetuenDate(purchaseDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date((i * 1000L)));
    }

    public static Float randomRating() {
        Float[] arr = {new Float(1), new Float(2), new Float(3)};
        return random(arr);
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10000; i++) {
//            Date date = new Date(random() * 1000L);
//            System.out.println(DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss"));
//        }
//
//        for (int i = 0; i < 30; i++) {
//            System.out.println(randomComment());
//            System.out.println(randomProduct());
//        }
//    }

}
