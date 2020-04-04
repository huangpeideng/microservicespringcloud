package com.yuanwei.springcloud.service.impl;

import com.yuanwei.springcloud.dao.DeptDao;
import com.yuanwei.springcloud.entity.Dept;
import com.yuanwei.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;
    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long deptno) {
        return dao.findById(deptno);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
