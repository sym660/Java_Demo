/*
需求：
	电脑的运行实例
	电脑运行基于主板
*/
interface PCI
{
	public void open();
	public void close();
}
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");	
	}
		public void usePCI(PCI p)
	{
		if(p!=null)
		{
			p.open();
			p.close();
		}
	}
}
class NetCard implements PCI
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}
class SoundCard implements PCI
{
	public void open()
	{
		System.out.println("soundtcard open");
	}
	public void close()
	{
		System.out.println("soundcard close");
	}
}
/*
class MainBoard
{
	public void run()
	{
		System.out.println("mainBoard run");
	}
	public void useNetCard(NetCard nc)
	{
		nc.open();
		nc.close();
	}
}
class NetCard
{
	public void open()
	{
		System.out.println("netcard open");
	}
	public void close()
	{
		System.out.println("netcard close");
	}
}
class DuoTaiDemo3 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		MainBoard mb=new MainBoard();
		mb.run();
		mb.useNetCard(new NetCard());

	}
}
*/
class DuoTaiDemo3 
{
	public static void main(String[] args) 
	{
		MainBoard mb=new MainBoard();
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new NetCard());
		mb.usePCI(new SoundCard());

	}
}