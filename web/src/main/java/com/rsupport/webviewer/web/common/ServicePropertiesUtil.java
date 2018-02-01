package com.rsupport.webviewer.web.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ServicePropertiesUtil {

    @Value("${key.chang}")
    private String key;
}
