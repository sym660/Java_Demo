/*
Object：是所有对象的直接或者间接父类
该类中定义的时所有对象都具备的功能


Object类中已经提供了对对象是否相同的比较方法
如果自定义类中也有比较相同的功能，没必要重新定义
只要沿袭父类中的 功能，建立自己特有的内容，这就是覆盖
*/
class Demo//extends Object,Object是类层次结构的根类
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}

	public boolean equals(Object obj)//Object obj=new Demo()
	{
		if(!(obj instanceof Demo))//要做判断转换
			return false;
		Demo d=(Demo)obj;//注意，因为obj中没有num
		return this.num==d.num;
	}

}
class Person
{
}

class  ObjectDemo
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo(4);
		Demo d2=new Demo(4);
		Person p=new Person();
		System.out.println(d1.equals(p));
		System.out.println(d1.equals(d2));
		System.out.println(d1.toString());//Demo@4343  对象的哈西值
		System.out.println(Integer.toHexString(d1.hashCode()));
		Class c=d1.getClass();
		System.out.println(c.getName());
	}
}
