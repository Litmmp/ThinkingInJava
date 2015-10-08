package com.thinking.chapter1;

/**
 * 由于increment()通过this关键字返回了对当前对象的引用，所以很容易在一条语句里对同一个对象执行多次操作
 * 
 * @author Litmmp
 *
 */
public class Leaf {
	int i = 0;

	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf obj = new Leaf();
		// 对同一个对象执行多次操作，和JQuery类似
		obj.increment().increment().increment().print();
	}
}
