package com.plat.pet.pilot;

public class ResponseObject<T> {
	
	private T data;
	private String code;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
