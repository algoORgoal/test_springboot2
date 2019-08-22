package com.example.test_springboot2.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    public Object getObject(Object dataMap) {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "2222");
        resultObject.put("NAME", "name 02");
        return resultObject;
    }
}