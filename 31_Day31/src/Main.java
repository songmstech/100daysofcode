import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� : ");
		String str = sc.nextLine();
		System.out.println("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		
		for(int i=0; i<str.length(); i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
			}
			count++;
		}
		
		System.out.println();
		
		System.out.println(ch + "���� : " + count);
		
		
		
	}

}
