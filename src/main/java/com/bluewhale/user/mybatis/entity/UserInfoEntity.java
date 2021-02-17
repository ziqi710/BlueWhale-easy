package com.bluewhale.user.mybatis.entity;

import java.util.Date;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;

/**
 * 员工信息表
 * @author 张晓睿
 * @version 创建时间   2019年10月29日 下午16:25:01
 */
public class UserInfoEntity {

	//主键id
	@ExcelIgnore
    private String id;
    @ExcelProperty("员工编号")
    private Integer empNo;
    @ExcelProperty("员工姓名")
    private String empName;
    @ExcelProperty("性别")
    private String sexCode;
    @ExcelProperty("生日")
    private Date birthDate;
    @ExcelProperty("办公电话")
    private String phone;
    @ExcelProperty("手机号")
    private String mobile;
    @ExcelProperty("家庭住址")
    private String homeAddress;
    @ExcelProperty("邮政编码")
    private String postcode;
    @ExcelProperty("雇佣日期")
    private Date hireDate;
    @ExcelProperty("离职日期")
    private Date leaveDate;
    @ExcelProperty("职位")
    private String postition;
    //是否有效
    private String isValid;

    public void setId(String id) {
        this.id = id;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getId() {
        return id;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getSexCode() {
        return sexCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public String getPostition() {
        return postition;
    }

    public String getIsValid() {
        return isValid;
    }
}
