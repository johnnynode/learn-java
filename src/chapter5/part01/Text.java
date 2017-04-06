package chapter5.part01;

public class Text {
	static String str = "We are students";
	public static void main(String[] args) {
		testLength();
		testIndexOf();
		testLastIndexOf();
	}

	// 输出字符串的长度
	public static void testLength() {
		int size = str.length(); // 注意String类型的长度是方法。
		System.out.println("testLength: " + size); // testLength: 15
	}

	// 输出某字符索引位置
	public static void testIndexOf() {
		int index = str.indexOf('a');
		System.out.println("testIndexOf: " + index); // testIndexOf: 3
	}

	// 倒序输出某字符串位置 输出的还是索引，只是从后(右)开始查找
	public static void testLastIndexOf() {
		int index = str.lastIndexOf('e');
		System.out.println("testLastIndexOf: " + index); // testLastIndexOf: 11
	}
}
