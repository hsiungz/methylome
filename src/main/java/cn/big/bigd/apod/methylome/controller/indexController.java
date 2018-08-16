package cn.big.bigd.apod.methylome.controller;

import cn.big.bigd.apod.methylome.dao.Beta450DAO;
import cn.big.bigd.apod.methylome.domain.Beta450;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiongzhuang on 2018/8/10;
 */
@Controller
public class indexController {
    @Autowired
    Beta450DAO beta450DAO;

    @GetMapping(value = "/")
    public String root() {
        return "redirect:/index";
    }

//    @RequestMapping("/index")
//    public String findBySample_id(){
//        Beta450 findBySample_id = beta450DAO.findBeta450BySampleId("GSM1");
//        System.out.println(findBySample_id);
//        return "ok";
//    }

    @RequestMapping(value = "/index")
    public String test(Model model) {
        String title = "欢迎使用Thymeleaf!";
        model.addAttribute("title",title);
        return "index";
    }




}
