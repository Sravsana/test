package javaAssignment;

public class TableOfFive {

	public static void main(String[] args) {
		int n=30;
		int j;
		int even_num=0,odd_num=0;
		for(int i=1;i<=n;i++)
		{
			j=i*5;
			System.out.println("5*"+i+"=" +j);
		
		
			if(j%2==0)
			{
				//int[] a= {j};
				even_num++;
				
			}
			else
			{
				odd_num++;
				
			}
	
		}
		System.out.println("Length of Even Numbers:=" +even_num);
		System.out.println("Length of odd numbers:=" +odd_num);
	}
}
	

