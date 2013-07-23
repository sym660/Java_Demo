/*
接口：初期理解，可以认为是一个特殊的抽象类
	当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示

	class用于定义类
	interface用于定于接口

接口定义时，格式特点：
	1.接口中的常见定义：常量，抽象方法
	2，接口的成员有固定的修饰符
		常量
		方法
		
记住：接口中的成员都是public 的

接口：是不可以创建对象的，因为有抽象方法
需要被子类实现，子类对接口中的抽象方法全覆盖后，子类才可以实例化
否则子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的补充，java中变成了多实现

一个类可以实现多个接口

好处：
	接口是对外暴露原则
	接口是程序的功能扩展
	接口可以用来多实现
	类与接口之间是实现，而且类可以继承一个类的同时实现多个接口，接口与接口之间可以有继承关系
*/
interface Inter
{
	public static final int NUM = 3;//前面修饰符省略了，系统会自动加上
	public abstract void show();
}
interface InterA
{
	public abstract void method();
	public abstract void show();//有相同的没关系，因为没有方法体，子类需要实现

}
interface C extends Inter,InterA
{
	public abstract void method2();
}
class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,InterA   //接口属于实现关系，类属于继承关系。子类要将接口中的抽象都实现
{
	public void show(){}
	public void method(){}
}
class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
