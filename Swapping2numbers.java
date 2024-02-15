package logicalprogramsjava;

public class Swapping2numbers 
{
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		//logic -third variable
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println(a);
//		System.out.println(b);
		
		//logic-2 use +&- without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
