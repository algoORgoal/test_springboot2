package com.example.test_springboot2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController2 {

    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/commonCode/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("read".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
        } else if ("edit".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }

}