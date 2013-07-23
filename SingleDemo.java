/*
设计模式：解决某一类问题最行之有效的方法
	在java中有23种设计模式
单例设计模式：解决一个类在内存中只有一个对象


要想保证对象唯一
	1,为了避免其他程序过多建立该类对象。先禁止其他程序建立该类对象
	2,还为了让其他程序访问到该类对象，只好在该类中自定义一个对象
	3,为了方便其他程序对自定义的对象的访问，可提供一些访问方式

这三步怎么实现？
	1,构造函数私有化
	2,在类中创建一个本类对象
	3,对外提供一个方法可以获取到该对象

对于事物该怎么描述，还怎么描述
当需要将该事物在内存中唯一时，就加上上面三步


*/
//方式一---这个是先初始化
//称为：饿汉式
class Single
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	private Single(){}
	private static Single s=new Single();//建立一次后，所有创建的对象都指向它
	public static Single getInstance()
	{
		return s;
	}

}
//方式二---方法被调用时才初始化，这也叫做对象延时加载
//称为：懒汉式
//Single类进内存时，对象还没有存在，只有在调用方法时，才建立对象
class Single2
{
	private static Single2 s=null;
	private Single2(){}
	public static Single2 getInstance()
	{
		if(s==null)
		{
			synchronized(Single2.class)
			{
				if(s==null) 
					s=new Single2();
			}
		}
		return s;
	}
}
class SingleDemo 
{
	public static void main(String[] args) 
	{
		Single ss1=Single.getInstance();
		Single ss2=Single.getInstance();
		ss1.setNum(23);
		System.out.println(ss2.getNum());
		/*
		Single s1=new Single();
		Single s2=new Single();
		s1.setNum(30);
		System.out.println(s2.getNum());
		*/
	}
}
