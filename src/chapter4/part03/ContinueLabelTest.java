package chapter4.part03;

public class ContinueLabelTest {

	public static void main(String[] args) {
		testContinueLabel();
	}
	
	public static void testContinueLabel(){
		Loop:
			for(int i=0; i<10; i++){
				for(int j=0; j<5; j++){
					if(j == 3) continue Loop;
					System.out.println("i= " + i + " j=" + j);
				}
			}
	}

}

/*
输出结果
i= 0 j=0
i= 0 j=1
i= 0 j=2
i= 1 j=0
i= 1 j=1
i= 1 j=2
i= 2 j=0
i= 2 j=1
i= 2 j=2
i= 3 j=0
i= 3 j=1
i= 3 j=2
i= 4 j=0
i= 4 j=1
i= 4 j=2
i= 5 j=0
i= 5 j=1
i= 5 j=2
i= 6 j=0
i= 6 j=1
i= 6 j=2
i= 7 j=0
i= 7 j=1
i= 7 j=2
i= 8 j=0
i= 8 j=1
i= 8 j=2
i= 9 j=0
i= 9 j=1
i= 9 j=2

同样使用continue 也可以设置标签，用于标记跳出的范围

*/
