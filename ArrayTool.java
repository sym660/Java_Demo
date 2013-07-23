/*静态的应用
没一个应用程序都有共性功能，抽取出来独立封装以便复用
虽然通过建立ArrayTool的对象使用这些工具方法，对数组进行操作
但发现了问题:
	1,对象是用于封装数据的，但ArrayTool没有封装特有数据
	２，操作数组的没一个方法都没有用到ＡｒｒａｙＴｏｏｌ对象中的特有数据
	这时考虑，为程序严谨，不需要对象
	可以将ArrayTool中的方法都定义为ｓｔａｉｃ，直接通过类名调用
将方法都静态后，可以方便使用，但是该类还是可以被其他程序建立对象的，
为了严谨，强制对不让建立对象
可以通过将构造函数私有化

总之，能隐藏的就隐藏了

为了时使用方便，仍需制作说明书
*/

/**
只是一个对数组进行操作的工具类，该类提供了获取最值
@author 北落实门
@version V1.1
*/
public class ArrayTool
{
	//public int getMax(int[] arr)
	//将构造函数私有化
	/**
	空参数构造函数
	*/
	private ArrayTool(){}
	/**
	获取一个整型数组的最大值
	@param arr 接收一个int类型的数组
	@return 会返回该数组的最大值
	*/
	public static int getMax(int[] arr)
	{
		int max=0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	/**
	获取一个整型数组的最小值
	@param arr 接收一个int类型的数组
	@return 会返回该数组的最大值
	*/
	public static int getMin(int[] arr)
	{
		int max=0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[max])
				max=x;
		}
		return arr[max];
	}

}
/*
默认构造函数的权限是随着类的变化而变化的
*/