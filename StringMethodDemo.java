/*

String����ĳ�������

	1����ȡ
		1.1 �ַ����а����� �ַ�����Ҳ�����ַ��ĳ���
			int length(): ��ȡ����
		1.2 ����λ�û�ȡĳλ���ϵ��ַ�
			char charAt(int index)
		1.3 �����ַ���ȡ���ַ����ַ�����λ��
			int indexOf(int ch): ���ص�ʱch���ַ����е�һ�γ��ֵ�λ��
			int indexOf(int ch,int formIndex) ��formIndexָλ�ÿ�ʼ����ȡ���ַ����г��ֵ�λ��

			int indexOf(int ch): ���ص�ʱch���ַ����е�һ�γ��ֵ�λ��
			int indexOf(int ch,int formIndex) ��formIndexָλ�ÿ�ʼ����ȡ���ַ����г��ֵ�λ��
	2, �ж�
		2.1 �ַ������Ƿ����ĳһ���ַ���
			boolean contains(str);
		2.2 �ַ����Ƿ�������
			boolean isEmpty();
		2.3 �ַ�����ָ�����ݿ�ͷ
			boolean startsWith(str);
		2.4 �ַ����Ƿ���ָ�����ݽ�β
			boolean endsWith(str);
		2.5 �ж��ַ����е������Ƿ���ͬ����дObject���е�equals����
			boolean equals(str);
		2.6 �ж������Ƿ���ͬ�����Դ�Сд
			boolean equalsIngoreCase();
*/
class  StringMethodDemo
{
	public static void method_get()
	{
		String str="abcdeakpf";
		sop(str.length());
		sop(str.indexOf('a'));
		sop(str.charAt(5));
		sop(str.indexOf('a',3));

		//��������һ���ַ����ֵ�λ��
		sop(str.lastIndexOf("a"));
	}

	public static void method_is()
	{
		String str1="ArrayDemo.java";

		sop(str1.startsWith("Array"));
		sop(str1.endsWith(".java"));
		sop(str1.contains("Demo"));
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		method_get();
		method_is();
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
