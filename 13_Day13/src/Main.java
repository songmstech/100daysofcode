import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		/*
		 * "45�� ���� �˶� �����ϱ�"�̴�.�� ����� �ܼ��ϴ�. 
		 * ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. 
		 * ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. 
		 * �� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
		 * ���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); 
		int m = sc.nextInt();
		
		if(m >= 45) {
			
			m = m - 45;
			System.out.println(h + " " + m);
			
		}else {
			
			if(h > 0) {
				h--;
				m = 60 - Math.abs(m-45);
				System.out.println(h + " " + m);
			} else {
				h = 24;
				h--;
				m = 60 - Math.abs(m-45);
				System.out.println(h + " " + m);
			}
		}
		
	}

}
