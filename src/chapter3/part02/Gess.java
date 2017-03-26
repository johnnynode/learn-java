package chapter3.part02;

public class Gess {
	public static void main(String[] args) {
		char word = 'd', word2 = '@';
		int p = 23045, p2 = 45213;
		System.out.println("d 在unicode 表中的位置是：" + (int) word);
		System.out.println("@ 在unicode 表中的位置是：" + (int) word2);
		System.out.println("unicode 表中第23045位是：" + (char) p);
		System.out.println("unicode 表中第45213位是：" + (char) p2);
	}
}