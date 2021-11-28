import java.util.Scanner;
class SquareStarPattern
{
	public static void main(String []args)
	{
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
}

/*E:\javacode\patterns>java SquareStarPattern
Enter a Number
5
*****
*****
*****
*****
*****

*/