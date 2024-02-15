package logicalprogramsjava;

public class BubbleShort //shorting array
{

	public static void main(String[] args) 
	{
		int a[]= {5,4,3,2,1,8};
		int b;
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)	
			{
			if(a[i]>a[j])
			{
				b=a[i];
			    a[i]=a[j];
			    a[i]=b;
			}
				
		}

	}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
				//System.out.println(b);
			}
				
			}

}
