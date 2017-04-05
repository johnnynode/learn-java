package chapter4.part03;

public class ContinueTest {

	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			if (i % 2 == 0) {
				continue; // 跳出偶数
			}
			System.out.println(i);
		}
	}
}

/*
输出结果：
1
3
5
7
9
11
13
15
17
19

continue 用于跳出本次循环，继续下次循环
 */