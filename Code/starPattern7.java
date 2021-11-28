import java.util.Scanner;
public class starPattern7{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter the limit value");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			for(int j=N-1; j>=i; j--){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter the limit value
		5
		    *
		   * *
		  * * *
		 * * * *
		* * * * *	*/