package chapter3.day02;

public class Gess {

	public static void main(String[] args) {
		char word = 'd', word2 = '@';
		int p = 23045, p2 = 45213;
        System.out.println("d ��unicode ���е�λ���ǣ�" + (int)word);
        System.out.println("@ ��unicode ���е�λ���ǣ�" + (int)word2);
        System.out.println("unicode ���е�23045λ�ǣ�" + (char)p);
        System.out.println("unicode ���е�45213λ�ǣ�" + (char)p2);
	}
}