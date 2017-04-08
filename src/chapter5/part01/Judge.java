package chapter5.part01;

public class Judge {

	public static void main(String[] args) {
		String regx = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1 = "aaa@";
		String str2 = "aaaaa";
		String str3 = "1111@111ffyu.dfg.com";
		if (str1.matches(regx))
			System.out.println("str1是一个合法的email地址");
		if (str2.matches(regx))
			System.out.println("str2是一个合法的email地址");
		if (str3.matches(regx))
			System.out.println("str3是一个合法的email地址"); // str3是一个合法的email地址
	}

}
