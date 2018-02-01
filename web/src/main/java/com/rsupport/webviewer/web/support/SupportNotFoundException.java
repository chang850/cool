package com.rsupport.webviewer.web.support;


import com.rsupport.webviewer.core.common.ExceptionStatus;
import com.rsupport.webviewer.core.vo.BaseException;

public class SupportNotFoundException extends BaseException {

    private static final long serialVersionUID = -5150438818964082855L;

    public SupportNotFoundException() {
        super(ExceptionStatus.USER_TEAM_STATUS_CHANGE_IMPOSSIBLE);
    }
}
