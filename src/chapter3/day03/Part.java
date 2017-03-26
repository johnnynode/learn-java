package chapter3.day03;

public class Part {
	// 声明常量PI,此时如不对PI进行赋值，则会出现错误提示
	static final double PI = 3.14; // 此处属于成员变量的常量，必须赋初值。
	static int age; // 不会报错
	public static void main(String[] args) {
		final double t; // 此处属于局部变量，不定义不会报错。
		t = 3.25; // 局部变量的常量可以赋值
		System.out.println("t=> " + t);

	}

}
