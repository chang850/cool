package com.rsupport.webviewer.web.support;

import com.rsupport.webviewer.core.vo.ResponseVO;
import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@Getter
@Setter
public class SupportRoomListResponseVO extends ResponseVO {

    private List list;

    private String age;

    private String name;

//    @QueryProjection
//    public SupportRoomResponseVO(String age, String name) {
//        this.age = age;
//        this.name = name;
//    }
}
