import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int aNum = sc.nextInt();
			int bNum = sc.nextInt();
			
			if(aNum == 0 && bNum == 0) {
				
				break;
				
			}
			System.out.println(aNum + bNum);
		}
	}

}
