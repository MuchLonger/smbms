package cn.smbms.pojo;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Bill {

	private Integer modifyBy;
	private Date modifyDate;
	private Date totalPrice;
	private String billCode;
	private String productUnit;
	private Date productCount;
	private Date creationDate;
	private String productName;
	private String productDesc;
	private Integer isPayment;
	private Integer createdBy;
	private Integer providerId;
	private Integer id;

	public Bill() {
	}

	public Integer getModifyBy(){
		return this.modifyBy;
	}
	public Date getModifyDate(){
		return this.modifyDate;
	}
	public Date getTotalPrice(){
		return this.totalPrice;
	}
	public String getBillCode(){
		return this.billCode;
	}
	public String getProductUnit(){
		return this.productUnit;
	}
	public Date getProductCount(){
		return this.productCount;
	}
	public Date getCreationDate(){
		return this.creationDate;
	}
	public String getProductName(){
		return this.productName;
	}
	public String getProductDesc(){
		return this.productDesc;
	}
	public Integer getIsPayment(){
		return this.isPayment;
	}
	public Integer getCreatedBy(){
		return this.createdBy;
	}
	public Integer getProviderId(){
		return this.providerId;
	}
	public Integer getId(){
		return this.id;
	}


	public void setModifyBy(Integer modifyBy){
		this.modifyBy=modifyBy;
	}
	public void setModifyDate(Date modifyDate){
		this.modifyDate=modifyDate;
	}
	public void setTotalPrice(Date totalPrice){
		this.totalPrice=totalPrice;
	}
	public void setBillCode(String billCode){
		this.billCode=billCode;
	}
	public void setProductUnit(String productUnit){
		this.productUnit=productUnit;
	}
	public void setProductCount(Date productCount){
		this.productCount=productCount;
	}
	public void setCreationDate(Date creationDate){
		this.creationDate=creationDate;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public void setProductDesc(String productDesc){
		this.productDesc=productDesc;
	}
	public void setIsPayment(Integer isPayment){
		this.isPayment=isPayment;
	}
	public void setCreatedBy(Integer createdBy){
		this.createdBy=createdBy;
	}
	public void setProviderId(Integer providerId){
		this.providerId=providerId;
	}
	public void setId(Integer id){
		this.id=id;
	}


}
