import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int aNum = sc.nextInt();
			int bNum = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (aNum + bNum));
		}
	}

}
