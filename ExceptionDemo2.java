/*
�Զ����쳣��javaδ������쳣
	�����Զ����װ

�����ڱ������У��Գ�����-1��Ҳ��Ϊ����
	����Ҫ�������������Զ�������

���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ������Ӧ�Ĵ�����
	Ҫôtry  catch����
	Ҫô�����������õ����ߴ���

	һ������ں����ڳ����쳣��������Ҫ����
���ִ�ӡ���ֻ���쳣���ƣ�ȴû���쳣��Ϣ
	��Ϊ�Զ����쳣û�ж�����Ϣ

��ζ����쳣��Ϣ��
��Ϊ�����Ѿ��Ѷ����쳣��Ϣ�Ĳ����������
������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ�����ͨ��super���
��ô�ÿ���ֱ��ͨ��getMessage����ȡ���Զ�����쳣��Ϣ

�Զ����쳣��
	�������Զ�����̳�Exception

	ΪʲôҪ�̳�Exception��
		�쳣��ϵ��һ���ص㣺�쳣����쳣������Ҫ���׳�
		���Ƕ��߱������ԣ������������Throwable�����ϵ�ж��� ���ص�
		ֻ�������ϵ�е���Ͷ�����ܱ�throws��throw����
		
throws��throw������
	throwsʹ���ں�����
	throwʹ���ں�����

	throws����������쳣�࣬���Ը����
	throw����������쳣����

Exception����һ������������쳣RuntimeException����ʱ�쳣
����ں��������׳����쳣�������Ͽ��Բ�������������ͨ��
����ں����������˸��쳣�������߿��Բ����д�������ͨ��
 
 ֮���Բ����ٺ�������������Ϊ����Ҫ�õ����ߴ���
 �����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������
 ϣ��ֹͣ����󣬶Դ�������

�Զ����쳣ʱ��������쳣�ķ����޷��ڼ�����������Ļ��������Զ����쳣�̳�RunTimeException
�����쳣��������
	1������ʱ�������쳣
	2������ʱ���������쳣������ʱ�쳣��RuntimeException�Լ������ࣩ

finally����ִ��һ��Ҫִ�еĺ���
	���磬�ر���Դ

*/
class FuShuException extends Exception
{
	FuShuException()
	{

	}
	FuShuException(String msg)
	{
		super(msg);
	}

}
class Demo 
{
	int div(int a,int b)throws FuShuException
	{
		if(b<0)
			throw new FuShuException("����");//�ֶ�ͨ��throw�׳��쳣
		return a/b;
	}
}
class ExceptionDemo2 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,-1);
			System.out.println("x:"+x);

		}
		catch (FuShuException e)
		{
			System.out.println(e);

		}
		//System.out.println("Hello World!");
	}
}
