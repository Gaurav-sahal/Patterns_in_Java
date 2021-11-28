import java.util.Scanner;
public class HollowInvertedFullPyramidPatternUsingNumbers{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Row Limit");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			int k=1;
			for(int j=N-1; j>=i; j--){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				// if(j==1 || j==2*i-1 || i==N){
				// 	System.out.print(k);
				// 	k++;
				// }
				
				if(j==1){
					System.out.print("1");
					k++;
				}

				else if(j != 1 && j==2*i-1 && i!=N){
					System.out.print(i);
				}

				else if(j!=1 && i==N){
					if(j%2==0){
						System.out.print(" ");
					}else{
						System.out.print(k);
						k++;
					}
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
		Enter a Row Limit
		5
		    1
		   1 2
		  1   3
		 1     4
		1 2 3 4 5	*/