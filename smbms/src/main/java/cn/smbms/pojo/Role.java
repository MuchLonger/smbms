package cn.smbms.pojo;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Role {

	private Integer modifyBy;
	private Date modifyDate;
	private Integer createdBy;
	private String roleCode;
	private String roleName;
	private Integer id;
	private Date creationDate;

	public Role() {
	}

	public Integer getModifyBy(){
		return this.modifyBy;
	}
	public Date getModifyDate(){
		return this.modifyDate;
	}
	public Integer getCreatedBy(){
		return this.createdBy;
	}
	public String getRoleCode(){
		return this.roleCode;
	}
	public String getRoleName(){
		return this.roleName;
	}
	public Integer getId(){
		return this.id;
	}
	public Date getCreationDate(){
		return this.creationDate;
	}


	public void setModifyBy(Integer modifyBy){
		this.modifyBy=modifyBy;
	}
	public void setModifyDate(Date modifyDate){
		this.modifyDate=modifyDate;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public void setRoleCode(String roleCode){
		this.roleCode=roleCode;
	}
	public void setRoleName(String roleName){
		this.roleName=roleName;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}


}
