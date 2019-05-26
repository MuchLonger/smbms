package cn.smbms.pojo;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Address {

	private Integer modifyBy;
	private Date modifyDate;
	private String addressDesc;
	private Integer createdBy;
	private String contact;
	private String postCode;
	private String tel;
	private Integer id;
	private Date creationDate;
	private Integer userId;


	public Integer getModifyBy(){
		return this.modifyBy;
	}
	public Date getModifyDate(){
		return this.modifyDate;
	}
	public String getAddressDesc(){
		return this.addressDesc;
	}
	public Integer getCreatedBy(){
		return this.createdBy;
	}
	public String getContact(){
		return this.contact;
	}
	public String getPostCode(){
		return this.postCode;
	}
	public String getTel(){
		return this.tel;
	}
	public Integer getId(){
		return this.id;
	}
	public Date getCreationDate(){
		return this.creationDate;
	}
	public Integer getUserId(){
		return this.userId;
	}

	public Address() {
	}

	public void setModifyBy(Integer modifyBy){
		this.modifyBy=modifyBy;
	}
	public void setModifyDate(Date modifyDate){
		this.modifyDate=modifyDate;
	}
	public void setAddressDesc(String addressDesc){
		this.addressDesc=addressDesc;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public void setPostCode(String postCode){
		this.postCode=postCode;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}
	public void setUserId(Integer userId){
		this.userId=userId;
	}


}
