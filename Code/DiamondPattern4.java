import java.util.Scanner;
class DiamondPattern4
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else if(j==2 || j==2*i-2)
					System.out.print("1");
				else if(j==3 || j==2*i-3)
					System.out.print("2");
				else 
					System.out.print("3");
			}
			System.out.println();

		}

		for(int i=num-1;i>=1;i--)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else if(j==2 || j==2*i-2)
					System.out.print("1");
				else if(j==3 || j==2*i-3)
					System.out.print("2");
				else 
					System.out.print("3");
			}
			System.out.println();
		}
	}
}


/*
E:\javacode\patterns>java DiamondPattern4
5
*
*1*
*121*
*12321*
*1233321*
*12321*
*121*
*1*
*

*/