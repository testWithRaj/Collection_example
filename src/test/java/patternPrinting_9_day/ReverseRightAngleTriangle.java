package patternPrinting_9_day;

public class ReverseRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for( int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
