package com.rsupport.webviewer.web.common;


import com.rsupport.webviewer.core.vo.BaseException;
import com.rsupport.webviewer.core.vo.ErrorVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorVO> handNotContent(BaseException ex) {
        ErrorVO errorVO = new ErrorVO(ex.getExceptionStatus().code(), ex.getExceptionStatus().message());
        return new ResponseEntity<ErrorVO>(errorVO, HttpStatus.OK);

//        ResponseVO responseVO = new ResponseVO();
//        responseVO.setReturnCode(String.valueOf(ex.getExceptionStatus().code()));
//        responseVO.setMessage(ex.getExceptionStatus().message());
//        return responseVO;
    }
}
