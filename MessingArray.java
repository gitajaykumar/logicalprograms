package logicalprogramsjava;

public class MessingArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		int b[]= {1,2,3,4,5};
		int sum2=0;
		for(int i=0;i<b.length;i++)
		{
			sum2=sum2+b[i];
		}
		System.out.println(sum2);
		System.out.println("messing Array"+(sum1-sum2));
		

	}

}
