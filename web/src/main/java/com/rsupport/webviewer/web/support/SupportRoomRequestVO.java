package com.rsupport.webviewer.web.support;


import com.rsupport.webviewer.core.vo.RequestVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
public class SupportRoomRequestVO extends RequestVO {

    private static final long serialVersionUID = -295940620274122737L;

    private String name;

    private String age;

    private String major;
}
