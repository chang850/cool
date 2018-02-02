package com.rsupport.webviewer.web.viewer;

import com.rsupport.webviewer.web.common.ServicePropertiesUtil;
import com.rsupport.webviewer.web.common.WebViewerProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;

@Controller
@RequiredArgsConstructor
public class ViewerController {

    private final ServicePropertiesUtil servicePropertiesUtil;

    private final WebViewerProperties webViewerProperties;

    @GetMapping("/")
    public String welcome(HttpServletRequest request, HttpServletResponse response, Model model) {

        model.addAttribute("time", new Date());
        model.addAttribute("message", servicePropertiesUtil.getKey());
        model.addAttribute("project1", webViewerProperties.getRole());
        model.addAttribute("project2", webViewerProperties.getProject().getName());
        return "viewer/start";
    }

    @GetMapping("/welcome")
    public ModelAndView downLoadFile(HttpServletRequest request) {
        String fullPath = "D:\\fileupload\\MHxodHRwczovL3N0YWxwYS5zdGFydHN1cHBvcnQuY29tfG51bGx8MHw5OTk5OTk5OTk5 (1).exe";
        File downloadFile = new File(fullPath);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("downloadFileView");
        mav.addObject("downloadFile", downloadFile);
        mav.addObject("downloadFileName", "한글.txt");
        return mav;
    }
}
