package com.cwh.ssm.controller;

import com.cwh.ssm.beans.Employee;
import com.cwh.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author Cwh
 * CreateTime 2019/8/2 20:15
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/emps")
    public String getEmps(HttpServletResponse response,Map<String, Object> map){
        response.setCharacterEncoding("utf-8");
        List<Employee> emps = employeeService.getEmps();
        map.put("emps",emps);
        return "list";
    }
}
