import java.util.Scanner;
public class PascalsTriangle{
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
					if(j==1 || j==2*i-1){
						System.out.print("1");
					}
					else{
						System.out.print(i-1);
					}
				}
			}
			System.out.println();
		}
	}
}

/*E:\javacode\patterns>java PascalsTriangle
Enter a Row limit
5
    1
   1 1
  1 2 1
 1 3 3 1
1 4 4 4 1

*/