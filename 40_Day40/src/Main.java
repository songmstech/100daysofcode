import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//����ڰ� �Է��� �迭�� ���̸�ŭ ���ڿ� �迭�� ����� �Ҵ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String[] str = new String[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print(i + 1 + "��° ���ڿ� : ");
			str[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int num2 = sc.nextInt();
				
				sc.nextLine();
				
				String[] newStr = new String[num + num2];
				
				for(int i = 0; i<newStr.length; i++) {
					if(i <= str.length - 1) {
						newStr[i] = str[i];
					}else {
						System.out.print(i + 1 + "��° ���ڿ� : ");
						newStr[i] = sc.nextLine();
					}
				}
				
				str = newStr;
				
			}else{
				break;
			}
		}
		
		System.out.println(Arrays.toString(str));
		
	}

}
