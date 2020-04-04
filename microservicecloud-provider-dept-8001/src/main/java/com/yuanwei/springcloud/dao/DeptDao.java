package com.yuanwei.springcloud.dao;

import com.yuanwei.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(Long deptno);
    List<Dept> findAll();
}
