package com.sforce.soap.enterprise;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum LayoutComponentType {


  
	/**
	 * Enumeration  : ReportChart
	 */
	ReportChart("ReportChart"),

  
	/**
	 * Enumeration  : Field
	 */
	Field("Field"),

  
	/**
	 * Enumeration  : Separator
	 */
	Separator("Separator"),

  
	/**
	 * Enumeration  : SControl
	 */
	SControl("SControl"),

  
	/**
	 * Enumeration  : EmptySpace
	 */
	EmptySpace("EmptySpace"),

  
	/**
	 * Enumeration  : VisualforcePage
	 */
	VisualforcePage("VisualforcePage"),

  
	/**
	 * Enumeration  : ExpandedLookup
	 */
	ExpandedLookup("ExpandedLookup"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (LayoutComponentType e : EnumSet.allOf(LayoutComponentType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private LayoutComponentType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
