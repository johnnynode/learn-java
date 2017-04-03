package chapter4.part02;

public class GetSum {
	public static void main(String args[]){
		sum();
	}
	
	// 计算从1 加到 10
	public static void sum(){
		int x = 1;
		int sum = 0;
		while(x<=10){
			sum += x;
			x++;
		}
		System.out.println("sum=" + sum);
	}
}
