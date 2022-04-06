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
    * 原始库存表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripProductStore")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_product_store")
public class ItripProductStore implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    @TableField(value = "productType")
    @ApiModelProperty(value="商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer producttype;

    /**
     * 商品id
     */
    @TableField(value = "productId")
    @ApiModelProperty(value="商品id")
    private Long productid;

    /**
     * 商品库存
     */
    @TableField(value = "store")
    @ApiModelProperty(value="商品库存")
    private Integer store;

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