/*
final:���գ���Ϊһ�����η�
	1�����������࣬����������
	2����final���ε��಻���Ա��̳�.Ϊ�˱��ⱻ�̳У������ิд����
	3����final���εķ��������Ա���д
	4����final���εı�����һ��ֻ�ܸ�ֵһ�Σ��ȿ������γ�Ա������Ҳ�������ξֲ�����
		����������ʱ��һЩ���ݵ�ֵ�ǹ̶��ģ���ôΪ����ǿ�Ķ��ԣ�������Щֵ�������
		����Щֵ����Ҫ�ı䣬���Լ���final���Ρ���Ϊ����������д�Ĺ淶������ĸ����д���������ʣ���_����
	5���ڲ��ඨ�������еľֲ�λ����ʱ��ֻ�ܷ��ʸþֲ���final���εľֲ�����

Ŀǰѧ��������η���public final
*/
class Demo
{
	final double PI=3.14;
	final void show1()
	{}
	void show2()
	{}
}
class SubDemo extends Demo
{
	//void show1(){}//��final���εķ��������Ա���д
}
class FinalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
