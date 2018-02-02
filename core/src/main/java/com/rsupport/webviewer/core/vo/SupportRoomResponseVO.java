package com.rsupport.webviewer.core.vo;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@XmlRootElement
@Data
public class SupportRoomResponseVO extends ResponseVO {

    private List list;

    private String age;

    private String name;

    @QueryProjection
    @Builder
    public SupportRoomResponseVO(String age, String name) {
        this.age = age;
        this.name = name;
    }
}
