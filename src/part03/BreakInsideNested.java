package chapter4.part03;

public class BreakInsideNested {
	public static void main(String args[]) {
		jumpInside();
	}

	public static void jumpInside() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) break;
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
}

/*
输出结果为：
i=0 j=0
i=0 j=1
i=0 j=2
i=0 j=3
i=1 j=0
i=1 j=1
i=1 j=2
i=1 j=3
i=2 j=0
i=2 j=1
i=2 j=2
i=2 j=3

此例用于在嵌套的循环中使用break跳出内层循环。
*/