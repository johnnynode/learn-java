package chapter4.part01;

public class GetSwitchMissingBreak {

	public static void main(String[] args) {
		test(); // case2 没有break, 那么会有穿透，default 会被执行
	}

	public static void test() {
		int week = 2;
		switch (week) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
		default:
			System.out.println("Sorry!");
		}
	}

}
