/*
需求：获取一段程序运行 的时间
原理：获取程序开始和结束的时间，相减

获取时间:System.currentTimeMillis（）；

但代码完成优化后可以解决类似问题

这种方式，称为模版方式设计模式
什么是模版方法呢？
	在定义功能时，功能的一部分是确定的，但有一部分是不确定的，而确定的部分在使用不确定的部分
	那么这事就将不确定的部分暴露出去，有该类的子类去完成
*/
abstract class GetTime
{
	public void getTime()
	{
		long start=System.currentTimeMillis();
		//这部分不确定，要获取其他代码的运行时间
		//方法一，继承getTime复写，比较麻烦
		//方法二，封装下列函数，继承后只要复写该函数
		/*
		for(int x=0;x<1000;x++)
		{
			System.out.print(x);
		}
		*/
		runcode();
		long end=System.currentTimeMillis();
		System.out.println("毫秒："+(end-start));
		
	}
	public abstract void runcode();
}
class SubTime extends GetTime
{
	public void runcode()
	{
		for(int x=0;x<4000;x++)
		{
			System.out.print(x);
		}
		
	}
}
class  TemplateDemo
{
	public static void main(String[] args) 
	{
		SubTime gt=new SubTime();
		gt.getTime();
	}
}
