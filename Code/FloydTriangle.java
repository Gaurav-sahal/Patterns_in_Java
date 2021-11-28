import java.util.Scanner;
public class FloydTriangle{
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();
		int k=1;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a limit value
		7
		1
		2 3
		4 5 6
		7 8 9 10
		11 12 13 14 15
		16 17 18 19 20 21
		22 23 24 25 26 27 28	*/