package multithread;
class hi{
	public void show()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
		}
	}
}
class hello
{
	public void show()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("hello");
		}
	}
}
public class multh {
public static void main(String args[]) {
     hi o1=new hi();
     hello o2=new hello();
     
     o1.show();
     o2.show();
}
}