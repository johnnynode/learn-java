package chapter4.part01;

public class Compound {

	public static void main(String[] args) {
		int x = 20;
		{
			int y = 40;
			System.out.println(y); // 40
			int z = 245;
			boolean b;
			{
				b = y > z;
				System.out.println(b); // false
			}
		}
		String word = "hello java";
		System.out.println(word); // hello java
		// System.out.println(b); // error: 不能在作用域之外使用复合语句中声明的变量，否则报错。
	}

}
