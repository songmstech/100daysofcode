import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		/*
		���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. 
		�� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
		���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
		��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if(x < 0 && y >0) {
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}

	
	
	
	
	
	
	
	
}
