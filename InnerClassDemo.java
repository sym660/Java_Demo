/*
内部类访问规则：
	1，内部类可以直接访问外部类，包括私有
		之所以可以直接访问外部类中的成员，是因为内部类中持有了一个外部类的引用，
		格式是：外部类.this
	2，外部类要访问内部列，必须建立内部类对象

访问格式：
	1，当内部类定义在外部类的成员位置上时 ，而且非私有，可以在外部其他类中
	可以直接建立内部类对象。
	格式：
			外部类.内部类名 变量名=外部类对象.内部类对象
			Outer.Inner in=new Outer().new Inner();

	2,当内部类在成员位置上，就可以被成员修饰符所修饰
		比如，private：将内部类在外部类中进行封装
			static：内部类就具备了静态的特性
				当静态内部类只能访问静态外部类，出现访问局限性

		在外部其他类中，如何直接访问静态内部类
		new Outer.Inner().function();
		在外部其他类中，如何直接访问静态内部类 的静态成员
		Outer.Inner.function();

		注意：当内部类中定义了静态成员，该内部类必须是静态的
			当外部类中的静态方法访问外部类时，内部类也必须是静态的

当描述事物时，事物的内部还有事物，该事物用内部类来描述
因为内部事务在使用外部事物的内容

class Body
{
	private class XinZang
	{

	}
	pulic void()
	{
		new XinZang().
	}
}

*/
class Outer
{
	private int x =3;
	class Inner//内部类,此时类可以加private修饰符
	{
		int x=4;
		void function()
		{
			int x=6;
			System.out.println("inner:"+Outer.this.x);//要打印4，用this关键字；要打印4，用Outer.this
		}
	}
	void method()
	{
		Inner in=new Inner();
		in.function();
	}
}
class  InnerClassDemo
{
	public static void main(String[] args) 
	{
		Outer out=new Outer();
		out.method();
		//直接访问内部类的成员
		//Outer.Inner in=new Outer().new Inner();
		//in.function();
		//System.out.println("Hello World!");
	}
}
