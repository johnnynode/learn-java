package chapter5.part01;

public class General {

	public static void main(String[] args) {
		String str = String.format("%d", 400/2);
		String str2 = String.format("%b", 3>5);
		String str3 = String.format("%x", 200);
		System.out.println("400的一半：" + str); // 400的一半：200
		System.out.println("3>5对吗？" + str2); // 3>5对吗？false
		System.out.println("200的十六进制：" + str3); // 200的十六进制：c8

	}

}
