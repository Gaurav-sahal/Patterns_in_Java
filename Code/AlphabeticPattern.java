import java.util.Scanner;
public class AlphabeticPattern{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Row count");
		int N = sc.nextInt();
		char ch = 'A';
		for(int i=N; i>=1; i--){
			char ch1 = ch;
			for(int j=i; j>=1; j--){
				System.out.print(ch1);
				ch1++;
			}
			System.out.println();
			ch++;
		}
	}
	
}



		/*----OUTPUT----
		Enter a Row count
		5
		ABCDE
		BCDE
		CDE
		DE
		E 	*/