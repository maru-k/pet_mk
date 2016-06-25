package com.plat.pet.cmm;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public abstract class IdGenUtil {
	
	//id generation rule 
	private String id;
	
	public String getId(){

		String generatedId = idGen();
		id = generatedId.substring(2, generatedId.length());
		if(id.length()>= 16){
			id = id.substring(0, 16);
		}else{
			id = String.format("%02d",id);
		}
		return id;
		
	}
	
	private String idGen(){
		Random rnd = new Random();
		Double val = rnd.nextDouble();
		return val.toString();
		
	}
}
