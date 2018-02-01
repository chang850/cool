package com.rsupport.webviewer.core.vo;

import com.rsupport.webviewer.core.common.ExceptionStatus;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
public class BaseException extends RuntimeException {

    private final Object[] messageArgs;

    private final ExceptionStatus exceptionStatus;

    //1
    public BaseException(ExceptionStatus exceptionStatus) {
        this(exceptionStatus, null);
    }


    //2
    public BaseException(ExceptionStatus exceptionStatus, Object[] messageArgs) {
        this(exceptionStatus, messageArgs, null);
    }

    //3
    public BaseException(ExceptionStatus exceptionStatus, Object[] messageArgs, String debugMessage) {
        this(exceptionStatus, messageArgs, debugMessage, null);
    }

    //4
    public BaseException(ExceptionStatus exceptionStatus, Object[] messageArgs, String debugMessage, Throwable cause) {
        super(debugMessage, cause);
        this.exceptionStatus = exceptionStatus;
        this.messageArgs = messageArgs;
    }
}
