package com.baizhi.emsjsp.service;

import com.baizhi.emsjsp.dao.EmpDao;
import com.baizhi.emsjsp.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl  implements EmpService{

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> lists() {
        return empDao.lists();
    }

    @Override
    public void delete(Integer id) {
        empDao.delete(id);
    }

    @Override
    public void save(Emp emp) {
        empDao.save(emp);
    }

    @Override
    public Emp queryById(Integer id) {
        return empDao.queryById(id);
    }


    @Override
    public void update(Emp emp) {
        empDao.update(emp);
    }
}
