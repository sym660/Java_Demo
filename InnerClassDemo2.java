/*
内部类定义在局部时
	1,不可以被成员修饰符修饰
	2,可以直接访问外部类中的尘缘，因为持有外部类中的引用
	但不可以访问他所在的局部中的变量，只能访问被fingal修饰的局部变量

*/
class Outer
{
	int x=3;
	void method()
	{
		final int y=4;//内部类定义在局部时
		class Inner//局部的内部类不能被private修饰，也不能被定义为static
		{
			void function()
			{
				System.out.println(Outer.this.x);
				System.out.println(y);
			}
		}
		new Inner().function();
	}
}
class InnerClassDemo2 
{
	public static void main(String[] args) 
	{
		new Outer().method();
		//System.out.println("Hello World!");
	}
}
