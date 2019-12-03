package com.zeeshan.spring.springcore.propertiesassignment;

public class webServer {
	
	private String dbUrl;
	webServer(String dbUrl){
		this.dbUrl=dbUrl;
		
	}
	@Override
	public String toString() {
		return "webServer [dbUrl=" + dbUrl + "]";
	}
	
	}
	


