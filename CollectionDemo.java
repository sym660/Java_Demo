/*
������
	�ص㣺���ڴ洢���󣬳��ȿɱ䣬���Դ洢��ͬ����
		Ϊʲô����ô�������أ�
			��Ϊÿһ�����������ݵĴ洢��ʽ����ͬ������洢��ʽ��Ϊ�����ݽṹ
*/
import java.util.*;
class  CollectionDemo
{
	public static void method_base()
	{
		//����һ������������ʹ��collection�ӿڵ�����ArrayList
		ArrayList al=new ArrayList();
		
		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//��ӡ����
		sop(al);

		//ɾ��Ԫ��
		al.remove("java02");

		//��ȡ���ϳ���

		sop(al);

		//���
		al.clear();
		sop(al.size());
	}
	public static void method_2()
	{
		ArrayList al1=new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		ArrayList al2=new ArrayList();

		al2.add("java01");
		al2.add("java02");
		al2.add("java07");
		al2.add("java08");

		sop("al1="+al1);
		sop("al2="+al2);
		
		//ȡ������
		al1.retainAll(al2);
		sop("al1--"+al1);
		
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		method_2();
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
