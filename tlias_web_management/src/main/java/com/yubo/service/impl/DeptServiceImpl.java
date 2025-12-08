package com.yubo.service.impl;

import com.yubo.mapper.DeptMapper;
import com.yubo.pojo.Dept;
import com.yubo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public boolean delete(Integer deptId) {
        return deptMapper.delete(deptId);
    }

    @Override
    public void add(Dept dept) {
        //1.補全基礎屬性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }


}
