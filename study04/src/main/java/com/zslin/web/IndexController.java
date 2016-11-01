package com.zslin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 钟述林 393156105@qq.com on 2016/11/1 23:26.
 */
@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index(Model model, HttpServletRequest request) {

        return "/web/index";
    }
}
