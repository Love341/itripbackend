package cn.itrip.beans.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 订单表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripHotelOrder")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_order")
public class ItripHotelOrder implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "userId")
    @ApiModelProperty(value="用户id")
    private Long userid;

    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    @TableField(value = "orderType")
    @ApiModelProperty(value="订单类型(0:旅游产品 1:酒店产品 2：机票产品)")
    private Integer ordertype;

    /**
     * 订单号
     */
    @TableField(value = "orderNo")
    @ApiModelProperty(value="订单号")
    private String orderno;

    /**
     * 交易编号
     */
    @TableField(value = "tradeNo")
    @ApiModelProperty(value="交易编号")
    private String tradeno;

    /**
     * 冗余字段 酒店id
     */
    @TableField(value = "hotelId")
    @ApiModelProperty(value="冗余字段 酒店id")
    private Long hotelid;

    /**
     * 冗余字段 酒店名称
     */
    @TableField(value = "hotelName")
    @ApiModelProperty(value="冗余字段 酒店名称")
    private String hotelname;

    /**
     * 房间id
     */
    @TableField(value = "roomId")
    @ApiModelProperty(value="房间id")
    private Long roomid;

    /**
     * 消耗数量
     */
    @TableField(value = "count")
    @ApiModelProperty(value="消耗数量")
    private Integer count;

    /**
     * 预订天数
     */
    @TableField(value = "bookingDays")
    @ApiModelProperty(value="预订天数")
    private Integer bookingdays;

    /**
     * 入住时间
     */
    @TableField(value = "checkInDate")
    @ApiModelProperty(value="入住时间")
    private Date checkindate;

    /**
     * 退房时间
     */
    @TableField(value = "checkOutDate")
    @ApiModelProperty(value="退房时间")
    private Date checkoutdate;

    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    @TableField(value = "orderStatus")
    @ApiModelProperty(value="订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）")
    private Integer orderstatus;

    /**
     * 支付金额
     */
    @TableField(value = "payAmount")
    @ApiModelProperty(value="支付金额")
    private BigDecimal payamount;

    /**
     * 支付方式:1:支付宝 2:微信 3:到店付
     */
    @TableField(value = "payType")
    @ApiModelProperty(value="支付方式:1:支付宝 2:微信 3:到店付")
    private Integer paytype;

    /**
     * 联系手机号
     */
    @TableField(value = "noticePhone")
    @ApiModelProperty(value="联系手机号")
    private String noticephone;

    /**
     * 联系邮箱
     */
    @TableField(value = "noticeEmail")
    @ApiModelProperty(value="联系邮箱")
    private String noticeemail;

    /**
     * 特殊需求
     */
    @TableField(value = "specialRequirement")
    @ApiModelProperty(value="特殊需求")
    private String specialrequirement;

    /**
     * 是否需要发票（0：不需要 1：需要）
     */
    @TableField(value = "isNeedInvoice")
    @ApiModelProperty(value="是否需要发票（0：不需要 1：需要）")
    private Integer isneedinvoice;

    /**
     * 发票类型（0：个人 1：公司）
     */
    @TableField(value = "invoiceType")
    @ApiModelProperty(value="发票类型（0：个人 1：公司）")
    private Integer invoicetype;

    /**
     * 发票抬头
     */
    @TableField(value = "invoiceHead")
    @ApiModelProperty(value="发票抬头")
    private String invoicehead;

    /**
     * 入住人名称
     */
    @TableField(value = "linkUserName")
    @ApiModelProperty(value="入住人名称")
    private String linkusername;

    /**
     * 0:WEB端 1:手机端 2:其他客户端
     */
    @TableField(value = "bookType")
    @ApiModelProperty(value="0:WEB端 1:手机端 2:其他客户端")
    private Integer booktype;

    /**
     * 预定时间
     */
    @TableField(value = "creationDate")
    @ApiModelProperty(value="预定时间")
    private Date creationdate;

    @TableField(value = "createdBy")
    @ApiModelProperty(value="")
    private Long createdby;

    /**
     * 支付完成时间
     */
    @TableField(value = "modifyDate")
    @ApiModelProperty(value="支付完成时间")
    private Date modifydate;

    @TableField(value = "modifiedBy")
    @ApiModelProperty(value="")
    private Long modifiedby;

    private static final long serialVersionUID = 1L;
}