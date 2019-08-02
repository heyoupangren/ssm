package com.cwh.ssm.service;

import com.cwh.ssm.beans.Employee;
import com.cwh.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Cwh
 * CreateTime 2019/8/2 20:16
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    public List<Employee> getEmps(){

        List<Employee> emps = employeeMapper.getEmps();
        return emps;
    }
}
