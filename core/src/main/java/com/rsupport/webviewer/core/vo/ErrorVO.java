package com.rsupport.webviewer.core.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorVO {
    private int code;
    private String message;
}
