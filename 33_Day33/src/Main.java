import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>=3 && num%2 == 1) {
				int[] arr = new int[num];
				
				int value = 1;
				
				for(int i = 0; i < num; i++) {
					arr[i] = value;
					
					if(i < num/2) {
						value++;
					}else {
						value--;
					}
				}
				
				for(int i =0; i<num; i++) {
					System.out.print(arr[i] + " ");
				}
				
				break;
				
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}

}
