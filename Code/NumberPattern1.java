import java.util.Scanner;
public class NumberPattern1{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Row limit");
		int N = sc.nextInt();

		for(int i=1; i<=N+1; i++){
			int k=i-1;
			for(int j=N; j>=i; j--){
				System.out.print("  ");
			}
			int range = 2*i-1;
			for(int j=1; j<=range; j++){
				if(j<=range/2){
					System.out.print(k+" ");
					k--;
				}
				else{
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a Row limit
		5
		          0
		        1 0 1
		      2 1 0 1 2
		    3 2 1 0 1 2 3
		  4 3 2 1 0 1 2 3 4
		5 4 3 2 1 0 1 2 3 4 5	*/