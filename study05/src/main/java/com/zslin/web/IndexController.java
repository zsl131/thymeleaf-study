package com.zslin.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 钟述林 393156105@qq.com on 2016/11/2 11:22.
 */
@Controller
public class IndexController {

    @GetMapping(value = "index")
    public String index(Model model, HttpServletRequest request) {
        List<String> datas = new ArrayList<String>();
        datas.add("知识林");
        datas.add("http://www.zslin.com");
        datas.add("393156105");
        model.addAttribute("datas", datas);
        model.addAttribute("curDate", new Date());

        model.addAttribute("money", Math.random()*100);
        model.addAttribute("money2", Math.random()*10000);
        return "index";
    }
}
