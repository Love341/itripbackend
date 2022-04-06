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

@ApiModel(value="cn-itrip-beans-pojo-ItripUserLinkUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_user_link_user")
public class ItripUserLinkUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 常用联系人姓名
     */
    @TableField(value = "linkUserName")
    @ApiModelProperty(value="常用联系人姓名")
    private String linkusername;

    /**
     * 证件号码
     */
    @TableField(value = "linkIdCard")
    @ApiModelProperty(value="证件号码")
    private String linkidcard;

    /**
     * 常用联系人电话
     */
    @TableField(value = "linkPhone")
    @ApiModelProperty(value="常用联系人电话")
    private String linkphone;

    /**
     * 用户id
     */
    @TableField(value = "userId")
    @ApiModelProperty(value="用户id")
    private Integer userid;

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

    /**
     * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
     */
    @TableField(value = "linkIdCardType")
    @ApiModelProperty(value="证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)")
    private Integer linkidcardtype;

    private static final long serialVersionUID = 1L;
}