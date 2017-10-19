package com.dodi.unit5;

class Book {
	boolean checkout = false;

	Book(boolean checkOut){
		this.checkout = checkOut;
	}

	void checkin() {
		checkout = false;
	}

	protected void finalize() throws Throwable {
		if (checkout) {
			System.out.println("Error: checked out");
		}
		super.finalize();
	}
}

public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkin();
		new Book(true);
		System.gc();
	}
}
