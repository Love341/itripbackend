package cn.itrip.auth.common.exception;

import cn.itrip.beans.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author mo
 * @Description: Dao 层异常
 * @date 2020-09-17 11:29
 */
@Data
@ApiModel(value = "自定义 Dao 层异常")
public class DaoException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public DaoException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    } }
