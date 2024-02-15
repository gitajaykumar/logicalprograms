package logicalprogramsjava;

public class StringReverse1 {

	public static void main(String[] args) 
	{
		String s1="Rbg techonologies";
		StringBuffer b1=new StringBuffer(s1);
		System.out.println(b1);//Rbg techonologies
		
        //name reverse Rbg techonologies
		StringBuffer reverse=b1.reverse();
		String s2=reverse.toString();
		System.out.println(reverse);//seigolonohcet gbR


	}

}
