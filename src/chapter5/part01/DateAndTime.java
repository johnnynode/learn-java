package chapter5.part01;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date date = new Date();
		String time = String.format("%tc", date);
		String form = String.format("%tF", date);
		// 备注： 下面输出的是当前写代码的时间
		System.out.println(time); // 星期六 四月 08 15:30:58 CST 2017
		System.out.println(form); // 2017-04-08
	}

}
