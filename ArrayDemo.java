/*
���飺ͬһ�����͵����ݼ��ϣ���һ������
�ô����������е�Ԫ�ر�ţ������������0��ʼ

��ʽ1��
	Ԫ������[] ������ = new Ԫ������[Ԫ�ظ��������鳤��] 
��ʽ2��
	Ԫ������[] ������ = new Ԫ������[]{Ԫ��1��Ԫ��2��.....}

��ά����

java ���ڴ�ṹ
	���������ڴ��п��ٵ������
	1��ջ�ڴ�
		��ֲ�����������ʹ����������ռ�ռ��Զ��ͷ�
	2�����ڴ�
		���ֺͶ���ͨ��new����������ʵ�����ڶ��ڴ���
		ÿ��ʵ�嶼���ڴ��ַ
		ʵ���еı�������Ĭ�ϳ�ʼֵ
		ʵ�岻�ٱ�ʹ�ã����ڲ�ȷ��ʱ�䱻��������������
	3��������
	4�����ط�����
	5���Ĵ���

*/
//import java.util.*;
class ArrayDemo
{
	public static void main(String[] args) 
	{
		//���󣺶���һ����3������������
		int[] arr = new int[3];//x���������ͣ����������͵�һ�֣�xָ��������׵�ַ
		//Ҳ�����������壺 int arr[] = new int[3]
		int[] arr2 = new int[]{9,3,1,8,10};//��̬��ʼ����ʽ
		//��д��int[] arr={1��2��4}��
		
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
		//���ʵ��˲����ڵ�����
		//arr=null;
		//System.out.println(arr[1]);//System.out.println(arr[3]);
		//��ָ���쳣
		System.out.println(arr2);//��ӡ���������õ�ַ[i@2222
		//length���Կ���ֱ�ӻ�����鳤��
		System.out.println("Length="+arr2.length);

		//��ά����
		int[][] arrs=new int[3][4];//������һ����ά���飬��ά��������3��һά����
									//ÿ��һά������4��Ԫ��
		System.out.println(arrs);//��ӡ���������õ�ַ[[i@2222
		System.out.println(arrs[0]);//��ӡ������Ȼ�����õ�ַ[i@4444--��Ӧ��ά�����е�һ������
		
		int[][] arrs2=new int[3][];//��ʱ����������һά���飬��δ��ʼ��������Ĭ��ֵnull��������Ϊnull��
		arrs2[0]=new int[3];
		arrs2[1]=new int[2];
		arrs2[2]=new int[4];
		System.out.println("Length2="+arrs2.length);
		System.out.println("Length20="+arrs2[0].length);

		
		System.out.println(getMax(arr2));
		System.out.println(getMin(arr2));
		//selectSort(arr2);
		bubbleSort(arr2);
		//Arrays.sort(arr2);//���ǿ���ʱ�����
		printArray(arr2);
		System.out.println(halfSearch(arr2,8));
		toBin(60);
		toHex(60);
		toHex2(60);
		toBin3(60);
		toBa3(60);
		toHex3(60);

		
		
	}
	//��ȡ�����е����ֵ
		//ע�⣺max��ʼ����Ҫ����Ϊ0����Ϊ�����п��ܶ��Ǹ��������Գ�ʼ��Ϊ����һ������ֵ
		//Ҳ���Գ�ʼ��Ϊ0������ʱmax���������ʱ���ֵ�Ķ�Ӧ�ű�
	public static int getMax(int[] arr)
		{
			int max=arr[0];
			for(int x=0;x<arr.length;x++)
			{
				if(arr[x]>max)
				{
					max=arr[x];
				}
			}
			return max;
		}
		//������
	public static int getMin(int[] arr)
		{
			int min=0;
			for(int x=0;x<arr.length;x++)
			{
				if(arr[x]<arr[min])
				{
					min=x;
				}
			}
			return arr[min];
		}
		//ѡ�������������Ҫ����void
		//��ѭ����һ�Σ���ֵ�������׽ű�λ
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length-1;y++)//˼��y=x+1,length-1
			{
				if(arr[x]>arr[y])
				{
					//arr[x]=arr[x]^arr[y];
					//arr[y]=arr[x]^arr[y];
					//arr[x]=arr[x]^arr[y];
					swap(arr,x,y);
				}
			}
		}
	}
	//ð������:��������Ԫ�ؽ��бȽϣ�����������λ
	//��һȦ����ֵ���������λ
	public static void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)
			{
				if(arr[y]>arr[y+1])
				{
					//arr[y+1]=arr[y+1]^arr[y];
					//arr[y]=arr[y+1]^arr[y];
					//arr[y+1]=arr[y+1]^arr[y];
					swap(arr,y,y+1);
				}
			}
		}
	}
	//���Ч�ʵķ�����
	//	���ڶ��ڴ���Ƶ���Ļ�λ��ת�Ƶ�ջ�ڴ��У�����������û�

	//����ʽ��������ϣ������

	//���԰ѻ�λ�õĹ�����ȡ��������������
	public static void swap(int[] arr,int a,int b)
	{
		arr[a]=arr[a]^arr[b];
		arr[b]=arr[a]^arr[b];
		arr[a]=arr[a]^arr[b];
	}
	/*
	�۰���ҡ����Ч�ʣ���Ҫ����������ʱ��
	*/
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(min+max)/2;
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
			mid=mid+1;
			else if(key<arr[mid])
				max=mid-1;

			if(min>max)
				return -1;
			mid=(max+min)/2;
		}
		return mid;
	}
	/*
	�۰�ĵڶ��ַ�ʽ
	*/
	public static int halfSearch_2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;
		while(min<=max)
		{
			mid=(max+min)>>1;//����һλ������2
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			else
				return mid;
		}
		return -1;
	}
	//����ת������
	//ʮ����-->������
	public static void toBin(int num)
	{
		StringBuffer sb=new StringBuffer();//�½�һ������
		while(num>0)
		{
			sb.append(num%2);//��ӽ�����
			num=num/2;
		}
		//System.out.println(sb);

		System.out.println(sb.reverse());//reverse(),��ת
	}
	//ʮ����--��ʮ������
	public static void toHex(int num)
	{
		StringBuffer sb=new StringBuffer();
		for(int x=0;x<8;x++)
		{
			int temp=num & 15;
			if(temp>9)
				sb.append((char)(temp-10+'A'));
			else
				sb.append(temp);
			num=num>>>4;
		}
		System.out.println(sb.reverse());
	}
	//�Ľ����ò��ת��ʮ����--��ʮ������
	/*
		0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F---ʮ�������е�Ԫ��
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		ͨ���������ʽ��������
		
	*/
	public static void toHex2(int num)
	{
		char[] chs={'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};
		//����һ����������
		char[] arr=new char[8];
		//����ָ����ȥ������0λ
		int pos=7;
		//for(int x=0;x<8;x++)
		while(num!=0)
		{
			int temp=num & 15;
			arr[pos--]=chs[temp];
			num=num>>>4;
		}
		for(int x=pos+1;x<8;x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
		//printArray(arr);�������غ���
	}
	//Ҳ���������Ƶķ�����������ת��
	//�Ż�����ȡ����
	//����һ���๦�ܵ�ת�����Ƶĺ���
	public static void trans(int num,int base,int offset)
	{
		if(num==0)
		{
			System.out.println(0);
			return;
		}
		char[] chs={'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};
		//����һ����������
		char[] arr=new char[32];
		//����ָ����ȥ������0λ
		int pos=arr.length-1;
		//for(int x=0;x<8;x++)
		while(num!=0)
		{
			int temp=num & base;
			arr[pos--]=chs[temp];
			num=num>>>offset;
		}
		for(int x=pos+1;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
	public static void toBin3(int num)
	{
		trans(num,1,1);
	}
	public static void toBa3(int num)//ת�˽���
	{
		trans(num,7,3);
	}

	public static void toHex3(int num)
	{
		trans(num,15,4);
	}
	//��ӡ����
	public static void printArray(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
	}
	public static void printArray(char[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
}
