/*
当多个类中出现相同功能，但功能主体不同
这是可以向上抽取，这是，只抽取功能定义，而不抽取功能主体

抽象：看不懂，不可创建对象
	1，抽象方法一定在抽象类中
	2，抽象方法和抽象类都必须被abstract关键字修饰
	3，抽象类不可以用new创建对象，因为调用抽象方法没有意义
	4，抽象类中的方法要被调用，必须有子类复写起所有的抽象方法后，建立子类对象调用
	如果子类只覆盖了部分抽象方法，那么子类还是一个抽象类

抽象类和一般类没有太大的不同
该如何描述事物，即如何描述事物，只不过该事物中出现了一些看不懂的东西，这些
不确定的部分，也是该事物的功能，需要明确出现，但无法定义主体
通过抽象方法来表示。

抽象类比一般类多了个抽象函数
抽象类不能实例化

抽象只能定义类和方法

抽象类中可以不定义抽象方法，这样做仅仅是不让该类建立对象
*/
abstract class Student
{
	abstract void study();//抽象方法必须创建在抽象类
	//abstract void study1();若含有，则以下每个都要复写
}
class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}

}
class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}

}

class AbstractDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
