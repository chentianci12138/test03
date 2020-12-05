package com.it.service;

import com.tc.pojo.Bean1;

import java.util.List;

public interface Service {
    int add(Bean1 bean1);
    List<Bean1> selectAll();
}
