import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//			
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		sc.nextLine();
//		
		for(int i=1; i<=10; i++) {
			
			System.out.println("==== " + i + "단 ====");
			
			for(int j=1; j<=10; j++) {
				
				System.out.println(i + "X" + j + "=" + i*j);
				
			}
		}
		
	}

}
