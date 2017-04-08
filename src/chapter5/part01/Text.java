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
		testStartsWithAndEndsWith();
		testEquals();
		testCompare();
		testCase();
		testSpit();
		testFormat();
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
		String str1 = "HHxx22stts";
		String str2 = str1;
		System.out.println(str1.replace('2', '3')); // HHxx33stts
		// [备注：下面的参数不能一个是字符串一个是字符，java是强类型语言]
		System.out.println(str2.replace("HHxx22stt", "3")); // 3s 
	}
	
	// 判断字符串的开始与结尾  【注意】 参数只能使用字符串类型的
	public static void testStartsWithAndEndsWith(){
		String num = "22215056";
		boolean b1 = num.startsWith("15");
		boolean b2 = num.endsWith("6");
		System.out.println("b0 " + b1); // false
		System.out.println("b1 " + b2); // true
	}
	
	// 比较两个字符串内容是否相等 equals() equalsIgnoreCase()
	public static void testEquals(){
		String str1 = "1112s";
		String str2 = "2221t";
		String str3 = "2221T";
		boolean b1 = str1.equals(str2);
		boolean b2 = str2.equalsIgnoreCase(str3);
		System.out.println("b1 " + b1); // false
		System.out.println("b2 " + b2); // true
	}
	
	// 按字典顺序比较两个字符 比如：b>a 是true 返回1； b>c 是false 返回-1
	public static void testCompare(){
		String str1 = new String("a");
		String str2 = new String("b");
		String str3 = new String("c");
		System.out.println("str2 和 str1比较：" + str2.compareTo(str1)); // 1
		System.out.println("str2 和 str3比较：" + str2.compareTo(str3)); // -1
	}
	
	// 字母大小写转换。
	public static void testCase(){
		String str1 = "HELLO";
		String str2 = str1.toLowerCase();
		String str3 = str2.toUpperCase();
		System.out.println("str2 " + str2); // str2 hello
		System.out.println("str3 " + str3); // str3 HELLO
	}
	
	// 字符串分割  两种方式 split(String sign) split(String sign, int limit)
	public static void testSpit(){
		String str = "192.168.0.1";
		String[] fistArray = str.split("\\.");
		String[] secondArray = str.split("\\.", 2);
		System.out.println("下面是全部输出：");
		for(String a : fistArray){
			System.out.println(a);
		}
		System.out.println("下面是有限制的输出：");
		for(String b : secondArray) {
			System.out.println(b);
		}
		System.out.println("下面是直接输出对象： ");
		System.out.println(secondArray); // 直接输出，显示的是一个地址的引用： [Ljava.lang.String;@2a139a55
	}
	
	// 格式化字符串 两种重载形式：这个书上没写清楚 当有需要的时候再看。 format是String的一个静态方法，直接使用。
	public static void testFormat(){
		System.out.println(String.format("%1$,09d", -3123));
        System.out.println(String.format("%1$9d", -31));
        System.out.println(String.format("%1$-9d", -31));
        System.out.println(String.format("%1$(9d", -31));
        System.out.println(String.format("%1$#9x", 5689));
        // 输出结果如下：
        // -0003,123
        //       -31
        // -31      
        //      (31)
        //    0x1639
	}
	
}
