package com.rsupport.webviewer.core.vo;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@Getter
@Setter
@XmlRootElement(name = "RESULT")
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO implements Serializable {

    private static final long serialVersionUID = -8878939503373294517L;

    private String code;

    private String message;
}
