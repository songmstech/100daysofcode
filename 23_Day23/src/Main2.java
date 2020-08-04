import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(arr[i]<a) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
