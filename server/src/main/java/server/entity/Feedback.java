package server.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import server.model.SentimentEnum;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`amazon_feedback_16bbc787af901`")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Feedback {
    /**
     * 主键
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    /**
     * 卖家主账号
     */
    @Column(name = "`uid`")
    private String uid;

    /**
     * 亚马逊卖家id
     */
    @Column(name = "`seller_id`")
    private String sellerId;

    /**
     * 亚马逊订单号
     */
    @Column(name = "`order_id`")
    private String orderId;

    /**
     * 购买日期
     */
    @Column(name = "`purchase_date`")
    private Integer purchaseDate;

    /**
     * 数据拉取时间
     */
    @Column(name = "`pull_data_time`")
    private Integer pullDataTime;

    /**
     * 订单创建时间原始字符串
     */
    @Column(name = "`purchase_date_str`")
    private String purchaseDateStr;

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
     * 评论日期
     */
    @Column(name = "`feedback_date`")
    private String feedbackDate;

    /**
     * 星级评定
     */
    @Column(name = "`rating`")
    private Float rating;

    /**
     * 关联订单获取的买家邮箱
     */
    @Column(name = "`buyer_email`")
    private String buyerEmail;

    /**
     * 买家姓名
     */
    @Column(name = "`buyer_name`")
    private String buyerName;

    /**
     * 报告返回的评论者邮箱
     */
    @Column(name = "`rater_email`")
    private String raterEmail;

    /**
     * mws or spider
     */
    @Column(name = "`data_source`")
    private String dataSource;

    @Column(name = "`spider_mtime`")
    private Integer spiderMtime;

    @Column(name = "`spider_feedback_id`")
    private String spiderFeedbackId;

    @Column(name = "`label`")
    private String label;

    @Column(name = "`sentiment`")
    private SentimentEnum sentiment;

    /**
     * 评论内容
     */
    @Column(name = "`comment`")
    private String comment;

    /**
     * 评论的卖家回复
     */
    @Column(name = "`your_response`")
    private String yourResponse;

}