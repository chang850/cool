package com.rsupport.webviewer.web.client;

import com.rsupport.webviewer.web.common.ServicePropertiesUtil;
import com.rsupport.webviewer.web.common.WebViewerProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


@Controller
@RequiredArgsConstructor
public class ClientController {

    private final ServicePropertiesUtil servicePropertiesUtil;
    private final WebViewerProperties webViewerProperties;

    @GetMapping("/client")
    public String welcome(HttpServletRequest request, HttpServletResponse response, Model model) {

        //파일 다운로드 고고

        model.addAttribute("time", new Date());
        model.addAttribute("message", servicePropertiesUtil.getKey());
        model.addAttribute("project1", webViewerProperties.getRole());
        model.addAttribute("project2", webViewerProperties.getProject().getName());

        return "client/start";
    }
}
