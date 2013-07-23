/*
自定义异常：java未定义的异常
	进行自定义封装

需求：在本程序中，对出书是-1，也视为错误
	就需要对这个问题进行自定义描述

当在函数内部出现了throw抛出异常对象，那么就必须要给出对应的处理动作
	要么try  catch除以
	要么函数上声明让调用者处理

	一般情况在函数内出现异常，函数上要声明
发现打印结果只有异常名称，却没有异常信息
	因为自定义异常没有定义信息

如何定义异常信息？
因为父类已经把定义异常信息的操作都完成了
所以类只要在构造时，将异常信息传递给父类通过super语句
那么久可以直接通过getMessage方法取得自定义的异常信息

自定义异常：
	必须是自定义类继承Exception

	为什么要继承Exception：
		异常体系有一个特点：异常类和异常对象都需要被抛出
		他们都具备可抛性，这个可抛性事Throwable这个体系中独有 的特点
		只有这个体系中的类和对象才能被throws和throw操作
		
throws和throw的区别
	throws使用在函数上
	throw使用在函数内

	throws后面跟的是异常类，可以跟多个
	throw后面跟的是异常对象

Exception中有一个特殊的子类异常RuntimeException运行时异常
如果在函数内容抛出该异常，函数上可以不用声明，编译通过
如果在函数上声明了该异常，调用者可以不进行处理，编译通过
 
 之所以不用再函数声明，是因为不需要让调用者处理
 当该异常发生，希望程序停止，因为在运行时，出现了无法继续运算的情况，
 希望停止程序后，对代码修正

自定义异常时：如果该异常的发生无法在继续进行运算的话，就让自定义异常继承RunTimeException
对于异常，分两种
	1，编译时被检测的异常
	2，编译时不被检测的异常（运行时异常，RuntimeException以及其子类）

finally用于执行一定要执行的函数
	例如，关闭资源

*/
class FuShuException extends Exception
{
	FuShuException()
	{

	}
	FuShuException(String msg)
	{
		super(msg);
	}

}
class Demo 
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("负数");//手动通过throw抛出异常
		return a/b;
	}
}
class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,-1);
			System.out.println("x:"+x);

		}
		catch (FuShuException e)
		{
			System.out.println(e);

		}
		//System.out.println("Hello World!");
	}
}
