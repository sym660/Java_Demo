/*
�ӿڣ�������⣬������Ϊ��һ������ĳ�����
	���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ

	class���ڶ�����
	interface���ڶ��ڽӿ�

�ӿڶ���ʱ����ʽ�ص㣺
	1.�ӿ��еĳ������壺���������󷽷�
	2���ӿڵĳ�Ա�й̶������η�
		����
		����
		
��ס���ӿ��еĳ�Ա����public ��

�ӿڣ��ǲ����Դ�������ģ���Ϊ�г��󷽷�
��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ���Ǻ�����ſ���ʵ����
����������һ�������ࡣ

�ӿڿ��Ա����ʵ�֣�Ҳ�ǶԶ�̳в�֧�ֵĲ��䣬java�б���˶�ʵ��

һ�������ʵ�ֶ���ӿ�

�ô���
	�ӿ��Ƕ��Ⱪ¶ԭ��
	�ӿ��ǳ���Ĺ�����չ
	�ӿڿ���������ʵ��
	����ӿ�֮����ʵ�֣���������Լ̳�һ�����ͬʱʵ�ֶ���ӿڣ��ӿ���ӿ�֮������м̳й�ϵ
*/
interface Inter
{
	public static final int NUM = 3;//ǰ�����η�ʡ���ˣ�ϵͳ���Զ�����
	public abstract void show();
}
interface InterA
{
	public abstract void method();
	public abstract void show();//����ͬ��û��ϵ����Ϊû�з����壬������Ҫʵ��

}
interface C extends Inter,InterA
{
	public abstract void method2();
}
class Demo
{
	public void function(){}
}
class Test extends Demo implements Inter,InterA   //�ӿ�����ʵ�ֹ�ϵ�������ڼ̳й�ϵ������Ҫ���ӿ��еĳ���ʵ��
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
