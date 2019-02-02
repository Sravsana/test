package javaAssignment;

public class SumOfOddNum {

	public static void main(String[] args) {
		int n=15;
		int i;
		int odd_sum=0;
		for(i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				odd_sum=odd_sum+i;
				//System.out.println("After Adding=" +odd_sum);
			}
			
		}
		System.out.println(odd_sum);
	}

}
