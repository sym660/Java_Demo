/*
������ʾ������Demo����
�����Ķ���   ���η� ����ֵ���� ���������������� ��ʽ����1�� �������� ��ʽ����2,....)
				{
					ִ����䣻
					return ����ֵ��
				}
*/
class FunctionDemo 
{
	public static void main(String[] args) 
	{
		
		System.out.println(getResult(4));
		getPrint(4);
		System.out.println(add(4,5));
		System.out.println(add(4,5,6));
		print99(6);

	}
	//����һ��������ʵ�ֹ��ܣ�ע�⣺�����ں����ж��庯����ֻ�ܵ��ú���
	public static int getResult(int num)//static �����У����ܱ�static����������
	{
		return num*3+5;
	}
	//��������û�з���ֵʱ����void,��ʱreturn��ʡ��
	public static void getPrint(int num2)
	{
		System.out.println(num2*4+2);
	}
	/*
	���أ���ͬһ�����У��������һ�����ϵ�ͬ��������ֻҪ���ǵĲ������ͻ����������ͬ
	������ֻ�Ͳ����й�
	ʲôʱ�������أ�
	���幦����ͬ�������������δ֪���ݲ�ͬ��Ϊ�����Ķ�������ͬ��������ͨ�������б�����
	*/
	//������ϰ
	//����һ���ӷ����㣬��ȡ���������ĺ�
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static int add(int x,int y, int z)
	{
		return x+y+z;
	}
	public static void print99(int num)
	{
		for(int x=1;x<=num;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");//\t�Ʊ��
			}
			System.out.println();
		}
	}

	

}
