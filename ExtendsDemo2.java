/*
子父类出现后，类成员的特点

类中成员：
	1,变量
	2,函数
	3.构造函数
1,变量
	如果子类中出现非私有的同名成员变量时
	子类要访问本类中的变量，用this
	子类要访问父类中的变量，用super

	this代表的是子类对象的引用
	super代表的父类对象的引用

2,函数
	当子类中出现和父类一样的函数时
	当子类对象调用函数时，会运行子类函数的内容
	如同父类函数被覆盖一样

	这种情况就是函数的另一个特性：重写（覆盖）
	当子类继承父类，沿袭了父类的功能到子类中，
	但子类虽具备该功能，但功能的内容却和父类不一直
	这时没必要新定义一个函数，直接复写父类函数
	覆盖：
		1,子类覆盖父类，必须保证子类的权限大于等于父类，否则编译失败
		2,静态只能覆盖静态，静态先加载，若覆盖非静态，无法加载
	注意：重载只看同名函数的参数列表
		重写：子父类方法一模一样

3，子父类中的构造函数
	在对对象初始化时，父类的构造函数也会运行
	因为子类的构造函数函数默认第一行有一条隐式语句 super（）；
	super():会访问父类中的空参数的构造函数，而且在子类中所有的构造函数函数默认第一行都是super();
	
	为什么子类一定要访问父类中的构造函数
	因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何初始化这些数据的
	如果要访问父类中的指定的构造函数，可以通过手动定义super语句的方式来制定

注意:super 语句一定定义在第一行

结论：
	子类的所有的构造函数，默认都会访问父类中空参数的构造函数
	因为每一个构造函数内的第一行都有一句隐式的super（）；
	当父类中没有空参数时，子类必须手动通过super语句形式来指定要访问的父中的构造函数
	当然：子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数
	子类中至少会有一个构造函数会访问父类中的构造函数
*/
class Fu
{
	Fu()
	{
		System.out.println("fu run");
	}
	int num=4;
	void show()
	{
		System.out.println("Fu");
	}

}
class Zi extends Fu
{
	Zi()
	{
		//其实省略了 super();
		System.out.println("zi run");
	}
	int num=5;
	void show()
	{
		System.out.println("zi");
		System.out.println(super.num);//父类对象的引用
		System.out.println(this.num);//子类对象的引用，可省略
		System.out.println(num);
	}

}
class  ExtendsDemo2
{
	public static void main(String[] args) 
	{
		Zi z=new Zi();
		//System.out.println(z.num+"..."+z.num);
		z.show();
	}
}
/*
class Tel
{
	void show()
	{
		System.out.println("number");
	}
}
class NewTel extends Tel
{
	//System.out.println("number");//重复
	//show();递归调用，内存溢出
	super.show();
	System.out.println("name");
}
*/