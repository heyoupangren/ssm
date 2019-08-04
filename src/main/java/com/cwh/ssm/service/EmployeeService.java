package com.cwh.ssm.service;

import com.cwh.ssm.beans.Employee;
import com.cwh.ssm.beans.EmployeeExample;
import com.cwh.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cwh
 * CreateTime 2019/8/3 17:46
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;



    public List<Employee> getEmps(){
        //查询的条件使用example进行封装
        //example.createCriteria().andxxx();
        EmployeeExample example =new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andLastNameLike("%r%").andGenderEqualTo("1");
        EmployeeExample.Criteria criteria1 = example.createCriteria();
        criteria1.andEmailLike("%r%");
        example.or(criteria1);
        return employeeMapper.selectByExample(example);
    }

    public List<Employee> getEmpById(Integer id) {
        EmployeeExample example=new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Employee> employees = employeeMapper.selectByExample(example);
        return employees;
    }

}
