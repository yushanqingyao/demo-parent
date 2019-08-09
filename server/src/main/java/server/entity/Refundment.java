package server.entity;

import javax.persistence.*;

@Table(name = "`amazon_refundment_16bbc787af901`")
public class Refundment {
    /**
     * 亚马逊卖家id
     */
    @Id
    @Column(name = "`seller_id`")
    private String sellerId;

    /**
     * 订单id
     */
    @Id
    @Column(name = "`order_id`")
    private String orderId;

    /**
     * 主键，order_id+asin
     */
    @Id
    @Column(name = "`refund_id`")
    private String refundId;

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
     * 退款日期
     */
    @Column(name = "`return_date`")
    private Integer returnDate;

    /**
     * 退款时间原始字符串
     */
    @Column(name = "`return_date_str`")
    private String returnDateStr;

    /**
     * 商品的卖家 SKU
     */
    @Column(name = "`sku`")
    private String sku;

    @Column(name = "`asin`")
    private String asin;

    @Column(name = "`fnsku`")
    private String fnsku;

    /**
     * 产品名称
     */
    @Column(name = "`product_name`")
    private String productName;

    /**
     * 数量
     */
    @Column(name = "`quantity`")
    private Integer quantity;

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
     * 转化成美分（估值）
     */
    @Column(name = "`to_dollar`")
    private Integer toDollar;

    @Column(name = "`fulfillment_center_id`")
    private String fulfillmentCenterId;

    @Column(name = "`detailed_disposition`")
    private String detailedDisposition;

    @Column(name = "`reason`")
    private String reason;

    @Column(name = "`status`")
    private String status;

    @Column(name = "`license_plate_number`")
    private String licensePlateNumber;

    @Column(name = "`customer_comments`")
    private String customerComments;

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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取主键，order_id+asin
     *
     * @return refund_id - 主键，order_id+asin
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * 设置主键，order_id+asin
     *
     * @param refundId 主键，order_id+asin
     */
    public void setRefundId(String refundId) {
        this.refundId = refundId;
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
     * 获取退款日期
     *
     * @return return_date - 退款日期
     */
    public Integer getReturnDate() {
        return returnDate;
    }

    /**
     * 设置退款日期
     *
     * @param returnDate 退款日期
     */
    public void setReturnDate(Integer returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * 获取退款时间原始字符串
     *
     * @return return_date_str - 退款时间原始字符串
     */
    public String getReturnDateStr() {
        return returnDateStr;
    }

    /**
     * 设置退款时间原始字符串
     *
     * @param returnDateStr 退款时间原始字符串
     */
    public void setReturnDateStr(String returnDateStr) {
        this.returnDateStr = returnDateStr;
    }

    /**
     * 获取商品的卖家 SKU
     *
     * @return sku - 商品的卖家 SKU
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置商品的卖家 SKU
     *
     * @param sku 商品的卖家 SKU
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return asin
     */
    public String getAsin() {
        return asin;
    }

    /**
     * @param asin
     */
    public void setAsin(String asin) {
        this.asin = asin;
    }

    /**
     * @return fnsku
     */
    public String getFnsku() {
        return fnsku;
    }

    /**
     * @param fnsku
     */
    public void setFnsku(String fnsku) {
        this.fnsku = fnsku;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取数量
     *
     * @return quantity - 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
     * 获取转化成美分（估值）
     *
     * @return to_dollar - 转化成美分（估值）
     */
    public Integer getToDollar() {
        return toDollar;
    }

    /**
     * 设置转化成美分（估值）
     *
     * @param toDollar 转化成美分（估值）
     */
    public void setToDollar(Integer toDollar) {
        this.toDollar = toDollar;
    }

    /**
     * @return fulfillment_center_id
     */
    public String getFulfillmentCenterId() {
        return fulfillmentCenterId;
    }

    /**
     * @param fulfillmentCenterId
     */
    public void setFulfillmentCenterId(String fulfillmentCenterId) {
        this.fulfillmentCenterId = fulfillmentCenterId;
    }

    /**
     * @return detailed_disposition
     */
    public String getDetailedDisposition() {
        return detailedDisposition;
    }

    /**
     * @param detailedDisposition
     */
    public void setDetailedDisposition(String detailedDisposition) {
        this.detailedDisposition = detailedDisposition;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return license_plate_number
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * @param licensePlateNumber
     */
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * @return customer_comments
     */
    public String getCustomerComments() {
        return customerComments;
    }

    /**
     * @param customerComments
     */
    public void setCustomerComments(String customerComments) {
        this.customerComments = customerComments;
    }
}