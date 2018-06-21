package com.dodi.unit9;

public class Parcel6 {

	private void internalTracking(boolean b) {
		if(b) {
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			System.out.println(ts.getSlip());
		}
	}
	public void track() {
		internalTracking(true);
	}
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
