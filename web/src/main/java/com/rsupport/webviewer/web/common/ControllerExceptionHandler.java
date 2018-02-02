package com.rsupport.webviewer.web.common;


import com.rsupport.webviewer.core.vo.BaseException;
import com.rsupport.webviewer.core.vo.ErrorVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ErrorVO> handNotContent(BaseException ex) {

        ErrorVO errorVO = new ErrorVO(ex.getExceptionStatus().code(), ex.getExceptionStatus().message());
        return new ResponseEntity<ErrorVO>(errorVO, HttpStatus.OK);

//        ResponseVO responseVO = new ResponseVO();
//        responseVO.setReturnCode(String.valueOf(ex.getExceptionStatus().code()));
//        responseVO.setMessage(ex.getExceptionStatus().message());
//        return responseVO;
    }

//    @ExceptionHandler(BaseException.class)
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public ModelAndView handNotContent(BaseException ex) {
//
//        ErrorVO errorVO = new ErrorVO(ex.getExceptionStatus().code(), ex.getExceptionStatus().message());
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject(errorVO);
//        return modelAndView;
//    }
}
