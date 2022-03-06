package com.example.springPipelineExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @RequestMapping
    String index(Model model){
        return "index";
    }

    @RequestMapping("about")
    String about(Model model){
        return "about";
    }
}
