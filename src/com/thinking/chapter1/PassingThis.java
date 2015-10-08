package com.thinking.chapter1;

//Apple需要调用Peeler.peel()方法，它是一个外部的工具方法，
//将执行由于某种原因而必须放在Apple外部的操作
//(也许是因为该外部方法要应用于许多不同的类，而你却不想重复这些代码)
//为了将其自身传递给外部方法，Apple必须使用this关键字

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		// remove peel
		return apple;
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}
