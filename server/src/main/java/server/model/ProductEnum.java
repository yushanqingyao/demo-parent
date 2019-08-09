package server.model;

public enum ProductEnum {
    B009PCI2JU(4999,"GE RPWFE Refrigerator Water Filter"),
    B00AREGVUM(2249,"Bio-Oil 200ml: Multiuse Skincare Oil (6.7oz)"),
    B07K8XFSJZ(5299,"Samsung DA29-00020B, HAF-CIN/EXP Premium Refrigerator Water Filter (White, 2 pack)"),
    B003FBG88E(1445,"Conair 1875 Watt Full Size Pro Hair Dryer with Ionic Conditioning, Black/Chrome"),
    B07H7SGQ52(11499,"Vremi Countertop Ice Maker - Ice Cubes Ready in 9 Minutes - Makes 26 Pounds Ice in 24 hrs - Perfect for Water Bottles, Mixed Drinks - Portable Stainless Steel Ice Maker with Ice Scoop and Basket"),
    B07Q33HD6X(12099,"IKICH Portable Ice Maker Machine for Countertop, Ice Cubes Ready in 6 Mins, Make 26 lbs Ice in 24 Hrs with LED Display Perfect for Parties Mixed Drinks, Electric Ice Maker 2L with Ice Scoop and Basket"),
    B007NG5UEU(3846,"VTech DM221-2 Audio Baby Monitor with up to 1,000 ft of Range, Vibrating Sound-Alert, Talk Back Intercom, Night Light Loop & Two Parent Units"),
    B07J3Z183R(1995,"Max Strength Pro Replacement Water Filters 6pc Set Fits Brita Pitchers & Dispensers, 6 Month Filter Supply, BPA Free, Fits Brita Classic, Mavea Classic, Atlantis, Bella, Slim, Soho & Many More!"),
    B003F2T0M4(1599,"INFINITIPRO BY CONAIR Tourmaline Ceramic Curling Wand"),
    B00FNQRCS4(2499,"INFINITIPRO BY CONAIR 1875 Watt Salon Performance AC Motor Styling Tool/Hair Dryer; Orange"),
    B003FBI9LS(1679,"Bed Head Wave Artist Deep Waver for Beachy Waves"),
    B007NG5UF4(3995,"VTech DM221 Audio Baby Monitor with up to 1,000 ft of Range, Vibrating Sound-Alert, Talk Back Intercom & Night Light Loop"),
    B0786TJC33(27999,"hOmeLabs Beverage Refrigerator and Cooler - 120 Can Mini Fridge with Glass Door for Soda Beer or Wine - Small Drink Dispenser Machine for Office or Bar with Adjustable Removable Shelves"),
    B00E68O4JU(4850,"INFINITIPRO BY CONAIR Curl Secret, Purple"),
    B073PLT7TY(1299,"Kitchen Basics 101 Chrome Drip Pan Set Replacement for Frigidaire Kenmore 316048413 and 316048414: 2 ea 6” and 8"),
    B000F5CDP0(1998,"INFINITIPRO BY CONAIR Nano Tourmaline Ceramic Curling Iron, 1-Inch Curling Iron"),
    B07N6MT8Y1(6498,"Kenmore 09083 Replacement Refrigerator Filter - 9083 (Pack of 2)"),
    B009ZPMPGI(1114,"Conair 1875 Watt Cord Keeper Hair Dryer with Folding Handle and Retractable Cord, Travel Hair Dryer, Teal"),
    B007S69QAY(2998,"Conair Xtreme Instant Heat Jumbo And Super Jumbo Hot Rollers; Bonus Super Clips Included - Amazon Exclusive"),
    B012H64VVS(3039,"INFINITIPRO BY CONAIR 1875 Watt Salon Performance AC Motor Styling Tool/Hair Dryer; Orange"),
    B00LEW33X4(3999,"INFINITIPRO BY CONAIR 1875 Watt Salon Performance AC Motor Styling Tool/Hair Dryer; Orange"),
    B00FU574H2(3302,"INFINITIPRO BY CONAIR 1875 Watt Salon Performance AC Motor Styling Tool/Hair Dryer; Orange"),
    B00CNX3AC2(3499,"INFINITIPRO BY CONAIR 1875 Watt Salon Performance AC Motor Styling Tool/Hair Dryer; Orange"),
    B0199STDWO(2999,"INFINITIPRO BY CONAIR 1875 Watt Salon Performance AC Motor Styling Tool/Hair Dryer; Orange"),
    B01KXNCPU6(2155,"Conair 1875 Watt Full Size Pro Hair Dryer with Ionic Conditioning, Black/Chrome");
    /**
     * 美分
     */
    private int price;
    private String subject;

    ProductEnum(int price,String subject) {
        this.price = price;
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public String getSubject() {
        return subject;
    }
}
