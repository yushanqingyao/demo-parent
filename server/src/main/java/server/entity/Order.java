package server.entity;

import javax.persistence.*;

@Table(name = "`amazon_order_16bbc787af901`")
public class Order {
    /**
     * 亚马逊卖家id
     */
    @Id
    @Column(name = "`seller_id`")
    private String sellerId;

    /**
     * 亚马逊订单号
     */
    @Id
    @Column(name = "`amazon_order_id`")
    private String amazonOrderId;

    /**
     * 卖家主账号
     */
    @Column(name = "`uid`")
    private String uid;

    /**
     * 是否发生退款
     */
    @Column(name = "`refund_status`")
    private Boolean refundStatus;

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
     * 订单生成所在商城的匿名编码
     */
    @Column(name = "`marketplace_id`")
    private String marketplaceId;

    /**
     * {marketplace_id}_{seller_id}
     */
    @Column(name = "`store_code`")
    private String storeCode;

    /**
     * 卖家所定义的订单编码
     */
    @Column(name = "`seller_order_id`")
    private String sellerOrderId;

    /**
     * 创建订单的日期
     */
    @Column(name = "`purchase_date`")
    private Integer purchaseDate;

    /**
     * 订单创建时间原始字符串
     */
    @Column(name = "`purchase_date_str`")
    private String purchaseDateStr;

    /**
     * 订单的最后更新日期
     */
    @Column(name = "`last_update_date`")
    private Integer lastUpdateDate;

    /**
     * 订单状态
     */
    @Column(name = "`order_status`")
    private String orderStatus;

    /**
     * 订单配送方式：亚马逊配送 (AFN) 或卖家自行配送 (MFN)
     */
    @Column(name = "`fulfillment_channel`")
    private String fulfillmentChannel;

    /**
     * 订单中第一件商品的销售渠道
     */
    @Column(name = "`sales_channel`")
    private String salesChannel;

    /**
     * 订单中第一件商品的订单渠道
     */
    @Column(name = "`order_channel`")
    private String orderChannel;

    /**
     * 货件服务水平
     */
    @Column(name = "`ship_service_level`")
    private String shipServiceLevel;

    /**
     * 货币代码
     */
    @Column(name = "`cc`")
    private String cc;

    /**
     * 金额，单位分
     */
    @Column(name = "`amount`")
    private Integer amount;

    /**
     * 转化成美分，估值
     */
    @Column(name = "`to_dollar`")
    private Integer toDollar;

    /**
     * 已配送的商品数量
     */
    @Column(name = "`number_of_items_shipped`")
    private Integer numberOfItemsShipped;

    /**
     * 未配送的商品数量
     */
    @Column(name = "`number_of_items_unshipped`")
    private Integer numberOfItemsUnshipped;

    /**
     * 订单的主要付款方式
     */
    @Column(name = "`payment_method`")
    private String paymentMethod;

    /**
     * 买家的匿名电子邮件地址
     */
    @Column(name = "`buyer_email`")
    private String buyerEmail;

    /**
     * 买家姓名
     */
    @Column(name = "`buyer_name`")
    private String buyerName;

    /**
     * 订单的配送服务级别分类
     */
    @Column(name = "`shipment_service_level_category`")
    private String shipmentServiceLevelCategory;

    /**
     * 指明订单配送方是否是亚马逊配送 (Amazon TFM) 服务
     */
    @Column(name = "`shipped_by_amazon_tfm`")
    private Boolean shippedByAmazonTfm;

    /**
     * 亚马逊 TFM订单的状态,仅当ShippedByAmazonTFM = True时返回
     */
    @Column(name = "`tfm_shipment_status`")
    private String tfmShipmentStatus;

    /**
     * 卖家自定义的配送方式，属于Checkout by Amazon (CBA) 所支持的四种标准配送设置中的一种
     */
    @Column(name = "`cba_displayable_shipping_label`")
    private String cbaDisplayableShippingLabel;

    /**
     * 订单类型
     */
    @Column(name = "`order_type`")
    private String orderType;

    /**
     * 卖家承诺的订单发货时间范围的第一天,仅对卖家配送网络 (MFN) 订单返回
     */
    @Column(name = "`earliest_ship_date`")
    private Integer earliestShipDate;

    /**
     * 卖家承诺的订单发货时间范围的第一天原始字符串
     */
    @Column(name = "`earliest_ship_date_str`")
    private String earliestShipDateStr;

    /**
     * 卖家承诺的订单发货时间范围的最后一天,对卖家配送网络 (MFN)和亚马逊物流 (AFN) 订单返回
     */
    @Column(name = "`latest_ship_date`")
    private Integer latestShipDate;

    /**
     * 卖家承诺的订单发货时间范围的最后一天原始字符串
     */
    @Column(name = "`latest_ship_date_str`")
    private String latestShipDateStr;

    /**
     * 卖家承诺的订单送达时间范围的第一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     */
    @Column(name = "`earliest_delivery_date`")
    private Integer earliestDeliveryDate;

    /**
     * 卖家承诺的订单送达时间范围的第一天原始字符串
     */
    @Column(name = "`earliest_delivery_date_str`")
    private String earliestDeliveryDateStr;

    /**
     * 卖家承诺的订单送达时间范围的最后一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     */
    @Column(name = "`latest_delivery_date`")
    private Integer latestDeliveryDate;

    /**
     * 卖家承诺的订单送达时间范围的最后一天原始字符串
     */
    @Column(name = "`latest_delivery_date_str`")
    private String latestDeliveryDateStr;

    /**
     * 订单的配送的收件人
     */
    @Column(name = "`shipping_name`")
    private String shippingName;

    /**
     * 订单的配送的收件电话
     */
    @Column(name = "`shipping_phone`")
    private String shippingPhone;

    @Column(name = "`purchase_order_number`")
    private String purchaseOrderNumber;

    @Column(name = "`is_business_order`")
    private Boolean isBusinessOrder;

    @Column(name = "`is_premium_order`")
    private Boolean isPremiumOrder;

    @Column(name = "`is_prime`")
    private Boolean isPrime;

    /**
     * 标签，多个标签逗号分隔
     */
    @Column(name = "`labels`")
    private String labels;

    /**
     * 扩展
     */
    @Column(name = "`ext`")
    private String ext;

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
     * 获取亚马逊订单号
     *
     * @return amazon_order_id - 亚马逊订单号
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * 设置亚马逊订单号
     *
     * @param amazonOrderId 亚马逊订单号
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
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
     * 获取是否发生退款
     *
     * @return refund_status - 是否发生退款
     */
    public Boolean getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置是否发生退款
     *
     * @param refundStatus 是否发生退款
     */
    public void setRefundStatus(Boolean refundStatus) {
        this.refundStatus = refundStatus;
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
     * 获取订单生成所在商城的匿名编码
     *
     * @return marketplace_id - 订单生成所在商城的匿名编码
     */
    public String getMarketplaceId() {
        return marketplaceId;
    }

    /**
     * 设置订单生成所在商城的匿名编码
     *
     * @param marketplaceId 订单生成所在商城的匿名编码
     */
    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    /**
     * 获取{marketplace_id}_{seller_id}
     *
     * @return store_code - {marketplace_id}_{seller_id}
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 设置{marketplace_id}_{seller_id}
     *
     * @param storeCode {marketplace_id}_{seller_id}
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
     * 获取卖家所定义的订单编码
     *
     * @return seller_order_id - 卖家所定义的订单编码
     */
    public String getSellerOrderId() {
        return sellerOrderId;
    }

    /**
     * 设置卖家所定义的订单编码
     *
     * @param sellerOrderId 卖家所定义的订单编码
     */
    public void setSellerOrderId(String sellerOrderId) {
        this.sellerOrderId = sellerOrderId;
    }

    /**
     * 获取创建订单的日期
     *
     * @return purchase_date - 创建订单的日期
     */
    public Integer getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * 设置创建订单的日期
     *
     * @param purchaseDate 创建订单的日期
     */
    public void setPurchaseDate(Integer purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * 获取订单创建时间原始字符串
     *
     * @return purchase_date_str - 订单创建时间原始字符串
     */
    public String getPurchaseDateStr() {
        return purchaseDateStr;
    }

    /**
     * 设置订单创建时间原始字符串
     *
     * @param purchaseDateStr 订单创建时间原始字符串
     */
    public void setPurchaseDateStr(String purchaseDateStr) {
        this.purchaseDateStr = purchaseDateStr;
    }

    /**
     * 获取订单的最后更新日期
     *
     * @return last_update_date - 订单的最后更新日期
     */
    public Integer getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置订单的最后更新日期
     *
     * @param lastUpdateDate 订单的最后更新日期
     */
    public void setLastUpdateDate(Integer lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单配送方式：亚马逊配送 (AFN) 或卖家自行配送 (MFN)
     *
     * @return fulfillment_channel - 订单配送方式：亚马逊配送 (AFN) 或卖家自行配送 (MFN)
     */
    public String getFulfillmentChannel() {
        return fulfillmentChannel;
    }

    /**
     * 设置订单配送方式：亚马逊配送 (AFN) 或卖家自行配送 (MFN)
     *
     * @param fulfillmentChannel 订单配送方式：亚马逊配送 (AFN) 或卖家自行配送 (MFN)
     */
    public void setFulfillmentChannel(String fulfillmentChannel) {
        this.fulfillmentChannel = fulfillmentChannel;
    }

    /**
     * 获取订单中第一件商品的销售渠道
     *
     * @return sales_channel - 订单中第一件商品的销售渠道
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * 设置订单中第一件商品的销售渠道
     *
     * @param salesChannel 订单中第一件商品的销售渠道
     */
    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    /**
     * 获取订单中第一件商品的订单渠道
     *
     * @return order_channel - 订单中第一件商品的订单渠道
     */
    public String getOrderChannel() {
        return orderChannel;
    }

    /**
     * 设置订单中第一件商品的订单渠道
     *
     * @param orderChannel 订单中第一件商品的订单渠道
     */
    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    /**
     * 获取货件服务水平
     *
     * @return ship_service_level - 货件服务水平
     */
    public String getShipServiceLevel() {
        return shipServiceLevel;
    }

    /**
     * 设置货件服务水平
     *
     * @param shipServiceLevel 货件服务水平
     */
    public void setShipServiceLevel(String shipServiceLevel) {
        this.shipServiceLevel = shipServiceLevel;
    }

    /**
     * 获取货币代码
     *
     * @return cc - 货币代码
     */
    public String getCc() {
        return cc;
    }

    /**
     * 设置货币代码
     *
     * @param cc 货币代码
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     * 获取金额，单位分
     *
     * @return amount - 金额，单位分
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置金额，单位分
     *
     * @param amount 金额，单位分
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
        this.toDollar = amount;
    }

    /**
     * 获取转化成美分，估值
     *
     * @return to_dollar - 转化成美分，估值
     */
    public Integer getToDollar() {
        return toDollar;
    }

    /**
     * 设置转化成美分，估值
     *
     * @param toDollar 转化成美分，估值
     */
    public void setToDollar(Integer toDollar) {
        this.toDollar = toDollar;
    }

    /**
     * 获取已配送的商品数量
     *
     * @return number_of_items_shipped - 已配送的商品数量
     */
    public Integer getNumberOfItemsShipped() {
        return numberOfItemsShipped;
    }

    /**
     * 设置已配送的商品数量
     *
     * @param numberOfItemsShipped 已配送的商品数量
     */
    public void setNumberOfItemsShipped(Integer numberOfItemsShipped) {
        this.numberOfItemsShipped = numberOfItemsShipped;
    }

    /**
     * 获取未配送的商品数量
     *
     * @return number_of_items_unshipped - 未配送的商品数量
     */
    public Integer getNumberOfItemsUnshipped() {
        return numberOfItemsUnshipped;
    }

    /**
     * 设置未配送的商品数量
     *
     * @param numberOfItemsUnshipped 未配送的商品数量
     */
    public void setNumberOfItemsUnshipped(Integer numberOfItemsUnshipped) {
        this.numberOfItemsUnshipped = numberOfItemsUnshipped;
    }

    /**
     * 获取订单的主要付款方式
     *
     * @return payment_method - 订单的主要付款方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置订单的主要付款方式
     *
     * @param paymentMethod 订单的主要付款方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取买家的匿名电子邮件地址
     *
     * @return buyer_email - 买家的匿名电子邮件地址
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * 设置买家的匿名电子邮件地址
     *
     * @param buyerEmail 买家的匿名电子邮件地址
     */
    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    /**
     * 获取买家姓名
     *
     * @return buyer_name - 买家姓名
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 设置买家姓名
     *
     * @param buyerName 买家姓名
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * 获取订单的配送服务级别分类
     *
     * @return shipment_service_level_category - 订单的配送服务级别分类
     */
    public String getShipmentServiceLevelCategory() {
        return shipmentServiceLevelCategory;
    }

    /**
     * 设置订单的配送服务级别分类
     *
     * @param shipmentServiceLevelCategory 订单的配送服务级别分类
     */
    public void setShipmentServiceLevelCategory(String shipmentServiceLevelCategory) {
        this.shipmentServiceLevelCategory = shipmentServiceLevelCategory;
    }

    /**
     * 获取指明订单配送方是否是亚马逊配送 (Amazon TFM) 服务
     *
     * @return shipped_by_amazon_tfm - 指明订单配送方是否是亚马逊配送 (Amazon TFM) 服务
     */
    public Boolean getShippedByAmazonTfm() {
        return shippedByAmazonTfm;
    }

    /**
     * 设置指明订单配送方是否是亚马逊配送 (Amazon TFM) 服务
     *
     * @param shippedByAmazonTfm 指明订单配送方是否是亚马逊配送 (Amazon TFM) 服务
     */
    public void setShippedByAmazonTfm(Boolean shippedByAmazonTfm) {
        this.shippedByAmazonTfm = shippedByAmazonTfm;
    }

    /**
     * 获取亚马逊 TFM订单的状态,仅当ShippedByAmazonTFM = True时返回
     *
     * @return tfm_shipment_status - 亚马逊 TFM订单的状态,仅当ShippedByAmazonTFM = True时返回
     */
    public String getTfmShipmentStatus() {
        return tfmShipmentStatus;
    }

    /**
     * 设置亚马逊 TFM订单的状态,仅当ShippedByAmazonTFM = True时返回
     *
     * @param tfmShipmentStatus 亚马逊 TFM订单的状态,仅当ShippedByAmazonTFM = True时返回
     */
    public void setTfmShipmentStatus(String tfmShipmentStatus) {
        this.tfmShipmentStatus = tfmShipmentStatus;
    }

    /**
     * 获取卖家自定义的配送方式，属于Checkout by Amazon (CBA) 所支持的四种标准配送设置中的一种
     *
     * @return cba_displayable_shipping_label - 卖家自定义的配送方式，属于Checkout by Amazon (CBA) 所支持的四种标准配送设置中的一种
     */
    public String getCbaDisplayableShippingLabel() {
        return cbaDisplayableShippingLabel;
    }

    /**
     * 设置卖家自定义的配送方式，属于Checkout by Amazon (CBA) 所支持的四种标准配送设置中的一种
     *
     * @param cbaDisplayableShippingLabel 卖家自定义的配送方式，属于Checkout by Amazon (CBA) 所支持的四种标准配送设置中的一种
     */
    public void setCbaDisplayableShippingLabel(String cbaDisplayableShippingLabel) {
        this.cbaDisplayableShippingLabel = cbaDisplayableShippingLabel;
    }

    /**
     * 获取订单类型
     *
     * @return order_type - 订单类型
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型
     *
     * @param orderType 订单类型
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取卖家承诺的订单发货时间范围的第一天,仅对卖家配送网络 (MFN) 订单返回
     *
     * @return earliest_ship_date - 卖家承诺的订单发货时间范围的第一天,仅对卖家配送网络 (MFN) 订单返回
     */
    public Integer getEarliestShipDate() {
        return earliestShipDate;
    }

    /**
     * 设置卖家承诺的订单发货时间范围的第一天,仅对卖家配送网络 (MFN) 订单返回
     *
     * @param earliestShipDate 卖家承诺的订单发货时间范围的第一天,仅对卖家配送网络 (MFN) 订单返回
     */
    public void setEarliestShipDate(Integer earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    /**
     * 获取卖家承诺的订单发货时间范围的第一天原始字符串
     *
     * @return earliest_ship_date_str - 卖家承诺的订单发货时间范围的第一天原始字符串
     */
    public String getEarliestShipDateStr() {
        return earliestShipDateStr;
    }

    /**
     * 设置卖家承诺的订单发货时间范围的第一天原始字符串
     *
     * @param earliestShipDateStr 卖家承诺的订单发货时间范围的第一天原始字符串
     */
    public void setEarliestShipDateStr(String earliestShipDateStr) {
        this.earliestShipDateStr = earliestShipDateStr;
    }

    /**
     * 获取卖家承诺的订单发货时间范围的最后一天,对卖家配送网络 (MFN)和亚马逊物流 (AFN) 订单返回
     *
     * @return latest_ship_date - 卖家承诺的订单发货时间范围的最后一天,对卖家配送网络 (MFN)和亚马逊物流 (AFN) 订单返回
     */
    public Integer getLatestShipDate() {
        return latestShipDate;
    }

    /**
     * 设置卖家承诺的订单发货时间范围的最后一天,对卖家配送网络 (MFN)和亚马逊物流 (AFN) 订单返回
     *
     * @param latestShipDate 卖家承诺的订单发货时间范围的最后一天,对卖家配送网络 (MFN)和亚马逊物流 (AFN) 订单返回
     */
    public void setLatestShipDate(Integer latestShipDate) {
        this.latestShipDate = latestShipDate;
    }

    /**
     * 获取卖家承诺的订单发货时间范围的最后一天原始字符串
     *
     * @return latest_ship_date_str - 卖家承诺的订单发货时间范围的最后一天原始字符串
     */
    public String getLatestShipDateStr() {
        return latestShipDateStr;
    }

    /**
     * 设置卖家承诺的订单发货时间范围的最后一天原始字符串
     *
     * @param latestShipDateStr 卖家承诺的订单发货时间范围的最后一天原始字符串
     */
    public void setLatestShipDateStr(String latestShipDateStr) {
        this.latestShipDateStr = latestShipDateStr;
    }

    /**
     * 获取卖家承诺的订单送达时间范围的第一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     *
     * @return earliest_delivery_date - 卖家承诺的订单送达时间范围的第一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     */
    public Integer getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    /**
     * 设置卖家承诺的订单送达时间范围的第一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     *
     * @param earliestDeliveryDate 卖家承诺的订单送达时间范围的第一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     */
    public void setEarliestDeliveryDate(Integer earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
    }

    /**
     * 获取卖家承诺的订单送达时间范围的第一天原始字符串
     *
     * @return earliest_delivery_date_str - 卖家承诺的订单送达时间范围的第一天原始字符串
     */
    public String getEarliestDeliveryDateStr() {
        return earliestDeliveryDateStr;
    }

    /**
     * 设置卖家承诺的订单送达时间范围的第一天原始字符串
     *
     * @param earliestDeliveryDateStr 卖家承诺的订单送达时间范围的第一天原始字符串
     */
    public void setEarliestDeliveryDateStr(String earliestDeliveryDateStr) {
        this.earliestDeliveryDateStr = earliestDeliveryDateStr;
    }

    /**
     * 获取卖家承诺的订单送达时间范围的最后一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     *
     * @return latest_delivery_date - 卖家承诺的订单送达时间范围的最后一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     */
    public Integer getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    /**
     * 设置卖家承诺的订单送达时间范围的最后一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     *
     * @param latestDeliveryDate 卖家承诺的订单送达时间范围的最后一天,仅对没有 PendingAvailability、Pending 或 Canceled状态的 MFN 订单返回
     */
    public void setLatestDeliveryDate(Integer latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
    }

    /**
     * 获取卖家承诺的订单送达时间范围的最后一天原始字符串
     *
     * @return latest_delivery_date_str - 卖家承诺的订单送达时间范围的最后一天原始字符串
     */
    public String getLatestDeliveryDateStr() {
        return latestDeliveryDateStr;
    }

    /**
     * 设置卖家承诺的订单送达时间范围的最后一天原始字符串
     *
     * @param latestDeliveryDateStr 卖家承诺的订单送达时间范围的最后一天原始字符串
     */
    public void setLatestDeliveryDateStr(String latestDeliveryDateStr) {
        this.latestDeliveryDateStr = latestDeliveryDateStr;
    }

    /**
     * 获取订单的配送的收件人
     *
     * @return shipping_name - 订单的配送的收件人
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 设置订单的配送的收件人
     *
     * @param shippingName 订单的配送的收件人
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    /**
     * 获取订单的配送的收件电话
     *
     * @return shipping_phone - 订单的配送的收件电话
     */
    public String getShippingPhone() {
        return shippingPhone;
    }

    /**
     * 设置订单的配送的收件电话
     *
     * @param shippingPhone 订单的配送的收件电话
     */
    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    /**
     * @return purchase_order_number
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * @param purchaseOrderNumber
     */
    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    /**
     * @return is_business_order
     */
    public Boolean getIsBusinessOrder() {
        return isBusinessOrder;
    }

    /**
     * @param isBusinessOrder
     */
    public void setIsBusinessOrder(Boolean isBusinessOrder) {
        this.isBusinessOrder = isBusinessOrder;
    }

    /**
     * @return is_premium_order
     */
    public Boolean getIsPremiumOrder() {
        return isPremiumOrder;
    }

    /**
     * @param isPremiumOrder
     */
    public void setIsPremiumOrder(Boolean isPremiumOrder) {
        this.isPremiumOrder = isPremiumOrder;
    }

    /**
     * @return is_prime
     */
    public Boolean getIsPrime() {
        return isPrime;
    }

    /**
     * @param isPrime
     */
    public void setIsPrime(Boolean isPrime) {
        this.isPrime = isPrime;
    }

    /**
     * 获取标签，多个标签逗号分隔
     *
     * @return labels - 标签，多个标签逗号分隔
     */
    public String getLabels() {
        return labels;
    }

    /**
     * 设置标签，多个标签逗号分隔
     *
     * @param labels 标签，多个标签逗号分隔
     */
    public void setLabels(String labels) {
        this.labels = labels;
    }

    /**
     * 获取扩展
     *
     * @return ext - 扩展
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展
     *
     * @param ext 扩展
     */
    public void setExt(String ext) {
        this.ext = ext;
    }
}