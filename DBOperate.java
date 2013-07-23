/*
�������ݿ�Ĳ���
	�����ǣ�����Ϣ

	1��Ҫ�������ݿ⡣ JDBC Hibernate
	2���������ݿ�
		c creat r read u update d delete		
	3���ر����ݿ�����
*/
interface UserInfoDao
{
	public void add(User user);
	public void delete(User user);
}
class UserInfoByJDBC implements UserInfoDao
{
	public void add(User user)
	{
		/*
		1��JDBC�������ݿ�
		2��ʹ��sql�������������
		3���ر�����
		*/
	}
	public void delete(User user)
	{
		/*
		1,JDBC�������ݿ�
		2��ʹ��sql������ɾ������
		3���ر�����
		*/
	}
}
class UserInfoByHibernate implements UserInfoDao
{
	public void add(User user)
	{
		/*
		1��Hibernate�������ݿ�
		2��ʹ��sql�������������
		3���ر�����
		*/
	}
	public void delete(User user)
	{
		/*
		1,Hibernate�������ݿ�
		2��ʹ��sql������ɾ������
		3���ر�����
		*/
	}

}
class User
{
	public String name;
}
class  DBOperate
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//UserInfoBYJDBC ui=new UserInfoByJDBC();
		UserInfoDao ui=new UserInfoByHibernate();
		ui.add(new User());
		ui.delete(new User());
	}
}
