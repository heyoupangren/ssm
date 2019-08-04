package com.cwh.ssm.controller;

import com.cwh.ssm.beans.Employee;
import com.cwh.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author Cwh
 * CreateTime 2019/8/3 17:45
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/emps")
    public String getEmps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("emps",emps);
        return "list";
    }
    @RequestMapping("/emp")
    public String getEmpById(@RequestParam("id") Integer id, Map<String,Object> map){
        List<Employee> emps=employeeService.getEmpById(id);
        map.put("emps",emps);
        return "list";
    }

}
