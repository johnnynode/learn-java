package chapter3.day03;
public class TestTypeTransform {
	public static void main(String[] args) {
		test1(); 
		test2();
	}
	
	public static void test1(){
		byte mybyte = 127;
		int myint = 150;
		float myfloat = 452.12f;
		char mychar = 10;
		double mydouble = 45.454646;
		System.out.println("通过算术运算进行隐式类型转换");
		System.out.println("mybyte + myfloat = " + (mybyte + myfloat)); // mybyte + myfloat = 579.12
		System.out.println("mybyte * myint = " + (mybyte * myint)); // mybyte * myint = 19050
		System.out.println("mybyte / myint = " + (mybyte / myint)); // mybyte / myint = 0
		System.out.println("mydouble + mychar = " + (mydouble + mychar)); // mydouble + mychar = 55.454646
	}
	
	public static void test2(){
		System.out.println("强制类型转换");
		int a = (int)4.656;
		long y = (long)456.6F;
		int b = (int)'d';
		String str = String.valueOf(false);
		System.out.println("a = " + a); // a = 4
		System.out.println("y = " + y); // y = 456
		System.out.println("b = " + b); // b = 100
		System.out.println("str = " + str); // b = false
		System.out.println(str.getClass()); // class java.lang.String
	}
}
