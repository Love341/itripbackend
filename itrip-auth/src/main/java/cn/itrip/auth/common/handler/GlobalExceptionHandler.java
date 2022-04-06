package cn.itrip.auth.common.handler;

import cn.itrip.auth.common.exception.DaoException;
import cn.itrip.auth.common.exception.ServiceException;
import cn.itrip.auth.common.exception.SysException;
import cn.itrip.beans.common.constants.ErrorCodeEnum;
import cn.itrip.beans.common.vo.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mo
 * @Description: 统一异常处理器
 * @date 2020-09-16 18:32
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 捕获异常
     * @param e 异常类型为 Exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ReturnResult error(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }
    /**
     * 捕获异常
     * @param e 异常类型为 ServiceException
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    public ReturnResult error(ServiceException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }
    /**
     * 捕获异常
     * @param e 异常类型为 DaoException
     * @return
     */
    @ExceptionHandler(value = DaoException.class)
    public ReturnResult error(DaoException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }
    @ExceptionHandler(value = SysException.class)
    public ReturnResult error(SysException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    } }
