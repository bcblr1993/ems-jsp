package com.baizhi.emsjsp.controller;

import com.baizhi.emsjsp.entity.Emp;
import com.baizhi.emsjsp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmpController {


    @Autowired
    private EmpService empService;

    /**
     * 员工列表
     * @param request
     * @return
     */
    @RequestMapping("lists")
    public String lists(HttpServletRequest request){
        List<Emp> lists = empService.lists();
        request.setAttribute("lists",lists);
        return "ems/emplist";
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(Integer id){
        empService.delete(id);
        return "redirect:/lists";
    }

    /**
     * 保存员工信息
     * @param emp
     * @return
     */
    @RequestMapping("save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/lists";
    }

    /**
     * 查询一个
     * @param id
     * @return
     */

    @RequestMapping("queryById")
    public String queryById(Integer id,HttpServletRequest request){
        Emp emp = empService.queryById(id);
        request.setAttribute("emp",emp);
        return  "/ems/updateEmp";
    }

    /**
     * 更新信息
     */
    @RequestMapping("update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/lists";
    }

}
