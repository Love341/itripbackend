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
    * 图片表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripImage")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_image")
public class ItripImage implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 图片类型(0:酒店图片1:房间图片2:评论图片)
     */
    @TableField(value = "type")
    @ApiModelProperty(value="图片类型(0:酒店图片1:房间图片2:评论图片)")
    private String type;

    /**
     * 关联id
     */
    @TableField(value = "targetId")
    @ApiModelProperty(value="关联id")
    private Long targetid;

    /**
     * 图片s上传顺序位置
     */
    @TableField(value = "position")
    @ApiModelProperty(value="图片s上传顺序位置")
    private Integer position;

    /**
     * 图片地址
     */
    @TableField(value = "imgUrl")
    @ApiModelProperty(value="图片地址")
    private String imgurl;

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