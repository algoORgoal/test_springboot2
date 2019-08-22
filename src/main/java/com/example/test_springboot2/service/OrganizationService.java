package com.example.test_springboot2.service;

import java.util.Map;

import com.example.test_springboot2.dao.OrganizationDao;
import com.example.test_springboot2.model.Student;
import com.example.test_springboot2.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationDao dao;

    public Object getAll(Object paramMap) {
        Object resultObject = dao.getList("organization.list", paramMap);
        return resultObject;
    }
}