/*
�ַ������ص�

��ȻIO�������ڲ������ݵ�
��ô���ݵ���� ����ʽ�ǣ��ļ�

�Բ����ļ�Ϊ������ʾ
������Ӳ���ϣ�����һ���ļ���д��һЩ��������
�ҵ�һ��ר�����ڲ����ļ���Writer�������FileWriter ����׺���Ǹ�������ǰ׺���Ǹ�������Ĺ���

*/
import java.io.*;

class FileWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		//System.out.println("Hello World!");
		//����һ��FileWriter���󣬸ö���һ����ʼ�ͱ���Ҫ��ȷҪ�������ļ�
		//���Ҹ��ļ��ᱻ������ָ��Ŀ¼�£������Ŀ¼������ͬ���ļ����ᱻ����
		//FileWriter fw=new FileWriter("demo.txt",true);����һ��true��������������Դ�ļ������ļ�ĩβ��д
		FileWriter fw=new FileWriter("demo.txt");
		
		//����writer���������ַ���д�뵽����
		fw.write("abcde");
		//ˢ�������󻺳��е�����
		//������ˢ��Ĺ����
		fw.flush();
		fw.close();
	}
}
