package chapter5.part01;

public class CreateString {

	public static void main(String[] args) {
		create1();
		create2();
		create3();
	}

	// 将数组作为参数创建 String 类
	public static void create1() {
		char a[] = { 'g', 'o', 'o', 'd' };
		String str = new String(a);
		System.out.println("通过数组创建字符串：" + str); // 通过数组创建字符串：good
	}

	// 通过数组创建字符串指定索引和截取个数
	public static void create2() {
		char arr[] = { 's', 't', 'u', 'd', 'e', 'n', 't' };
		String str = new String(arr, 2, 4); // 指定从索引2开始截取，截取个数为4
		System.out.println("新字符串结果为：" + str); // 新字符串结果为：uden
	}

	// 普通方式创建字符串
	public static void create3() {
		String str1, str2;
		str1 = "We are students";
		str2 = "We are students";
		System.out.println(str1 == str2); // true
		System.out.println(str1.equals(str2)); // true
	}
}
