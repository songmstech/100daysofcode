import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0~6 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(num == i) {
				System.out.println(arr[i] + "����");
			}
		}
		
		
		
	}

}
