package chapter5.part01;

public class Jerque {
	
	// 备注： 这个例子的输出时间与每台机器的性能有关, 而且每一次都不一定一样，与cpu的进程有关
	// 说明： 每次+操作会产生一个新的String实例。会在内存中创建新的字符串对象。如果重复进行字符串修改，将
	// 极大增加系统开销。 而J2SE5.0的时候新增了可变字符序列StringBuilder类，大大提高频繁操作字符串效率
	public static void main(String[] args) {
		String str = "";
		long num = 10000;
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < num; i++){
			str += i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("num个for循环消耗时间：" + time); // 10000个for循环消耗时间：217
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for(int j=0; j< num; j++){
			builder.append(j);
		}
		endTime = System.currentTimeMillis();
		time  = endTime - startTime;
		System.out.println("StringBuilder消耗时间：" + time); // StringBuilder消耗时间：0
	}

}
