package chapter3.part03;

public class Val {
	static int times = 3;

	public static void main(String[] args) {
		test();
		test2();
	}

	public static void test() {
		int times = 4; // 局部变量与全局变量同名时，暂时隐藏该方法内的成员变量，其他方法不受约束
		System.out.println("main times=> " + times); // main times=> 4
	}

	public static void test2() {
		System.out.println("test times=> " + times); // test times=> 3
	}
}