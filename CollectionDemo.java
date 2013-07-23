/*
集合类
	特点：用于存储对象，长度可变，可以存储不同对象
		为什么有这么多容器呢？
			以为每一个容器对数据的存储方式都不同，这个存储方式即为：数据结构
*/
import java.util.*;
class  CollectionDemo
{
	public static void method_base()
	{
		//创建一个集合容器，使用collection接口的子类ArrayList
		ArrayList al=new ArrayList();
		
		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//打印集合
		sop(al);

		//删出元素
		al.remove("java02");

		//获取集合长度

		sop(al);

		//清空
		al.clear();
		sop(al.size());
	}
	public static void method_2()
	{
		ArrayList al1=new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		ArrayList al2=new ArrayList();

		al2.add("java01");
		al2.add("java02");
		al2.add("java07");
		al2.add("java08");

		sop("al1="+al1);
		sop("al2="+al2);
		
		//取交集用
		al1.retainAll(al2);
		sop("al1--"+al1);
		
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		method_2();
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
