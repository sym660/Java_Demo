/*
�쳣


Throwable
	|--Error
	|--Exception

�쳣����

java �ṩ�����е������д���

try
{
	��Ҫ�����Ĵ��룻
}
catch
{
	�����쳣���뷽ʽ��
}
finally
{
	һ����ִ�е���䣻
}


�����ȡ�쳣���������г����Ĳ���
		String getMessage()

�����������Ҫ��ʾ�׳��쳣 throws Exception

�Զ��쳣�Ĵ���
	1�������쳣ʱ����������Ϊ��������쳣�����ڴ���
	2,�Է���������쳣���Ͷ�Ӧ���catch�飬��Ҫ��������
	������catch���д����쳣�̳й�ϵ������catch�����������

��������catch����ʱ��Ҫ�������Ĵ�����䣬
��Ҫֻ������쳣���

*/
class Demo
{
	int div(int x,int y)throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�Ĺؼ��������˸ù��ܿ��ܻ��������
	{
		int[] arr=new int[x];
			System.out.println(arr[4]);
		return x/y;
	}
}
class  ExceptionDemo
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			int x=d.div(4,0);//new AritchmeticException()
			System.out.println("x="+x);
		}
		catch (ArithmeticException e)//e���׹������쳣����  Exception e=new AritchmeticException();��̬
		{
			System.out.println("����0��");
			System.out.println(e.getMessage());// / by zero
			System.out.println(e);//�Զ�����toString()//�쳣���ƣ��쳣��Ϣ
			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ��//��JvmĬ�ϵ��׳�

		}
		catch (ArrayIndexOutOfBoundsException e)//e���׹������쳣����  Exception e=new AritchmeticException();��̬
		{
			System.out.println("�ű�Խ����");
			System.out.println(e.getMessage());// / by zero
			System.out.println(e);//�Զ�����toString()//�쳣���ƣ��쳣��Ϣ
			e.printStackTrace();//�쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ��//��JvmĬ�ϵ��׳�

		}
		System.out.println("Hello World!");
	}
}
