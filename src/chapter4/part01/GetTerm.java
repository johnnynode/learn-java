package chapter4.part01;

public class GetTerm {
	public static void main(String args[]) {
		int x = 20;
		if (x > 30) {
			System.out.println("a > 30");
		} else if (x > 10) {
			System.out.println("a > 10 && a < 30");
		} else if (x > 0) {
			System.out.println("a > 0 && a < 10");
		} else {
			System.out.println("a值小于0");
		}
	}
}
