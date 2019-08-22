
// package com.example.test_springboot2.controller;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;

// import com.example.test_springboot2.repository.StudentRepository;
// import com.example.test_springboot2.service.StudentService;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// @RequestMapping(value = "/student", method = RequestMethod.GET)
// public class StudentController {
//     @RequestMapping(value = "/go")
//     public void go() {
//     }

//     @Autowired
//     private StudentRepository repository;

//     @Autowired
//     private StudentService service;

//     @RequestMapping(value = "/{action}", method = RequestMethod.GET)
//     public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
//             ModelAndView modelandView) {
//         String viewName = "/student/" + action;
//         List<Object> resultList = new ArrayList<Object>();
//         service.getObject(paramMap);
//         resultList = (List) repository.findAll();
//         Map<String, Object> resultMap = repository.getOne(Long.valueOf((String)
//         dataMap.get("id")));                                                                                                                                                                                                                                                                                                                                                                                 
//         repository.saveAndFlush(new Student(dataMap.get("id"), dataMap.get("name"),
//         dataMap.get("passportNumber")));
//         modelandView.setViewName(viewName);
//         modelandView.addObject("resultList", resultList);
//         return modelandView;
//     }
// }

//민우형꺼
package com.example.test_springboot2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.test_springboot2.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping(value = "/{action}")
    public ModelAndView action(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/student/";
        List<Object> resultList = new ArrayList<Object>();
        Object resultMap = new Object();
        Object resultr = new Object();
        Object check = new Object();
        if ("read".equals(action)) {
            viewName = viewName + action;
            if (paramMap.get("id") == null || paramMap.get("name") == null || paramMap.get("passportNumber") == null) {
                paramMap.put("id", "");
                paramMap.put("name", "");
                paramMap.put("passportNumber", "");
            } else {
                service.Add(paramMap);
            }

            resultr = service.getAll();
            if (paramMap.get("search") == null) {
                paramMap.put("search", "");
                modelandView.addObject("resultList", resultr);
            } else {
                resultMap = service.getSearch(paramMap);
                modelandView.addObject("resultList", resultMap);
            }

        }

        modelandView.addObject("resultMap", paramMap);
        modelandView.addObject("resultr", resultr);
        modelandView.setViewName(viewName);
        return modelandView;
    }
}
