package logicalprogramsjava;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		String str="ABCD";
		String rev=null;
		int len=str.length();//4
		//System.out.println(len);
		
		for(int i=str.length();i>-1;i--)
		{
			rev=rev+str.charAt(1);
		}
		System.out.println(rev);
		

	}

	}

