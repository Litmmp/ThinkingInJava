package com.thinking.chapter17;

class Model {
	int number;

	Long number1;

	/* 
	 * 正确的equals()必须满足5个条件：
	 * 1、自反性。  x.equals(x)一定返回true
	 * 2、对称性。  x.equals(y)返回true，则y.equals(x)也返回true
	 * 3、传递性。  x.equals(y)返回true，y.equals(z)返回true，则x.equals(z)一定返回true
	 * 4、一致性。  对于任意x和y，如果对象中用于等价比较的信息没有改变，那么无论调用x.equals(y)多少次，结果都一样
	 * 5、对任何不是null的x，x.equals(null)一定返回false
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Model && this.number == ((Model) obj).number;
	}
}

class Entity {
	int number;

	/* 
	 * 思想：true的情况只有一种，其它情况都是false
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Entity) {
			Entity other = (Entity) obj;
			if (this.number == other.number) {
				return true;
			}
		}
		return false;
	}
}

public class ObjectEquals {

	public static void main(String[] args) {
		Long number1 = null;
		Integer number2 = null;
		System.out.println(number1.intValue());
		System.out.println(null instanceof Object);
	}
}
