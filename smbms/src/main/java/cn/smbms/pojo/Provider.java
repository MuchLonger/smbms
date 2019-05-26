package cn.smbms.pojo;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Provider {

	private String proDesc;
	private Integer modifyBy;
	private String proCode;
	private Date modifyDate;
	private Integer createdBy;
	private String proFax;
	private String proAddress;
	private Integer id;
	private String proName;
	private Date creationDate;
	private String proPhone;
	private String proContact;

	public Provider() {
	}

	public String getProDesc(){
		return this.proDesc;
	}
	public Integer getModifyBy(){
		return this.modifyBy;
	}
	public String getProCode(){
		return this.proCode;
	}
	public Date getModifyDate(){
		return this.modifyDate;
	}
	public Integer getCreatedBy(){
		return this.createdBy;
	}
	public String getProFax(){
		return this.proFax;
	}
	public String getProAddress(){
		return this.proAddress;
	}
	public Integer getId(){
		return this.id;
	}
	public String getProName(){
		return this.proName;
	}
	public Date getCreationDate(){
		return this.creationDate;
	}
	public String getProPhone(){
		return this.proPhone;
	}
	public String getProContact(){
		return this.proContact;
	}


	public void setProDesc(String proDesc){
		this.proDesc=proDesc;
	}
	public void setModifyBy(Integer modifyBy){
		this.modifyBy=modifyBy;
	}
	public void setProCode(String proCode){
		this.proCode=proCode;
	}
	public void setModifyDate(Date modifyDate){
		this.modifyDate=modifyDate;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public void setProFax(String proFax){
		this.proFax=proFax;
	}
	public void setProAddress(String proAddress){
		this.proAddress=proAddress;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setProName(String proName){
		this.proName=proName;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}
	public void setProPhone(String proPhone){
		this.proPhone=proPhone;
	}
	public void setProContact(String proContact){
		this.proContact=proContact;
	}


}
