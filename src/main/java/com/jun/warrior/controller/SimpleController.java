package com.jun.warrior.controller;

import com.jun.warrior.server.SteamServer;
import com.jun.warrior.tools.DemoValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class SimpleController {

    @Resource
    private DemoValue demoValue;

    @Resource
    private SteamServer steamServer;

    @GetMapping("/")
//    @ResponseBody
    public String home(Model model){
        model.addAttribute("msg_demo",demoValue.getDemo());
        model.addAttribute("msg_host",demoValue.getHost());
        model.addAttribute("steams",steamServer.selectAll());
        return "tl/index";
    }

}
