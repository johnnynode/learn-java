package chapter4.part01;

public class GetSwitch {

	public static void main(String[] args) {
		String str = "明日科技";
		switch (str) {
		case "明日":
			System.out.println("www.mingribook.com");
			break;
		case "明日科技":
			System.out.println("吉林省明日科技");
			break;
		default:
			System.out.println("以上都不是");
		}

	}

}
