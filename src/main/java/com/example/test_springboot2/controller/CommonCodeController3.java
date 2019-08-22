package com.example.test_springboot2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController3 {
    @RequestMapping(value = "/edit3")
    public void edit3_name() {

    }

    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView edit3(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String keyword = (String) paramMap.get("KEYWORD");
        String viewName = "commonCode/";
        List<Object> resultList = new ArrayList<Object>();

        if ("read3".equals(action)) {
            boolean hasKeyword = false;
            Map<String, Object> dataMap = new HashMap<String, Object>();
            Map<String, Object> resultMap = new HashMap<String, Object>();
            Map<String, Object> emptyMap = new HashMap<String, Object>();

            viewName = viewName + action;

            dataMap.put("NAME", "BYEOLCHAN");
            dataMap.put("COMMON_CODE_ID", "GOOD");
            dataMap.put("DESCRIPTION", "I need explanation");

            emptyMap.put("NAME", "CAN'T BE FOUND");
            emptyMap.put("COMMON_CODE_ID", "CAN'T BE FOUND");
            emptyMap.put("DESCRIPTION", "CAN'T BE FOUND");
            for (String key : dataMap.keySet()) {
                if (keyword.equals(dataMap.get(key))) {
                    resultMap.put("KEYWORD", dataMap.get(key));
                    hasKeyword = true;
                }
            }

            if (hasKeyword == true) {
                resultList.add(dataMap);
            } else {
                resultList.add(emptyMap);
            }

        }

        modelandView.setViewName(viewName);
        modelandView.addObject("resultList", resultList);
        return modelandView;
    }

}