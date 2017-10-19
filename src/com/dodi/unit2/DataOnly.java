package com.dodi.unit2;

public class DataOnly {
	int i;
	double d;
	boolean b;
	String s;
	
	@Override
	public String toString() {
		return "DataOnly [i=" + i + ", d=" + d + ", b=" + b + ", s=" + s + "]";
	}

	public void setStringValue(DataOnly dataOnly){
		dataOnly.s = "Test2";
	}
	
	public static void main(String[] args){
		DataOnly data = new DataOnly();
		data.i = 1;
		data.d = 2.0;
		data.b = false;
		data.s = "Test1";
		System.out.println(data.toString());
		data.setStringValue(data);
		System.out.println(data.toString());
	}
}
