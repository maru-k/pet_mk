package com.plat.pet.order.model;

import java.util.Date;

public class OrderList {
	private String orderId;
	private String orderSectCd;
	private String petSectCd;
	private String petWeight;
	private Date orderRegDtm;
	
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
	public String getPetSectCd() {
		return petSectCd;
	}
	public void setPetSectCd(String petSectCd) {
		this.petSectCd = petSectCd;
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

	

}
