public class piramid
{
	public static void main(String[] args)
	{
		int n=4,i,j,a=1;
		for(i=0;i<n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a*2;
			}
			System.out.println();
		}		
	}
}