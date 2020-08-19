import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<str.length(); i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
			}
			count++;
		}
		
		System.out.println();
		
		System.out.println(ch + "개수 : " + count);
		
		
		
	}

}
