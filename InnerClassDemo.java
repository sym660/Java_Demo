/*
�ڲ�����ʹ���
	1���ڲ������ֱ�ӷ����ⲿ�࣬����˽��
		֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г�����һ���ⲿ������ã�
		��ʽ�ǣ��ⲿ��.this
	2���ⲿ��Ҫ�����ڲ��У����뽨���ڲ������

���ʸ�ʽ��
	1�����ڲ��ඨ�����ⲿ��ĳ�Աλ����ʱ �����ҷ�˽�У��������ⲿ��������
	����ֱ�ӽ����ڲ������
	��ʽ��
			�ⲿ��.�ڲ����� ������=�ⲿ�����.�ڲ������
			Outer.Inner in=new Outer().new Inner();

	2,���ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η�������
		���磬private�����ڲ������ⲿ���н��з�װ
			static���ڲ���;߱��˾�̬������
				����̬�ڲ���ֻ�ܷ��ʾ�̬�ⲿ�࣬���ַ��ʾ�����

		���ⲿ�������У����ֱ�ӷ��ʾ�̬�ڲ���
		new Outer.Inner().function();
		���ⲿ�������У����ֱ�ӷ��ʾ�̬�ڲ��� �ľ�̬��Ա
		Outer.Inner.function();

		ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ�������Ǿ�̬��
			���ⲿ���еľ�̬���������ⲿ��ʱ���ڲ���Ҳ�����Ǿ�̬��

����������ʱ��������ڲ�����������������ڲ���������
��Ϊ�ڲ�������ʹ���ⲿ���������

class Body
{
	private class XinZang
	{

	}
	pulic void()
	{
		new XinZang().
	}
}

*/
class Outer
{
	private int x =3;
	class Inner//�ڲ���,��ʱ����Լ�private���η�
	{
		int x=4;
		void function()
		{
			int x=6;
			System.out.println("inner:"+Outer.this.x);//Ҫ��ӡ4����this�ؼ��֣�Ҫ��ӡ4����Outer.this
		}
	}
	void method()
	{
		Inner in=new Inner();
		in.function();
	}
}
class  InnerClassDemo
{
	public static void main(String[] args) 
	{
		Outer out=new Outer();
		out.method();
		//ֱ�ӷ����ڲ���ĳ�Ա
		//Outer.Inner in=new Outer().new Inner();
		//in.function();
		//System.out.println("Hello World!");
	}
}
