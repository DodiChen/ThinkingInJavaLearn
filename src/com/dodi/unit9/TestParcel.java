package com.dodi.unit9;

class Parcel4 {

	private class PContents implements Contents{

		private int i = 11;
		
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}
	
	protected class PDestination implements Destination{
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
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contetns() {
		return new PContents();
	}
}

public class TestParcel{
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contetns();
		Destination d = p.destination("Tasmania");
		//Parcel4.PDestination pd = p.new PDestination("");
	}
}