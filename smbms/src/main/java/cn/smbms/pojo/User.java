package cn.smbms.pojo;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class User {

	private java.sql.Date birthday;
	private Integer modifyBy;
	private String userPassword;
	private String address;
	private Integer gender;
	private Date modifyDate;
	private String workPicPath;
	private String userName;
	private Date creationDate;
	private String userCode;
	private String phone;
	private Integer createdBy;
	private String idPicpath;
	private Integer id;
	private Integer userRole;
	private Integer age;

	public Integer getAge() {
		Date date=new Date();
		Integer age=date.getYear()-birthday.getYear();
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User() {
	}

	public java.sql.Date getBirthday(){
		return this.birthday;
	}
	public Integer getModifyBy(){
		return this.modifyBy;
	}
	public String getUserPassword(){
		return this.userPassword;
	}
	public String getAddress(){
		return this.address;
	}
	public Integer getGender(){
		return this.gender;
	}
	public Date getModifyDate(){
		return this.modifyDate;
	}
	public String getWorkPicPath(){
		return this.workPicPath;
	}
	public String getUserName(){
		return this.userName;
	}
	public Date getCreationDate(){
		return this.creationDate;
	}
	public String getUserCode(){
		return this.userCode;
	}
	public String getPhone(){
		return this.phone;
	}
	public Integer getCreatedBy(){
		return this.createdBy;
	}
	public String getIdPicpath(){
		return this.idPicpath;
	}
	public Integer getId(){
		return this.id;
	}
	public Integer getUserRole(){
		return this.userRole;
	}


	public void setBirthday(java.sql.Date birthday){
		this.birthday=birthday;
	}
	public void setModifyBy(Integer modifyBy){
		this.modifyBy=modifyBy;
	}
	public void setUserPassword(String userPassword){
		this.userPassword=userPassword;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setGender(Integer gender){
		this.gender=gender;
	}
	public void setModifyDate(Date modifyDate){
		this.modifyDate=modifyDate;
	}
	public void setWorkPicPath(String workPicPath){
		this.workPicPath=workPicPath;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}
	public void setUserCode(String userCode){
		this.userCode=userCode;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public void setIdPicpath(String idPicpath){
		this.idPicpath=idPicpath;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setUserRole(Integer userRole){
		this.userRole=userRole;
	}


}
