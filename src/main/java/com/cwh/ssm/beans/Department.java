package com.cwh.ssm.beans;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_department.id
     *
     * @mbg.generated Sat Aug 03 17:25:32 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column table_department.department_name
     *
     * @mbg.generated Sat Aug 03 17:25:32 CST 2019
     */
    private String departmentName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_department.id
     *
     * @return the value of table_department.id
     *
     * @mbg.generated Sat Aug 03 17:25:32 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_department.id
     *
     * @param id the value for table_department.id
     *
     * @mbg.generated Sat Aug 03 17:25:32 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column table_department.department_name
     *
     * @return the value of table_department.department_name
     *
     * @mbg.generated Sat Aug 03 17:25:32 CST 2019
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column table_department.department_name
     *
     * @param departmentName the value for table_department.department_name
     *
     * @mbg.generated Sat Aug 03 17:25:32 CST 2019
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }
}