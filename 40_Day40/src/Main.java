import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//사용자가 입력한 배열의 길이만큼 문자열 배열을 선언및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		String[] str = new String[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			str[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int num2 = sc.nextInt();
				
				sc.nextLine();
				
				String[] newStr = new String[num + num2];
				
				for(int i = 0; i<newStr.length; i++) {
					if(i <= str.length - 1) {
						newStr[i] = str[i];
					}else {
						System.out.print(i + 1 + "번째 문자열 : ");
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
