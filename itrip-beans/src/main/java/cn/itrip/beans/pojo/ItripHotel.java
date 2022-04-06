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
    * 酒店表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripHotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel")
public class ItripHotel implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 酒店名称
     */
    @TableField(value = "hotelName")
    @ApiModelProperty(value="酒店名称")
    private String hotelname;

    /**
     * 所在国家id
     */
    @TableField(value = "countryId")
    @ApiModelProperty(value="所在国家id")
    private Long countryid;

    /**
     * 所在省份id
     */
    @TableField(value = "provinceId")
    @ApiModelProperty(value="所在省份id")
    private Long provinceid;

    /**
     * 所在城市id
     */
    @TableField(value = "cityId")
    @ApiModelProperty(value="所在城市id")
    private Long cityid;

    /**
     * 酒店所在地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="酒店所在地址")
    private String address;

    /**
     * 酒店介绍（保存附文本）
     */
    @TableField(value = "details")
    @ApiModelProperty(value="酒店介绍（保存附文本）")
    private String details;

    /**
     * 酒店设施
     */
    @TableField(value = "facilities")
    @ApiModelProperty(value="酒店设施")
    private String facilities;

    /**
     * 酒店政策
     */
    @TableField(value = "hotelPolicy")
    @ApiModelProperty(value="酒店政策")
    private String hotelpolicy;

    /**
     * 酒店类型(1:国内酒店 2:国际酒店)
     */
    @TableField(value = "hotelType")
    @ApiModelProperty(value="酒店类型(1:国内酒店 2:国际酒店)")
    private Integer hoteltype;

    /**
     * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    @TableField(value = "hotelLevel")
    @ApiModelProperty(value="(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)")
    private Integer hotellevel;

    /**
     * 是否是团购酒店
     */
    @TableField(value = "isGroupPurchase")
    @ApiModelProperty(value="是否是团购酒店")
    private Integer isgrouppurchase;

    /**
     * 城市名称 冗余字段
     */
    @TableField(value = "redundantCityName")
    @ApiModelProperty(value="城市名称 冗余字段")
    private String redundantcityname;

    /**
     * 省名称 冗余字段
     */
    @TableField(value = "redundantProvinceName")
    @ApiModelProperty(value="省名称 冗余字段")
    private String redundantprovincename;

    /**
     * 国家名称 冗余字段
     */
    @TableField(value = "redundantCountryName")
    @ApiModelProperty(value="国家名称 冗余字段")
    private String redundantcountryname;

    /**
     * 酒店库存（冗余，每天开定时任务的时候更新）
     */
    @TableField(value = "redundantHotelStore")
    @ApiModelProperty(value="酒店库存（冗余，每天开定时任务的时候更新）")
    private Integer redundanthotelstore;

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