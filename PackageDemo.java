/*
package
	�����ļ����з������
	�����ṩ��������ռ�
	д�ڳ����ļ��ĵ�һ��

javac -d . PackageDemo.java//����ʱ���Զ����ɰ�


import ���� ���ǰ��е�
���鲻Ҫдͨ���* ����Ҫ���ĸ��ർ���ĸ���
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
