package com.yubo.mapper;

import com.yubo.pojo.Dept;
import com.yubo.pojo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    /*
    * 查詢所有部門
    * */
    @Select("select id, name, create_time, update_time from dept order by update_time desc ")
    List<Dept> findAll();
}
