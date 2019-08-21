package com.example.test_springboot2.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.test_springboot2.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReferenceController {
    @RequestMapping(value = "/commonCode/edit4")
    public void edit3_name() {

    }

    @Autowired
    private MemberService service;

    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String viewName = "/commonCode/";

        if ("read4".equals(action)) {
            viewName = viewName + action;
            resultMap = (Map<String, Object>) service.getObject(paramMap);
        }
        // else if ("edit4".equals(action)) {
        // question: what they do?
        // }

        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
}
