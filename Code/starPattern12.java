import java.util.Scanner;
public class starPattern12{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();

		for(int i=N; i>=1; i--){
			for(int j=N; j>i; j--){
				System.out.print(" ");
			}
			for(int j=2*i-1; j>=1; j--){
				if(j==1 || j==2*i-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i=1; i<=N; i++){
			for(int j=N; j>i; j--){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				if(j==1 || j==2*i-1){
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