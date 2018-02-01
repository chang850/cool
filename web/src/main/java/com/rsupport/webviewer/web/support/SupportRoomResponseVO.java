package com.rsupport.webviewer.web.support;

import com.rsupport.webviewer.core.vo.ResponseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@EqualsAndHashCode(callSuper = true)
@XmlRootElement
@Data
public class SupportRoomResponseVO extends ResponseVO {

    private String devicekey = "changhee";

    private String deviceNo = "changhe2";

    private String supportType = "supportType";
}
