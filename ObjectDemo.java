/*
Object�������ж����ֱ�ӻ��߼�Ӹ���
�����ж����ʱ���ж��󶼾߱��Ĺ���


Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ���
����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û��Ҫ���¶���
ֻҪ��Ϯ�����е� ���ܣ������Լ����е����ݣ�����Ǹ���
*/
class Demo//extends Object,Object�����νṹ�ĸ���
{
	private int num;
	Demo(int num)
	{
		this.num=num;
	}

	public boolean equals(Object obj)//Object obj=new Demo()
	{
		if(!(obj instanceof Demo))//Ҫ���ж�ת��
			return false;
		Demo d=(Demo)obj;//ע�⣬��Ϊobj��û��num
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
		System.out.println(d1.toString());//Demo@4343  ����Ĺ���ֵ
		System.out.println(Integer.toHexString(d1.hashCode()));
		Class c=d1.getClass();
		System.out.println(c.getName());
	}
}
