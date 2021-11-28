import java.util.Scanner;
public class starPattern3{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=N-1; i++){
			for(int j=N-1; j>=i; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a limit value
		5
		*
		* *
		* * *
		* * * *
		* * * * *
		* * * *
		* * *
		* *
		*	*/