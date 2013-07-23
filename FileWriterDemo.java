/*
字符流的特点

既然IO流适用于操作数据的
那么数据的最常见 的形式是：文件

以操作文件为主来演示
需求：在硬盘上，创建一个文件并写入一些文字数据
找到一个专门用于操作文件的Writer子类对象。FileWriter 。后缀名是父类名。前缀名是该流对象的功能

*/
import java.io.*;

class FileWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		//System.out.println("Hello World!");
		//创建一个FileWriter对象，该对象一被初始就必须要明确要操作的文件
		//而且该文件会被创建到指定目录下，如果该目录下已有同名文件，会被覆盖
		//FileWriter fw=new FileWriter("demo.txt",true);传递一个true参数，代表不覆盖源文件，在文件末尾续写
		FileWriter fw=new FileWriter("demo.txt");
		
		//调用writer方法，将字符串写入到流中
		fw.write("abcde");
		//刷新流对象缓冲中的数据
		//将数据刷到墓地中
		fw.flush();
		fw.close();
	}
}
