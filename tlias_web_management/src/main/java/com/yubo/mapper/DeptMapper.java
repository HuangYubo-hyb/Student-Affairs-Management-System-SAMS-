package com.yubo.mapper;

import com.yubo.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    /*
    * 查詢所有部門
    * */

    //1.手動結果映射
//    @Results({
//            @Result(column = "create_time",property = "createTime"),
//            @Result(column = "update_time",property = "updateTime"),
//    })



    @Select("select id, name, create_time, update_time from dept order by update_time desc ")
    List<Dept> findAll();

    @Delete("delete from dept where id = #{id}")
    boolean delete(Integer id);

    @Insert("insert into dept (id,name,create_time,update_time) values (null,#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);


}
