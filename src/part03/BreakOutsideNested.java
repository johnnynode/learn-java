package chapter4.part03;

public class BreakOutsideNested {
	public static void main(String args[]) {
		testBreakLabel();
	}

	public static void testBreakLabel() {
		Loop: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) {
					break Loop;
				}
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
}

/*
 * 输出结果： i=0 j=0 i=0 j=1 i=0 j=2 i=0 j=3
 * 
 * 使用break 标签名，跳出指定循环体， 此循环体签名必须与break的标签名保持一致。 带有标签的break,
 * 可以制定跳出的训话你，这个训话你可以是内层循环，也可以是外层循环。
 */