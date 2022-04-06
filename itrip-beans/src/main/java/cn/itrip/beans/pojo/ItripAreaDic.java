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
    * 区域字典表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripAreaDic")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_area_dic")
public class ItripAreaDic implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 区域名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="区域名称")
    private String name;

    /**
     * 区域编号
     */
    @TableField(value = "areaNo")
    @ApiModelProperty(value="区域编号")
    private String areano;

    /**
     * 父级区域
     */
    @TableField(value = "parent")
    @ApiModelProperty(value="父级区域")
    private Long parent;

    /**
     * 0:未激活 1:已激活
     */
    @TableField(value = "isActivated")
    @ApiModelProperty(value="0:未激活 1:已激活")
    private Integer isactivated;

    /**
     * 是否是商圈(0:不是 1:是)
     */
    @TableField(value = "isTradingArea")
    @ApiModelProperty(value="是否是商圈(0:不是 1:是)")
    private Integer istradingarea;

    /**
     * (0:不是 1：是)
     */
    @TableField(value = "isHot")
    @ApiModelProperty(value="(0:不是 1：是)")
    private Integer ishot;

    /**
     * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    @TableField(value = "level")
    @ApiModelProperty(value="区域级别(0:国家级 1:省级 2:市级 3:县/区)")
    private Integer level;

    /**
     * 1:国内 2：国外
     */
    @TableField(value = "isChina")
    @ApiModelProperty(value="1:国内 2：国外")
    private Integer ischina;

    @TableField(value = "pinyin")
    @ApiModelProperty(value="")
    private String pinyin;

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