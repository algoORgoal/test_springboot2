package com.example.test_springboot2;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class OrganizationBean {
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
        String viewName = "/organization/read";
        modelandView.setViewName(viewName);
        modelandView.addObject("paramMap", paramMap);
        return modelandView;
    }
}
