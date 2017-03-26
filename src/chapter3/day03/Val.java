package chapter3.day03;
public class Val {
	static int times = 3;
	public static void main(String[] args) {
		int times = 4; // 局部变量与全局变量同名时，暂时隐藏该方法内的成员变量，其他方法不受约束
		System.out.println("main times=> " + times); // 4
		test();
	}
	
	// 定义一个静态方法test
	public static void test(){
		System.out.println("test times=> " + times); // still 3
	}
}