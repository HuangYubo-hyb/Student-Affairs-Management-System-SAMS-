package com.yubo.controller;

import com.yubo.pojo.Dept;
import com.yubo.pojo.Result;
import com.yubo.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    //    删除部门，方式一：HttpServletRequest 获取请求参数
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request){
//        String idStr = request.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("根据id删除部门 " + id);
//
//        return Result.success();
//    }

    //    删除部门，方式二：@RequestParam 获取请求参数
    //    默认required = true，意思是必须传递这个参数，不然就会报错，可以将这个参數變為false，意思是不傳參的話默認傳null不報錯
    @DeleteMapping("/depts")
    public Result delete(@RequestParam(value = "id" , required = false) Integer deptId){
        System.out.println("根据id删除部门 " + deptId);
        deptService.delete(deptId);
        return Result.success();
    }

    //新增部門
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        System.out.println("添加部門 " + dept);
        deptService.add(dept);
        return Result.success(dept);
    }
}
