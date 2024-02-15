package logicalprogramsjava;

public class Stringreverse2 
{

	public static void main(String[] args) 
	{
		String s1="rbg techonologies";
		
		System.out.println(s1);
		
		StringBuffer b1= new StringBuffer(s1);
		System.out.println(b1);
		
		StringBuffer reverse=b1.reverse();
		System.out.println(reverse);


	}

}
