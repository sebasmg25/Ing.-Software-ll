package com.mipresupuesto.personalbudget.crosscutting;

public class UtilObject {
	
	private static final UtilObject INSTANCE = new UtilObject();
	
	private UtilObject() {
		
	}
	
	public static UtilObject getUtilObject() {
		return INSTANCE;
	}
	
	public <T> boolean isNull(T object) {
		return object == null;
	}
	
	public <T> T getDefault(T object, T defaultValue) {
		return (isNull(object) ? defaultValue : object);
	}

}
