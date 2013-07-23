/*
数组：同一种类型的数据集合，是一个容器
好处：对数组中的元素编号，方便操作，从0开始

格式1：
	元素类型[] 数组名 = new 元素类型[元素个数或数组长度] 
格式2：
	元素类型[] 数组名 = new 元素类型[]{元素1，元素2，.....}

二维数组

java 的内存结构
	启动后再内存中开辟的五个区
	1，栈内存
		存局部变量，数据使用完它，所占空间自动释放
	2，堆内存
		数字和对象，通过new方法建立的实例都在堆内存中
		每个实体都有内存地址
		实体中的变量都有默认初始值
		实体不再被使用，会在不确定时间被垃圾回收器回收
	3，方法区
	4，本地方法区
	5，寄存器

*/
//import java.util.*;
class ArrayDemo
{
	public static void main(String[] args) 
	{
		//需求：定义一个存3个整数的容器
		int[] arr = new int[3];//x是数组类型，属引用类型的一种，x指向数组的首地址
		//也可以这样定义： int arr[] = new int[3]
		int[] arr2 = new int[]{9,3,1,8,10};//静态初始化方式
		//简写：int[] arr={1，2，4}；
		
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
		//访问到了不存在的数组
		//arr=null;
		//System.out.println(arr[1]);//System.out.println(arr[3]);
		//空指针异常
		System.out.println(arr2);//打印出的是引用地址[i@2222
		//length属性可以直接获得数组长度
		System.out.println("Length="+arr2.length);

		//二维数组
		int[][] arrs=new int[3][4];//定义了一个二维数组，二维数组中有3个一维数组
									//每个一维数组有4个元素
		System.out.println(arrs);//打印出的是引用地址[[i@2222
		System.out.println(arrs[0]);//打印出的仍然是引用地址[i@4444--对应二维数组中的一个数组
		
		int[][] arrs2=new int[3][];//此时定义了三个一维数组，但未初始化，数组默认值null（引用型为null）
		arrs2[0]=new int[3];
		arrs2[1]=new int[2];
		arrs2[2]=new int[4];
		System.out.println("Length2="+arrs2.length);
		System.out.println("Length20="+arrs2[0].length);

		
		System.out.println(getMax(arr2));
		System.out.println(getMin(arr2));
		//selectSort(arr2);
		bubbleSort(arr2);
		//Arrays.sort(arr2);//真是开发时用这个
		printArray(arr2);
		System.out.println(halfSearch(arr2,8));
		toBin(60);
		toHex(60);
		toHex2(60);
		toBin3(60);
		toBa3(60);
		toHex3(60);

		
		
	}
	//获取数组中的最大值
		//注意：max初始化不要设置为0，因为数组中可能都是负数，可以初始化为任意一个数组值
		//也可以初始话为0，但此时max代表的是临时最大值的对应脚标
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
		//方法二
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
		//选择排序，排完后不需要返回void
		//内循环完一次，最值出现在首脚标位
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			for(int y=x+1;y<arr.length-1;y++)//思考y=x+1,length-1
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
	//冒泡排序:相邻两个元素进行比较，符合条件换位
	//第一圈，最值出现在最后位
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
	//提高效率的方法：
	//	把在堆内存中频繁的换位置转移到栈内存中，到比完后再置换

	//排序方式中最快的是希尔排序

	//可以把换位置的功能提取，单独制作函数
	public static void swap(int[] arr,int a,int b)
	{
		arr[a]=arr[a]^arr[b];
		arr[b]=arr[a]^arr[b];
		arr[a]=arr[a]^arr[b];
	}
	/*
	折半查找。提高效率，但要在数组有序时用
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
	折半的第二种方式
	*/
	public static int halfSearch_2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;
		while(min<=max)
		{
			mid=(max+min)>>1;//右移一位即除以2
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			else
				return mid;
		}
		return -1;
	}
	//进制转换函数
	//十进制-->二进制
	public static void toBin(int num)
	{
		StringBuffer sb=new StringBuffer();//新建一个容器
		while(num>0)
		{
			sb.append(num%2);//添加进容器
			num=num/2;
		}
		//System.out.println(sb);

		System.out.println(sb.reverse());//reverse(),反转
	}
	//十进制--〉十六进制
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
	//改进：用查表法转换十进制--〉十六进制
	/*
		0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F---十六进制中的元素
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		通过数组的形式来建立表
		
	*/
	public static void toHex2(int num)
	{
		char[] chs={'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};
		//定义一个数组容器
		char[] arr=new char[8];
		//定义指针来去掉多余0位
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
		//printArray(arr);利用重载函数
	}
	//也可以用类似的方法做二进制转换
	//优化：抽取共性
	//建立一个多功能的转换进制的函数
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
		//定义一个数组容器
		char[] arr=new char[32];
		//定义指针来去掉多余0位
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
	public static void toBa3(int num)//转八进制
	{
		trans(num,7,3);
	}

	public static void toHex3(int num)
	{
		trans(num,15,4);
	}
	//打印函数
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
