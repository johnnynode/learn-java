package chapter3.day02;
public class First {
	static String s1 = "���"; // 全局变量
	public static void main(String[] args) {
		String s2 = "Java"; // 局部变量
		System.out.println(s1); // 你好
		System.out.println(s2); // Java
	}
}