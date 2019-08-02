package com.cwh.ssm.mapper;

import com.cwh.ssm.beans.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author Cwh
 * CreateTime 2019/7/24 14:38
 */
public interface EmployeeMapper  {



    public Employee getEmpById(Integer id);

    public List<Employee> getEmps();
}
