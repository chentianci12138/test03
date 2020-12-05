package com.itheima.controller;

import com.it.service.Service;
import com.sun.tools.javac.jvm.Items;
import com.tc.pojo.Bean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/items")
public class ItemsController {


    @Autowired
    private Service itemsService;


    /*****
     * 列表访问
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model){
        //集合查询
        List<Bean1> items = itemsService.selectAll();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }

    @RequestMapping(value = "/list2")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Bean1> list = itemsService.selectAll();
        modelAndView.addObject("items",list);
        modelAndView.setViewName("items");
        return modelAndView;//页面名称 .jsp
    }

    /***
     * 增加商品
     * @return
     */
    @RequestMapping(value = "/save")
    public String save(Bean1 bean1){
        int acount =  itemsService.add(bean1);
        //集合列表页跳转
        return "redirect:/items/list";
    }

}