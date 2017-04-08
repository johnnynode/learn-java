package chapter5.part01;

import java.util.Date;

public class GetDate {

	public static void main(String[] args) {
		Date date = new Date();
		String hour = String.format("%tH", date);
		String min = String.format("%tM", date);
		String sec = String.format("%tS", date);
		System.out.println("现在是：" + hour + "时" + min + "分" + sec + "秒");
	}

}
