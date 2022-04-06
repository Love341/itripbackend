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
    * 酒店房间表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripHotelRoom")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_room")
public class ItripHotelRoom implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 酒店ID
     */
    @TableField(value = "hotelId")
    @ApiModelProperty(value="酒店ID")
    private Long hotelid;

    /**
     * 房间名称
     */
    @TableField(value = "roomTitle")
    @ApiModelProperty(value="房间名称")
    private String roomtitle;

    /**
     * 房间价格
     */
    @TableField(value = "roomPrice")
    @ApiModelProperty(value="房间价格")
    private BigDecimal roomprice;

    /**
     * 酒店床型
     */
    @TableField(value = "roomBedTypeId")
    @ApiModelProperty(value="酒店床型")
    private Long roombedtypeid;

    /**
     * 是否包含早餐
     */
    @TableField(value = "isHavingBreakfast")
    @ApiModelProperty(value="是否包含早餐")
    private Integer ishavingbreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    @TableField(value = "payType")
    @ApiModelProperty(value="1:在线付 2:到店付 3:不限")
    private Integer paytype;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    @TableField(value = "satisfaction")
    @ApiModelProperty(value="满意度（冗余字段，在用户评论后更新）")
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    @TableField(value = "isBook")
    @ApiModelProperty(value="是否可预订(0:不可以 1:可以)")
    private Integer isbook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    @TableField(value = "isCancel")
    @ApiModelProperty(value="是否可取消(0:不可 1:可以)")
    private Integer iscancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    @TableField(value = "isTimelyResponse")
    @ApiModelProperty(value="是否及时响应(0:不及时 1:及时)")
    private Integer istimelyresponse;

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