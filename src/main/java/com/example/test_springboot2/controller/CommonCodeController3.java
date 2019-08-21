// package com.example.test_springboot2.controller;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// @RequestMapping(value = "/commonCode")
// public class CommonCodeController3 {
//     @RequestMapping(value = "/edit3")
//     public void edit3_name() {

//     }

//     @RequestMapping(value = "/{action}", method = RequestMethod.GET)
//     public ModelAndView edit3(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
//             ModelAndView modelandView) {
//         String keyword = String.valueOf(paramMap.get("KEYWORD"));
//         String viewName = "commonCode/";
//         List<Object> resultList = new ArrayList<Object>();

//         if ("read3".equals(action)) {
//             Map<String, Object> resultMap = new HashMap<String, Object>();
//             viewName = viewName + action;

//             resultMap.put("NAME", "BYEOLCHAN");
//             resultMap.put("COMMON_CODE_ID", "GOOD");
//             resultMap.put("DESCRIPTION", "I need explanation");
//             for (String key : resultMap.keySet()) {
//                 if (key == keyword) {
//                     resultMap.put("KEYWORD", resultMap.get(key));
//                 }
//             }

//             resultList.add(resultMap);
//         }

//         modelandView.setViewName(viewName);
//         modelandView.addObject("resultList", resultList);
//         return modelandView;
//     }

// }