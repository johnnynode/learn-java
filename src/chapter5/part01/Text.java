package chapter5.part01;

public class Text {
	static String str = "We are students";
	
	public static void main(String[] args) {
		testLength();
		testIndexOf();
		testLastIndexOf();
		testCharAt();
		testSubString();
		testTrim();
		testReplace();
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
	
	// 使用charAt获取指定索引处的字符。
	public static void testCharAt(){
		char mychar = str.charAt(1);
		System.out.println("str中索引位置是1的字符为：" + mychar); // e
	}
	
	// 使用substring 获取子字符串 两种重载形式 单个参数截取到索引到最后一个字符 两个参数截取索引之间
	public static void testSubString(){
		System.out.println("测试substring的两种形式：-----" );
		System.out.println(str.substring(10)); // dents
		System.out.println(str.substring(10,12)); // de
		System.out.println("----------");
	}
	
	// trim 使用 去除前导空格和尾部空格。
	public static void testTrim(){
		String str = "  Hello World ";
		System.out.println(str.trim()); // Hello World
	}
	
	// replace 字符串替换
	public static void testReplace(){
		String str = "HHxx22stts";
		System.out.println(str.replace('2', '3')); // HHxx33stts
	}
}
