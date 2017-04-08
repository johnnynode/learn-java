package chapter5.part01;

public class TestStringBuilder {

	public static void main(String[] args) {
		testAppend();
		testInsert();
		testDelete();
	}

	// 测试append()方法 该方法有多个重载形式 可接受任何类型的数据
	public static void testAppend() {
		StringBuilder builder = new StringBuilder("");
		builder.append(1);
		builder.append('s');
		builder.append(2.0);
		builder.append(true);
		System.out.println("test append " + builder); // test append 1s2.0true
	}

	// 测试insert(int offset, arg) 方法 ; offset 是偏移量不是索引位置哦，如下所示：
	public static void testInsert() {
		StringBuilder sb = new StringBuilder("Hello Fellows");
		sb.insert(2, "Hey");
		System.out.println(sb); // HeHeyllo Fellows
	}

	// 测试delete(int start, int end) 方法 左闭右开
	public static void testDelete() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.delete(0, 6);
		System.out.println(sb); // Builder
	}
}
