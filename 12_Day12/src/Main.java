import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 90 && num <= 100) {
			System.out.println("A");
		}else if(num >= 80 && num <= 89) {
			System.out.println("B");
		}else if(num >= 70 && num <= 79) {
			System.out.println("C");
		}else if(num >= 60 && num <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
