/*
面向对象：三个特征：封装，集成，多态。
以后开发，其实就是找对象使用，没有对象，就创建对象
找对象，建立对象，使用对象，维护对象的关系

类和对象的关系
	类就是和对现实中的事物的描述
	对象就好似这类事物，实在个体

	映射到java中，描述就是class
	具体对象就是对应在堆内存中的

封装：隐藏对象的属性和细节，仅对外提供公共访问方式
	将变化隔离，便于使用，提高重用，提高安全性
	原则：不需要对外提供的内容都隐藏，属性都隐藏，提供公共方法对其访问
	private：私有，权限修饰符：用于修饰类中的成员（成员变量，成员函数）
	私有只在类中有效
	私有仅仅是封装的一种表现形式
	之所以对外提供方式，就是因为可以在访问方式中加入逻辑判断的语句
	对访问数据进行操作，提高代码的健壮性
	一般情况，属性隐藏

构造函数
	特点：
		1，函数名与类名相同
		2，不用定义返回值类型
		3，不可以写return语句
	作用：
		给对象进行初始化
	注意：
		1，默认构造函数的特点
		2，多个构造函数是以重载的形式存在

	构造函数和一般函数在写法上不同
	在运行上也不同
		构造函数是在对象一建立就运行，对对象初始化
		而一般方法是对象调用时才执行，是对象具备的功能
		一个对象的建立，构造函数被调用
	什么时候定义构造函数
	当分析事物时，该事物具备一些特性或者行为，将这些定义在构造函数中
	
	this关键字
	this代表它所在函数所属对象的引用
	简单说：哪个对象在调用this所在函数，this就代表哪个对象
	this语句，
	用于构造函数间调用
	注意：this语句只能定义在函数的第一行：初始化动作要先执行，初始化中还有
			初始化，则要先执行更初始的初始化

*/

/*
成员变量和局部变量
成员变量定义在类中，局部变量定义在函数中，
二者左右范围不同
在内存中位置不同
		成员变量---堆内存
		局部变量---栈内存

匿名对象：是对象的简化形式
两种使用情况
	1，当对象方式仅进行一次调用时。。匿名对象调用属性没意义，调用方法有意义
	2，匿名对象可以作为实际参数进行传递

*/
//需求：定义一个汽车（颜色，轮胎数）。
//描述事物其实就是描述事物的属性和行为
//属性对应雷中变量，行为对应类中函数（方法）
//属性和行为共同成为类中的 成员（成员变量和成员方法）
class Car
{
	//描述颜色
	String color="红色";//这是成员变量，
	//描述轮胎数
	//int num=4;
	//私有化后类以外 的对象不能直接访问
	//但仍需提供对num的访问方式
	private int num;
	//可以提供一个方法
	public void setNum(int a)
	{
		if(a>0)
		{
			num=a;
		}else
		{
			System.out.println("feifa");
		}
	}
	public int getNum()
	{
		return num;
	}
	//运行行为
	void run()
	{
		System.out.println(color+".."+num);
	}

}

/*
构造函数
构造函数作用：由于给对象初始化
细节：
	当一个类中没有定义构造函数函数时，系统会默认给该类加入一个空参数的构造函数
	否则无法创建一个对象
	自定义后，系统不再定义
	Person（）{}
*/
class Person
{
	private String name;
	private int age;
	/*
	构造代码块
	作用：给对象进行初始化
	对象一建立就允许，且优先于构造函数执行
	和构造函数的区别：
		构造代码块是给所有对象进行统一初始化，
		构造函数是给对应的对象初始化
	构造代码块中定义的是不同对象共性的初始化内容
	*/
	{
		System.out.println("person code run");
	}
	//构造函数，无返回值类型
	Person()
	{
		System.out.println("A:name="+name+",,age="+age);
	}
	//重载
	//Person(String n)//n可读性不强，改为name，
	Person(String name)
	{
		//name=n;		//name=name;此时局部变量和成员变量名称相同，无法赋值
		this.name=name;			//此时要使用关键字 this：  
		System.out.println("B:name="+name+",,age="+age);
	}
	Person(int age)
	{
		this.age=age;
		System.out.println("E:name="+name+",,age="+age);

	}
	Person(String name,int age)
	{
		//this.name=name;
		//this语句，用于构造函数间调用
		this(name);//---->Person(name)
		this.age=age;
		System.out.println("C:name="+name+",,age="+age);
	}
	/*
	this 的应用
	当定义类中函数时，该函数内部要用到调用该函数对象时，用this来表示这个对象
	需求：定义一个比较人年龄的函数
	*/
	public boolean compare(Person p)
	{
		return this.age==p.age;
	}
}
class  CarDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//生产汽车，在java中通过new操作符来完成
		//其实就是在堆内存中产生一个实体
		Car c=new Car();//c就是一个类类型变量，类类型对象指向对象
		//需求：将已有的车的颜色改成；蓝色，只会该对象做使用。
		//在java中指挥方式是：对象.对象成员
		c.color="蓝色";
		c.run();

		Car q=new Car();
		show(q);
		show(new Car());

		Person p1=new Person();
		Person p2=new Person("lisi");
		Person P3=new Person("wawa",10);
		//比较两人年龄
		Person p4=new Person(20);
		Person p5=new Person(15);
		System.out.println(p4.compare(p5));

	}
	//需求：汽车修配厂，把车改为3个轮子，黑色
	public static void show(Car c)
	{
		//c.num=3;
		c.setNum(3);
		c.color="黑色";
		c.run();
	}
}
