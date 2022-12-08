//Array(1D,2D and sum of matrix).
class array{
	public static void main(String[] args){
		System.out.println("=>\t...One Dymension Array Of Integer Type...");
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("---------------------------------------------");
		System.out.println("=>\t...Two Dymension Array Of Character Type...");
		String b[][] = new String[2][2];
		b[0][0] = "Bhargav"; 
		b[0][1] = "Tejas"; 
		b[1][0] = "Abdeali"; 
		b[1][1] = "Sujal";
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				System.out.println(b[i][j]);
			}
		}	
		System.out.println("---------------------------------------------");
		System.out.println("=>\t...Metrix...");
		System.out.println("col1 : ");
		int arr[][] = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("col2 : ");
		int arr2[][] = new int[2][2];
		arr2[0][0] = 50;
		arr2[0][1] = 60;
		arr2[1][0] = 70;
		arr2[1][1] = 80;
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				System.out.println(arr2[i][j]);
			}
		}
		System.out.println("=>\t...Total...");
		int total[][] = new int[2][2];
	
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				total[i][j] = arr[i][j] + arr2[i][j];
				System.out.println(total[i][j]);
			}
		}
	}
}