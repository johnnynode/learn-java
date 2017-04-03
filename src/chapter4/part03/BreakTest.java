package chapter4.part03;

public class BreakTest {
	public static void main(String args[]){
		testBreak();
	}
	public static void testBreak(){
		for(int i=0; i<=100; i++){
			System.out.println(i);
			if(i==6) break;
		}
		System.out.println("---end---");
	}
}

/*
输出结果为：
0
1
2
3
4
5
6
---end---
*/