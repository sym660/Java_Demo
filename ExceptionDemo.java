/*
异常


Throwable
	|--Error
	|--Exception

异常处理

java 提供了特有的语句进行处理

try
{
	需要被检测的代码；
}
catch
{
	处理异常代码方式；
}
finally
{
	一定会执行的语句；
}


处理获取异常对象对象进行常见的操作
		String getMessage()

对有问题的类要提示抛出异常 throws Exception

对多异常的处理
	1，声明异常时，建议声明为更具体的异常，便于处理
	2,对方声明多个异常，就对应多个catch块，不要定义多余的
	如果多个catch块中存在异常继承关系，父类catch快放在最下面

建立进行catch处理时，要定义具体的处理语句，
不要只是输出异常语句

*/
class Demo
{
	int div(int x,int y)throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws的关键字声明了该功能可能会出现问题
	{
		int[] arr=new int[x];
			System.out.println(arr[4]);
		return x/y;
	}
}
class  ExceptionDemo
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);//new AritchmeticException()
			System.out.println("x="+x);
		}
		catch (ArithmeticException e)//e是抛过来的异常对象  Exception e=new AritchmeticException();多态
		{
			System.out.println("除以0了");
			System.out.println(e.getMessage());// / by zero
			System.out.println(e);//自动补上toString()//异常名称，异常信息
			e.printStackTrace();//异常名称，异常信息，异常出现的位置//是Jvm默认的抛出

		}
		catch (ArrayIndexOutOfBoundsException e)//e是抛过来的异常对象  Exception e=new AritchmeticException();多态
		{
			System.out.println("脚标越界了");
			System.out.println(e.getMessage());// / by zero
			System.out.println(e);//自动补上toString()//异常名称，异常信息
			e.printStackTrace();//异常名称，异常信息，异常出现的位置//是Jvm默认的抛出

		}
		System.out.println("Hello World!");
	}
}
