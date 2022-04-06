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
    * 实时库存表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripHotelTempStore")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_temp_store")
public class ItripHotelTempStore implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "hotelId")
    @ApiModelProperty(value="")
    private Integer hotelid;

    /**
     * 商品id
     */
    @TableField(value = "roomId")
    @ApiModelProperty(value="商品id")
    private Long roomid;

    /**
     * 记录时间
     */
    @TableField(value = "recordDate")
    @ApiModelProperty(value="记录时间")
    private Date recorddate;

    /**
     * 库存
     */
    @TableField(value = "store")
    @ApiModelProperty(value="库存")
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