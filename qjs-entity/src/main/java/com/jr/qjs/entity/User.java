package com.jr.qjs.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2017-05-25
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;


    public User(){

	}

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public User(Long testId, String name, Integer age, Integer testType, Date testDate, Long role, String phone) {
		this.testId = testId;
		this.name = name;
		this.age = age;
		this.testType = testType;
		this.testDate = testDate;
		this.role = role;
		this.phone = phone;
	}

	/**
     * 主键ID
     */
    @TableId("test_id")
	private Long testId;
    /**
     * 名称
     */
	private String name;
    /**
     * 年龄
     */
	private Integer age;
    /**
     * 测试下划线字段命名类型
     */
	@TableField("test_type")
	private Integer testType;
    /**
     * 日期
     */
	@TableField("test_date")
	private Date testDate;
    /**
     * 测试
     */
	private Long role;
    /**
     * 手机号码
     */
	private String phone;


	public Long getTestId() {
		return testId;
	}

	public void setTestId(Long testId) {
		this.testId = testId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getTestType() {
		return testType;
	}

	public void setTestType(Integer testType) {
		this.testType = testType;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Long getRole() {
		return role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	protected Serializable pkVal() {
		return this.testId;
	}

}
