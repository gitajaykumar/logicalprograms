package logicalprogramsjava;

//0 1  1 2 3 5 8 13

public class Febanocciseries 
{

	public static void main(String[] args) 
	{
	 int n1=0;
	 int n2=1;
	 int sum=0;
	 System.out.println(n1+" "+n2);
	 for(int i=0;i<10;i++)
	 {
		 System.out.println(i);
		 sum=n1+n2;
		 System.out.println(sum);
		 n1=n2;//1
		 n2=sum;//1
	 }
			
		}

	}


