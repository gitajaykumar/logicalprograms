package logicalprogramsjava;

public class CharArray 
{

	public static void main(String[] args) 
	{
		String str="ABCD";
		String rev="decg";
		
		char a[]=str.toCharArray();
		int len=a.length;
		System.out.println(len);
		
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);

	}

}
