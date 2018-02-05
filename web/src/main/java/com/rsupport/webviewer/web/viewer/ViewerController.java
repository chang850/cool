package com.rsupport.webviewer.web.viewer;

import com.rsupport.webviewer.web.common.ServicePropertiesUtil;
import com.rsupport.webviewer.web.common.WebViewerProperties;
import com.rsupport.webviewer.web.swagger.Greeting;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequiredArgsConstructor
public class ViewerController {

    private final ServicePropertiesUtil servicePropertiesUtil;

    private final WebViewerProperties webViewerProperties;

    @ApiOperation(value = "뷰어 시작" ,tags = "changhee2")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "User's name", required = false,
                    dataType = "String", paramType ="query", defaultValue = "Niklas")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Greeting.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    @GetMapping("/")
    public String welcome(HttpServletRequest request, HttpServletResponse response, Model model) {

        model.addAttribute("time", new Date());
        model.addAttribute("message", servicePropertiesUtil.getKey());
        model.addAttribute("project1", webViewerProperties.getRole());
        model.addAttribute("project2", webViewerProperties.getProject().getName());
        return "viewer/start";
    }


    @ApiOperation(value = "해당게시판 조회", tags = "changhee")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "사용자 이름", required = false,
                    dataType = "String", paramType ="query", defaultValue = "Niklas")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Greeting.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    @RequestMapping(method = RequestMethod.GET, value = "/greeting", produces = "application/json")
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String template = "Hello, %s!";
        return new Greeting(new AtomicLong().incrementAndGet(), String.format(template, name));
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
