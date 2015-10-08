package com.thinking.chapter1;

public class Finalize {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize()");
	}

	public static void main(String[] args) throws Throwable {
		Finalize obj = new Finalize();
		System.gc();
	}
}
