import java.util.Scanner;
public class starPattern9{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();
		/*--------Method 1 --------*/
		for(int i=1; i<=N; i++){
			for(int j=1; j<i; j++){
				System.out.print(" ");
			}
			for(int j=N; j>=i; j--){
				System.out.print("*");
			}
			for(int j=N-1; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		/*--------Method 2 --------*/
		for(int i=N; i>=1; i--){
			for(int j=i; j<N; j++){
				System.out.print(" ");
			}
			for(int j=2*i-1; j>=1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a limit value
		5
		*********
		 *******
		  *****
		   ***
		    *
		*********
		 *******
		  *****
		   ***
		    *	*/