package chapter3.part03;

public class TestOperator {
	public static void main(String[] args) {
		test1(); // 测试自增自减
		test2(); // 测试比较运算
		test3(); // 测试逻辑运算
		test4(); // 测试位运算
		test5(); // 测试三元运算
	}

	public static void test1() {
		System.out.println("测试自增自减");
		int a = 1;
		System.out.println(++a * (--a)); // 2*1 = 2
		System.out.println(a); // 1
		System.out.println(a++ * (a--)); // 2*1 = 2
		System.out.println(a); // 1
		System.out.println("-----------");
		int b = 2;
		System.out.println(++b * (--b)); // 3*2 = 6
		System.out.println(b); // 2
		System.out.println(b++ * (b--)); // 3*2 = 6
		System.out.println(b); // 1
	}

	public static void test2() {
		System.out.println("测试比较运算符");
		int num1, num2;
		num1 = 4;
		num2 = 5;
		System.out.println("num1 > num2 : " + (num1 > num2)); // false
		System.out.println("num1 < num2 : " + (num1 < num2)); // true
		System.out.println("num1 == num2 : " + (num1 == num2)); // false
		System.out.println("num1 != num2 : " + (num1 != num2)); // true
		System.out.println("num1 >= num2 : " + (num1 >= num2)); // false
		System.out.println("num1 <= num2 : " + (num1 <= num2)); // true
	}

	public static void test3() {
		System.out.println("测试逻辑运算符");
		int a, b;
		a = 2;
		b = 5;
		boolean result = (a > b) && (a != b);
		boolean result2 = (a > b) || (a != b);
		System.out.println(result); // false
		System.out.println(result2); // true
	}

	public static void test4() {
		System.out.println("测试位运算符");
		int x, y;
		x = 3;
		y = 4;
		System.out.println("x & y = " + (x & y)); // x & y = 0
		System.out.println("x | y = " + (x | y)); // x | y = 7
		System.out.println("~x = " + (-x)); // ~x = -3
		System.out.println("~y = " + (-y)); // ~y = -4
		System.out.println("x ^ y = " + (x ^ y)); // x ^ y = 7
		System.out.println("x << 2 = " + (x << 2)); // x << 2 = 12
		System.out.println("y >> 2 = " + (y >> 2)); // y >> 2 = 1
		System.out.println("x >>> 2 = " + (x >>> 2)); // x >>> 2 = 0
		System.out.println("y <<< 2 = " + (y << 2)); // y <<< 2 = 16
	}

	public static void test5() {
		System.out.println("测试三元运算");
		boolean a;
		// 警告 dead code
		if (20 < 45) {
			a = true;
		} else {
			a = false;
		}
		System.out.println("a = " + a); // a = true
		// 同样警告 dead code
		a = 20 < 45 ? true : false;
		System.out.println("a = " + a); // a = true
		// 20 < 45 ? a = true : a = false; // 备注这样些是错的 ,错误提示： 赋值的左边是变量
	}
}
