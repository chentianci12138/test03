package com.tc.dao;


import com.tc.pojo.Bean1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface Dao {
    List<Bean1> selectAll();

    int add(Bean1 bean1);
}
