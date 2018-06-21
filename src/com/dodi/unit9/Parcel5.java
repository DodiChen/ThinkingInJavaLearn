package com.dodi.unit9;

public class Parcel5 {
	
	public Destination destination(String s) {
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo) {
				this.label = whereTo;
			}
			@Override
			public String readLine() {
				// TODO Auto-generated method stub
				return label;
			}
		}
		return new PDestination(s);
	}
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tismania");
		System.out.println(d.readLine());
	}
	
}
