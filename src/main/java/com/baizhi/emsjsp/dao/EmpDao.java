package com.baizhi.emsjsp.dao;

import com.baizhi.emsjsp.entity.Emp;

import java.util.List;

public interface EmpDao {



    //员工列表
    List<Emp> lists();

    //根据id删除
    void delete(Integer id);

    //保存员工信息
    void save(Emp emp);

    //查询一个
    Emp queryById(Integer id);

    //跟新员工信息
    void update(Emp emp);
}
