/*
��̬���������Ϊ������ڵĶ���������̬

�ˣ� �У�Ů
���è����
è x=new è������
���� x=new è������//һ����������������ʽ

1����̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ� ���������

2����̬��ǰ��
	��������֮���й�ϵ��Ҫô�̳У�Ҫôʵ��
	ͨ������һ��ǰ�ᣬ���ڸ���

3����̬�ĺô�
	��̬ �ĳ��ִ�������˳������չ��

4����̬ �ı׶�
	�������չ�ԣ�����ֻ��ʹ�ø���ķ��ʸ����еĳ�Ա

5����̬��Ӧ��

6,��̬�ĳ��֣������е��ص�

�ڶ�̬�зǾ�̬��Ա�������ص㣺
	�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У���ͨ��������ʧ��
	������ʱ�ڣ��������������Ƿ��е��õķ���
	���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����Կ���ߣ����п��ұ�
�ڶ�̬�У���Ա�������ص�
	���۱�������ж��ο����

�ڶ�̬�У���̬�����ص㣬���۱��뻹���������ο����
*/
/*
���
è����
*/
abstract class Animal
{
	abstract void eat();
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanJia()
	{
		System.out.println("����");
	}
}
class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
		System.out.println("����");
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

		Animal c1=new Cat();//��������������ת��
		c1.eat();
		
		//�����Ҫ����è�����з���
		//ǿ�ƽ���������ã�תΪ���������.����ת����è
		Cat c2 =(Cat)c1;
		c2.catchMouse();

		//ǧ��Ҫ���������Ĳ��������������תΪ��������
		//��ת�����Ǹ�������ָ�����Լ� ������Ķ���ʱ�������ÿ��Ա�������Ҳ���Ա�ǿ��ת��
		//��̬��ʼ���ն���������������仯
		//Animal a=new Animal();
		//Cat c=(Cat)a;

		function(new Dog());


	}
	public static void function(Animal a)
	{
		a.eat();
		if (a instanceof Cat)//�ؼ���instanceof �ж�
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
	//�ҵ����еĹ���
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
