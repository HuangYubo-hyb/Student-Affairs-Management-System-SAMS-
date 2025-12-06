package com.yubo.service;


import com.yubo.pojo.Dept;

import java.util.List;

public interface DeptService {

    /*
    * 查詢所有部門
    * */
    List<Dept> findAll();
}
