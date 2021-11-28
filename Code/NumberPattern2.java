import java.util.Scanner;
public class NumberPattern2{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Row limit");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			for(int j=N-1; j>=i; j--){
				System.out.print(" ");
			}

			for(int j=1; j<=2*i-1; j++){
				if(j%2==0){
					System.out.print(" ");
				}
				else{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a Row limit
		5
		    1
		   2 2
		  3 3 3
		 4 4 4 4
		5 5 5 5 5	*/