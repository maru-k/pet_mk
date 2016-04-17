package com.plat.pet.order.model;

import java.util.Date;

public class Order {
	private String orderId;
	private String orderSectCd;
	private String userName;
	private String userLoginId;
	private String userNickNm;
	private String petSectCd;
	private String petSectDetailCd;
	private String petWeight;
	private Date orderRegDtm;
	private String orderRegion;
	private String userOpinion;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderSectCd() {
		return orderSectCd;
	}
	public void setOrderSectCd(String orderSectCd) {
		this.orderSectCd = orderSectCd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserNickNm() {
		return userNickNm;
	}
	public void setUserNickNm(String userNickNm) {
		this.userNickNm = userNickNm;
	}
	public String getPetSectCd() {
		return petSectCd;
	}
	public void setPetSectCd(String petSectCd) {
		this.petSectCd = petSectCd;
	}
	public String getPetSectDetailCd() {
		return petSectDetailCd;
	}
	public void setPetSectDetailCd(String petSectDetailCd) {
		this.petSectDetailCd = petSectDetailCd;
	}
	public String getPetWeight() {
		return petWeight;
	}
	public void setPetWeight(String petWeight) {
		this.petWeight = petWeight;
	}
	public Date getOrderRegDtm() {
		return orderRegDtm;
	}
	public void setOrderRegDtm(Date orderRegDtm) {
		this.orderRegDtm = orderRegDtm;
	}
	public String getOrderRegion() {
		return orderRegion;
	}
	public void setOrderRegion(String orderRegion) {
		this.orderRegion = orderRegion;
	}
	public String getUserOpinion() {
		return userOpinion;
	}
	public void setUserOpinion(String userOpinion) {
		this.userOpinion = userOpinion;
	}
	
}
