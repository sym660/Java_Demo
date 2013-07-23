/*
需求：定义一个hello world小程序

思路：
1，
2，

步骤：
1，通过class关键字定义一个类，将代码都编写到该类中
2，为了保证独立运行，在类中定义一个主函数，格式是public static void main(String[] args)
3,保存成一个扩展名为Java的文件

作者：北落师门sym
版本：v1.0
这个类是用于演示Hello World
*/
class Demo //定义一个类
{	
	/*
	main函数可以保证该程序独立运行
	他是程序的入口
	*/
	public static void main(String[] args)
	{			
		//Day01
		//输出字符串
		System.out.println("Hello java");
		//输出整形常量
		System.out.println(60);



		//Day02
		//60的十六进制表现
		System.out.println(0x3c);
		//6的二进制
		System.out.println(Integer.toBinaryString(6));
		//-6的二进制
		System.out.println(Integer.toBinaryString(-6));
		//小数默认double型,定义为单精度时要加f
		float f = 2.3f;
		System.out.println(f);
		//类型转换
		byte b = 3;
		//b = b + 2;//报错
		//强制类型转换
		b=(byte)(b+2);
		System.out.println(b);
		//字符‘a’占2个八位，1是int占4个八位，‘a’提升
		System.out.println('a'+1);
		//输出字符，强制转换
		System.out.println((char)('a'+1));
		System.out.println((char)5);
		//取模运算即取余
		System.out.println(10%4);
		//字符串和任何数据用+相连接，最终都变为 
		System.out.println('a'+b);
		/*转义字符--通过\来转换后面字母或符号的含义
		\n:换行
		\b:退格
		\r:按下回车，window系统中，回车符由两个字符来表示\r\n
		\t:制表符，tab
		*/
		System.out.println("Hello \t world");
		System.out.println("\\hello\\");
		//赋值
		int x = 3;
		x+=4;//x=x+4
		System.out.println(x);
		//比较运算符
		System.out.println(4>5);
		//位运算,最有效的2*8运算
		System.out.println(2<<3);
		/*&&和&；||和|的区别
		&&：在左边为false的时候不做右边的运算
		&：两边都运算
		*/
		//不用第三方变量交换两个变量值
		int m=3,n=2;
		//方法一
		n=m+n;
		m=n-m;
		n=n-m;
		System.out.println("n="+n+",m="+m);
		//方法二
		n=n^m;
		m=n^m;
		n=n^m;
		System.out.println("n="+n+",m="+m);
		//位移运算的用处
		//获取60的低四位,与15&
		int num=60;
		int n1=num & 15;
		System.out.println((n1>9)?((char)(n1-10+'A')):n1);//结果不行，涉及强转问题
		//System.out.println((char)((num&15)-10+'A'));
		//获取下一个四位，先右移4位
		num=num >>> 4;
		int n2=num & 15;
		System.out.println((n2>9)?((char)(n2-10+'A')):n2);
		//System.out.println(num);
		//无法判断值是否大于9，要用到三元运算符：（条件表达式）？表达式一：表达式二
		//System.out.println((char)((num&15)-10+'A'));

		//判断结构
		/*
		if else 结构 简写格式： 变量=（变量表达式）？表达式一：表达式二；
		好处：简化代码
		弊端：必须有运算结果
		基本原则：先判断不需要的数据范围
		*/
		int if_x = 2;
		if(if_x==2)
		{
			System.out.println(if_x+"是2");
		}
		else
		{
			System.out.println("nihao");
		}
		switch(if_x)//接受四种类型int、byte/short/char
		{
			case 1:
				System.out.println("");
				break;
			case 2:
				System.out.println("");
				break;
			default://default不管在哪，都从case处开始执行
				System.out.println("");
				break;//可省略
		}

		//循环结构
		int while_x=0;
		while(while_x<3)
		{
			System.out.println(while_x);
			while_x++;
		}
		//do....while 结构
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
		//break continue智只能用于循环体,continue 结束本次循环执行下次循环
		for(int cx=1;cx<10;cx++)
		{
			if(cx%2==1)
				continue;
			System.out.println("cx="+cx);
		}
		 

	}
}