package cn.itrip.beans.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 评论表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripComment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_comment")
public class ItripComment implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 如果产品是酒店的话 改字段保存酒店id
     */
    @TableField(value = "hotelId")
    @ApiModelProperty(value="如果产品是酒店的话 改字段保存酒店id")
    private Long hotelid;

    /**
     * 商品id
     */
    @TableField(value = "productId")
    @ApiModelProperty(value="商品id")
    private Long productid;

    /**
     * 订单id
     */
    @TableField(value = "orderId")
    @ApiModelProperty(value="订单id")
    private Long orderid;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    @TableField(value = "productType")
    @ApiModelProperty(value="商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer producttype;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="评论内容")
    private String content;

    /**
     * 用户编号
     */
    @TableField(value = "userId")
    @ApiModelProperty(value="用户编号")
    private Long userid;

    /**
     * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    @TableField(value = "isHavingImg")
    @ApiModelProperty(value="是否包含图片(当用户上传评论时检测)0:无图片 1:有图片")
    private Integer ishavingimg;

    /**
     * 位置评分
     */
    @TableField(value = "positionScore")
    @ApiModelProperty(value="位置评分")
    private Integer positionscore;

    /**
     * 设施评分
     */
    @TableField(value = "facilitiesScore")
    @ApiModelProperty(value="设施评分")
    private Integer facilitiesscore;

    /**
     * 服务评分
     */
    @TableField(value = "serviceScore")
    @ApiModelProperty(value="服务评分")
    private Integer servicescore;

    /**
     * 卫生评分
     */
    @TableField(value = "hygieneScore")
    @ApiModelProperty(value="卫生评分")
    private Integer hygienescore;

    /**
     * 综合评分
     */
    @TableField(value = "score")
    @ApiModelProperty(value="综合评分")
    private Integer score;

    /**
     * 出游类型
     */
    @TableField(value = "tripMode")
    @ApiModelProperty(value="出游类型")
    private Long tripmode;

    /**
     * 是否满意（0：有待改善 1：值得推荐）
     */
    @TableField(value = "isOk")
    @ApiModelProperty(value="是否满意（0：有待改善 1：值得推荐）")
    private Integer isok;

    @TableField(value = "creationDate")
    @ApiModelProperty(value="")
    private Date creationdate;

    @TableField(value = "createdBy")
    @ApiModelProperty(value="")
    private Long createdby;

    @TableField(value = "modifyDate")
    @ApiModelProperty(value="")
    private Date modifydate;

    @TableField(value = "modifiedBy")
    @ApiModelProperty(value="")
    private Long modifiedby;

    private static final long serialVersionUID = 1L;
}