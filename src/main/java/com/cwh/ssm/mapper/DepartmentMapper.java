package com.cwh.ssm.mapper;

import com.cwh.ssm.beans.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Cwh
 * CreateTime 2019/7/25 15:27
 */

public interface DepartmentMapper {

    public Department getDeptById(Integer id);

}
