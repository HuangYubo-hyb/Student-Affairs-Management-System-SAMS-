package com.yubo.controller;

import com.yubo.pojo.Dept;
import com.yubo.pojo.Result;
import com.yubo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//method: 指定請求方式
    @GetMapping("/depts")
    public Result list(){
        System.out.println("查詢全部部門數據");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }
}
