package chapter5.part01;

public class Jerque {
	
	// 备注： 这个例子的输出时间与每台机器的性能有关, 而且每一次都不一定一样，与cpu的进程有关
	public static void main(String[] args) {
		String str = "";
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			str += i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("10000个for循环消耗时间：" + time); // 10000个for循环消耗时间：217
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for(int j=0; j< 1000000; j++){
			builder.append(j);
		}
		endTime = System.currentTimeMillis();
		time  = endTime - startTime;
		System.out.println("StringBuilder消耗时间：" + time); // StringBuilder消耗时间：64
	}

}
