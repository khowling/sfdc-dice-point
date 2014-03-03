package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum AppMenuType {


  
	/**
	 * Enumeration  : AppSwitcher
	 */
	AppSwitcher("AppSwitcher"),

  
	/**
	 * Enumeration  : Salesforce1
	 */
	Salesforce1("Salesforce1"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (AppMenuType e : EnumSet.allOf(AppMenuType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private AppMenuType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
