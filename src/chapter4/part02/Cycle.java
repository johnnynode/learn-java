package chapter4.part02;

public class Cycle {
	public static void main(String args[]){
		testWhile(); // 不满足条件，不执行
		testDoWhile(); // 满足或者不满足，都会执行一次。
	}
	
	public static void testWhile(){
		int a = 100;
		while(a == 60){
			System.out.println("ok1");
			a --;
		}
	}
	
	public static void testDoWhile(){
		int b = 100;
		do{
			System.out.println("ok2");
			b --;
		}while(b == 60);
	}
}
