package com.example.test_springboot2.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin
@RestController
public class OrganizationController {
    @RequestMapping(value = "/organization/read")

    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
        String viewName = "/organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        return modelandView;
    }
}