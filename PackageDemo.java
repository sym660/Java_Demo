/*
package
	对类文件进行分类管理
	给类提供多层命名空间
	写在程序文件的第一行

javac -d . PackageDemo.java//编译时，自动生成包


import 导入 的是包中的
建议不要写通配符* ，需要用哪个类导入哪个类
*/

package pack;
import packa.*;
public class  PackageDemo
{
	public static void main(String[] args) 
	{
		packa.DemoA d=new packa.DemoA();
		d.show();
		System.out.println("Hello World!");
	}
}
