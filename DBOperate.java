/*
需求：数据库的操作
	数据是：用信息

	1，要连接数据库。 JDBC Hibernate
	2，操作数据库
		c creat r read u update d delete		
	3，关闭数据库连接
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
		1，JDBC连接数据库
		2，使用sql添加语句添加数据
		3，关闭连接
		*/
	}
	public void delete(User user)
	{
		/*
		1,JDBC连接数据库
		2，使用sql添加语句删除数据
		3，关闭数据
		*/
	}
}
class UserInfoByHibernate implements UserInfoDao
{
	public void add(User user)
	{
		/*
		1，Hibernate连接数据库
		2，使用sql添加语句添加数据
		3，关闭连接
		*/
	}
	public void delete(User user)
	{
		/*
		1,Hibernate连接数据库
		2，使用sql添加语句删除数据
		3，关闭数据
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
