package com.example.test_springboot2.service;

import com.example.test_springboot2.dao.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService2 {
    @Autowired
    private MemberDao dao;

    public Object getObject(Object dataMap) {
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}