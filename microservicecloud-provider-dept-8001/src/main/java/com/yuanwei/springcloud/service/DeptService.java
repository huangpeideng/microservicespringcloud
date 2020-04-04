package com.yuanwei.springcloud.service;

import com.yuanwei.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long deptno);
    List<Dept> list();
}
