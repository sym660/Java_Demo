/*
���󣺻�ȡһ�γ������� ��ʱ��
ԭ����ȡ����ʼ�ͽ�����ʱ�䣬���

��ȡʱ��:System.currentTimeMillis������

����������Ż�����Խ����������

���ַ�ʽ����Ϊģ�淽ʽ���ģʽ
ʲô��ģ�淽���أ�
	�ڶ��幦��ʱ�����ܵ�һ������ȷ���ģ�����һ�����ǲ�ȷ���ģ���ȷ���Ĳ�����ʹ�ò�ȷ���Ĳ���
	��ô���¾ͽ���ȷ���Ĳ��ֱ�¶��ȥ���и��������ȥ���
*/
abstract class GetTime
{
	public void getTime()
	{
		long start=System.currentTimeMillis();
		//�ⲿ�ֲ�ȷ����Ҫ��ȡ�������������ʱ��
		//����һ���̳�getTime��д���Ƚ��鷳
		//����������װ���к������̳к�ֻҪ��д�ú���
		/*
		for(int x=0;x<1000;x++)
		{
			System.out.print(x);
		}
		*/
		runcode();
		long end=System.currentTimeMillis();
		System.out.println("���룺"+(end-start));
		
	}
	public abstract void runcode();
}
class SubTime extends GetTime
{
	public void runcode()
	{
		for(int x=0;x<4000;x++)
		{
			System.out.print(x);
		}
		
	}
}
class  TemplateDemo
{
	public static void main(String[] args) 
	{
		SubTime gt=new SubTime();
		gt.getTime();
	}
}
