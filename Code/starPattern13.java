import java.util.Scanner;
public class starPattern13{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			for(int j=1; j<=N; j++){
				if(i==1 || i==N){
					System.out.print("* ");
				}
				else if(j==1 || j==N){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a limit value
		5
		* * * * *
		*       *
		*       *
		*       *
		* * * * *	*/