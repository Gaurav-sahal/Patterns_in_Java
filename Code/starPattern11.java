import java.util.Scanner;
public class starPattern11{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();
		/*--------Pattern 1 --------*/
		for(int i=1; i<=N; i++){

			for(int j=N-1; j>=i; j--){
				System.out.print(" ");
			}
			
			for(int j=1; j<=(2*i-1); j++){
				if(j==1 || j==(2*i-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		/*--------Pattern 2 --------*/
		for(int i=N; i>=1; i--){

			for(int j=N; j>i; j--){
				System.out.print(" ");
			}
			for(int j=2*i-1; j>=1; j--){
				if(j==1 || j==(2*i-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
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
		  *   *
		 *     *
		*       *

		*       *
		 *     *
		  *   *
		   * *
		    *	*/