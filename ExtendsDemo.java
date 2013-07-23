/*
将学生和工人的共性描述抽取出来，单独描述
只要让学生和工人与单独描述的这个类有关系就行了

继承：
	1.提高了代码的复用性
	2,让类与类之间产生关系，有了这个关系，才有了多态的特性

注意：千万不要为了获取其他类的功能，简化代码而继承
	必须是类与类之间有所属关系才可以继承

class A
{
	void demo1(){}
	void demo2(){}
}
//此时不能继承，由于B中不含demo2,此时可以创建另一个类C，
//有demo1方法，A，B继承C
class B extends A	
{
	//void demo1(){}
	void demo3(){}
}

Java语言中，只支持单继承，不支持多继承

因为多继承容易带来安全隐患：当多个父类中定义了相同功能时，子类继承后，不确定调用哪个
但java保留了这种体制，并用另一种体现形式，叫多实现

java支持多层继承，也就是一个继承体系

如何使用一个继承体系中的功能
想要使用体系，先查阅体系的父类描述，因为父类中定义的电话i该体系的共性功能
通过了解共性功能，就可以知道该体系的基本功能了
在具体调用时，要创建子类的对象：
	一是因为有可能父类不能创建对象
	二是创建子类对象可以使用更多的功能

简单一句：查询父类功能，创建子类对象使用功能

聚集：
	聚合：
	组合：

*/

class Person
{
	String name;
	int age;
}
class Student extends Person
{
	//String name;
	//int age;
	void study()
	{
		System.out.println("good study");
	}
}
class Worker extends Person
{
	//String name;
	//int age;
	void work()
	{
		System.out.println("good work");
	}
}
class  ExtendsDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
