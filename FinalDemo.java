/*
final:最终，作为一个修饰符
	1，可以修饰类，函数，变量
	2，被final修饰的类不可以被继承.为了避免被继承，被子类复写功能
	3，被final修饰的方法不可以被复写
	4，被final修饰的变量是一个只能赋值一次，既可以修饰成员变量，也可以修饰局部变量
		当描述事物时，一些数据的值是固定的，那么为了增强阅读性，都给这些值起个名字
		而这些值不需要改变，所以加上final修饰。作为常量，：书写的规范所有字母都大写，如多个单词，用_链接
	5，内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量

目前学的类的修饰符：public final
*/
class Demo
{
	final double PI=3.14;
	final void show1()
	{}
	void show2()
	{}
}
class SubDemo extends Demo
{
	//void show1(){}//被final修饰的方法不可以被复写
}
class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
