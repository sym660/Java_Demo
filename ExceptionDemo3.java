/*
�쳣���Ӹ��า���е����֣�
	1�������ڸ��Ǹ���ʱ���������ķ����׳��쳣����ô����ĸ��Ƿ�����ֻ���׳�������쳣���߸��쳣�����ࡣ
	2��������෽���׳�����쳣����ô�����ڸ��Ǹ÷���ʱ��ֻ���׳������쳣���Ӽ�
	3�����������߽ӿڵķ�����û���쳣�׳��������ְ����Ƿ���ʱ��Ҳ�������׳��쳣
	������෢���쳣���ͱ���Ҫ����try�������Բ�����
*/
class AException extends Exception
{
}
class BException extends AException
{
}
class CException extends Exception
{
}
class Fu
{
	void show() throws AException
	{

	}
}
class Zi extends Fu
{
	void show() throws BException//��A�쳣��B�쳣��������C
	{

	}
}
class  ExceptionDemo3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
