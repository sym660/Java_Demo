/*
���󣺶���һ��hello worldС����

˼·��
1��
2��

���裺
1��ͨ��class�ؼ��ֶ���һ���࣬�����붼��д��������
2��Ϊ�˱�֤�������У������ж���һ������������ʽ��public static void main(String[] args)
3,�����һ����չ��ΪJava���ļ�

���ߣ�����ʦ��sym
�汾��v1.0
�������������ʾHello World
*/
class Demo //����һ����
{	
	/*
	main�������Ա�֤�ó����������
	���ǳ�������
	*/
	public static void main(String[] args)
	{			
		//Day01
		//����ַ���
		System.out.println("Hello java");
		//������γ���
		System.out.println(60);



		//Day02
		//60��ʮ�����Ʊ���
		System.out.println(0x3c);
		//6�Ķ�����
		System.out.println(Integer.toBinaryString(6));
		//-6�Ķ�����
		System.out.println(Integer.toBinaryString(-6));
		//С��Ĭ��double��,����Ϊ������ʱҪ��f
		float f = 2.3f;
		System.out.println(f);
		//����ת��
		byte b = 3;
		//b = b + 2;//����
		//ǿ������ת��
		b=(byte)(b+2);
		System.out.println(b);
		//�ַ���a��ռ2����λ��1��intռ4����λ����a������
		System.out.println('a'+1);
		//����ַ���ǿ��ת��
		System.out.println((char)('a'+1));
		System.out.println((char)5);
		//ȡģ���㼴ȡ��
		System.out.println(10%4);
		//�ַ������κ�������+�����ӣ����ն���Ϊ 
		System.out.println('a'+b);
		/*ת���ַ�--ͨ��\��ת��������ĸ����ŵĺ���
		\n:����
		\b:�˸�
		\r:���»س���windowϵͳ�У��س����������ַ�����ʾ\r\n
		\t:�Ʊ����tab
		*/
		System.out.println("Hello \t world");
		System.out.println("\\hello\\");
		//��ֵ
		int x = 3;
		x+=4;//x=x+4
		System.out.println(x);
		//�Ƚ������
		System.out.println(4>5);
		//λ����,����Ч��2*8����
		System.out.println(2<<3);
		/*&&��&��||��|������
		&&�������Ϊfalse��ʱ�����ұߵ�����
		&�����߶�����
		*/
		//���õ���������������������ֵ
		int m=3,n=2;
		//����һ
		n=m+n;
		m=n-m;
		n=n-m;
		System.out.println("n="+n+",m="+m);
		//������
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println("n="+n+",m="+m);
		//λ��������ô�
		//��ȡ60�ĵ���λ,��15&
		int num=60;
		int n1=num & 15;
		System.out.println((n1>9)?((char)(n1-10+'A')):n1);//������У��漰ǿת����
		//System.out.println((char)((num&15)-10+'A'));
		//��ȡ��һ����λ��������4λ
		num=num >>> 4;
		int n2=num & 15;
		System.out.println((n2>9)?((char)(n2-10+'A')):n2);
		//System.out.println(num);
		//�޷��ж�ֵ�Ƿ����9��Ҫ�õ���Ԫ����������������ʽ�������ʽһ�����ʽ��
		//System.out.println((char)((num&15)-10+'A'));

		//�жϽṹ
		/*
		if else �ṹ ��д��ʽ�� ����=���������ʽ�������ʽһ�����ʽ����
		�ô����򻯴���
		�׶ˣ�������������
		����ԭ�����жϲ���Ҫ�����ݷ�Χ
		*/
		int if_x = 2;
		if(if_x==2)
		{
			System.out.println(if_x+"��2");
		}
		else
		{
			System.out.println("nihao");
		}
		switch(if_x)//������������int��byte/short/char
		{
			case 1:
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				break;
			default://default�������ģ�����case����ʼִ��
				System.out.println("");
				break;//��ʡ��
		}

		//ѭ���ṹ
		int while_x=0;
		while(while_x<3)
		{
			System.out.println(while_x);
			while_x++;
		}
		//do....while �ṹ
		do
		{
			System.out.println(while_x);
			while_x++;
		}
		while (while_x<6);
		//for(,,){}
		int for_x=1;
		for(System.out.println("a");for_x<3;System.out.println("c"))
		{
			System.out.println("d");
			for_x++;
		}
		//break continue��ֻ������ѭ����,continue ��������ѭ��ִ���´�ѭ��
		for(int cx=1;cx<10;cx++)
		{
			if(cx%2==1)
				continue;
			System.out.println("cx="+cx);
		}
		 

	}
}