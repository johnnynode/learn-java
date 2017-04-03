package chapter4.part02;

public class Circulate {
	public static void main(String args[]) {
		testFor();
	}

	public static void testFor() {
		int sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("2到100之间所有偶数之和为： " + sum);
	}
}
