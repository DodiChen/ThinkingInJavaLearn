package com.dodi.unit9;

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg.York()");
		}
	}
	public Egg() {
		System.out.println("New Egg()");
		y = new Yolk();
	}
}

public class BigEgg extends Egg{
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.York()");
		}
	}
	public static void main(String[] args) {
		new BigEgg();
	}
}
