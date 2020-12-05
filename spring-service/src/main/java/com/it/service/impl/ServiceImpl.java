package com.it.service.impl;

import com.it.service.Service;
import com.tc.dao.Dao;
import com.tc.pojo.Bean1;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Dao dao;

    public int add(Bean1 bean1) {
        return dao.add(bean1);
    }

    public List<Bean1> selectAll() {
        return dao.selectAll();
    }
}
