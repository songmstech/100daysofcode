import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록 번호 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		char[] copy = new char[arr.length];
		
		for(int i = 0; i<copy.length; i++) {
			if(i <= 7) {
				copy[i] = arr[i];
			}else {
				copy[i] = '*';
			}
			
		}
		
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
	}

}
