/*
用于演示函数的Demo程序
函数的定义   修饰符 返回值类型 函数名（参数类型 形式参数1， 参数类型 形式参数2,....)
				{
					执行语句；
					return 返回值；
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
	//定义一个函数，实现功能，注意：不能在函数中定义函数，只能调用函数
	public static int getResult(int num)//static 必须有，才能被static主函数调用
	{
		return num*3+5;
	}
	//函数运算没有返回值时，用void,此时return可省略
	public static void getPrint(int num2)
	{
		System.out.println(num2*4+2);
	}
	/*
	重载：在同一个类中，允许存在一个以上的同名函数，只要他们的参数类型或参数个数不同
	即重载只和参数有关
	什么时候用重载？
	定义功能相同，但参与运算的未知内容不同，为方便阅读，用相同函数名，通过参数列表区分
	*/
	//重载练习
	//定义一个加法运算，获取两个整数的和
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
				System.out.print(y+"*"+x+"="+y*x+"\t");//\t制表符
			}
			System.out.println();
		}
	}

	

}
