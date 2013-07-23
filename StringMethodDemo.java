/*

String对象的常见操作

	1，获取
		1.1 字符串中包含的 字符数，也就是字符的长度
			int length(): 获取长度
		1.2 根据位置获取某位置上的字符
			char charAt(int index)
		1.3 根据字符获取该字符在字符串中位置
			int indexOf(int ch): 返回的时ch在字符串中第一次出现的位置
			int indexOf(int ch,int formIndex) 从formIndex指位置开始，获取在字符串中出现的位置

			int indexOf(int ch): 返回的时ch在字符串中第一次出现的位置
			int indexOf(int ch,int formIndex) 从formIndex指位置开始，获取在字符串中出现的位置
	2, 判断
		2.1 字符串中是否包含某一个字符串
			boolean contains(str);
		2.2 字符串是否有内容
			boolean isEmpty();
		2.3 字符串以指定内容开头
			boolean startsWith(str);
		2.4 字符串是否已指定内容结尾
			boolean endsWith(str);
		2.5 判断字符串中的内容是否相同，复写Object类中的equals方法
			boolean equals(str);
		2.6 判断内容是否相同，忽略大小写
			boolean equalsIngoreCase();
*/
class  StringMethodDemo
{
	public static void method_get()
	{
		String str="abcdeakpf";
		sop(str.length());
		sop(str.indexOf('a'));
		sop(str.charAt(5));
		sop(str.indexOf('a',3));

		//反向索引一个字符出现的位置
		sop(str.lastIndexOf("a"));
	}

	public static void method_is()
	{
		String str1="ArrayDemo.java";

		sop(str1.startsWith("Array"));
		sop(str1.endsWith(".java"));
		sop(str1.contains("Demo"));
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		method_get();
		method_is();
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
