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
    * 用户表
    */
@ApiModel(value="cn-itrip-beans-pojo-ItripUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_user")
public class ItripUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    @TableField(value = "userCode")
    @ApiModelProperty(value="若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号")
    private String usercode;

    /**
     * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    @TableField(value = "userPassword")
    @ApiModelProperty(value="若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码")
    private String userpassword;

    /**
     * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    @TableField(value = "userType")
    @ApiModelProperty(value="用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）")
    private Integer usertype;

    /**
     * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    @TableField(value = "flatID")
    @ApiModelProperty(value="平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）")
    private Long flatid;

    /**
     * 用户昵称
     */
    @TableField(value = "userName")
    @ApiModelProperty(value="用户昵称")
    private String username;

    /**
     * 微信号
     */
    @TableField(value = "weChat")
    @ApiModelProperty(value="微信号")
    private String wechat;

    /**
     * qq账号
     */
    @TableField(value = "QQ")
    @ApiModelProperty(value="qq账号")
    private String qq;

    /**
     * 微博账号
     */
    @TableField(value = "weibo")
    @ApiModelProperty(value="微博账号")
    private String weibo;

    /**
     * 百度账号
     */
    @TableField(value = "baidu")
    @ApiModelProperty(value="百度账号")
    private String baidu;

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
     * 是否激活,(0 false，1 true,默认是0)
     */
    @TableField(value = "activated")
    @ApiModelProperty(value="是否激活,(0 false，1 true,默认是0)")
    private Integer activated;

    private static final long serialVersionUID = 1L;
}