/*
多态：可以理解为事物存在的多种体现形态

人： 男，女
动物：猫，狗
猫 x=new 猫（）；
动物 x=new 猫（）；//一个对象，两个表现形式

1，多态的体现
	父类的引用指向了自己的子类对象
	父类的引用也可以接收自己 的子类对象

2，多态的前提
	必须是类之间有关系，要么继承，要么实现
	通常还有一个前提，存在覆盖

3，多态的好处
	多态 的出现大大的提高了程序的扩展性

4，多态 的弊端
	提高了扩展性，但是只能使用父类的访问父类中的成员

5，多态的应用

6,多态的出现，代码中的特点

在多态中非静态成员函数的特点：
	在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，则通过，否则失败
	在运行时期：参阅所属类中是否有调用的方法
	简单总结就是：成员函数在多态调用时，便以看左边，运行看右边
在多态中，成员变量的特点
	无论编译和运行都参考左边

在多态中，静态函数特点，无论编译还是允许，都参考左边
*/
/*
动物，
猫，狗
*/
abstract class Animal
{
	abstract void eat();
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void kanJia()
	{
		System.out.println("看家");
	}
}
class Pig extends Animal
{
	public void eat()
	{
		System.out.println("饲料");
	}
	public void gongDi()
	{
		System.out.println("拱地");
	}
}
class  DuoTaiDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Cat c=new Cat();
		//c.eat();
		function(c);
		Dog d=new Dog();
		//d.eat();
		function(d);

		Animal c1=new Cat();//类型提升，向上转型
		c1.eat();
		
		//如果想要调用猫的特有方法
		//强制将父类的引用，转为子类的类型.向下转换成猫
		Cat c2 =(Cat)c1;
		c2.catchMouse();

		//千万不要出现这样的操作，将父类对象转为子类类型
		//能转换的是父类引用指向了自己 的子类的对象时，该引用可以被提升，也可以被强制转换
		//多态自始至终都是子类对象在做变化
		//Animal a=new Animal();
		//Cat c=(Cat)a;

		function(new Dog());


	}
	public static void function(Animal a)
	{
		a.eat();
		if (a instanceof Cat)//关键字instanceof 判断
		{
			Cat c=(Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog c=(Dog)a;
			c.kanJia();
		}
	}
	//找到下列的共性
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}
	public static void function(Pig p)
	{
		p.eat();
	}
	*/
	

}
