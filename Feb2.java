package logicalprogramsjava;

public class Feb2 
{

	public static void main(String[] args) 
	{
		int a=0,b=1,c;
		for(int i=0;i<5;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		//	System.out.println(a);
		}

	}

}
