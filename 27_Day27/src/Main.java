import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		  sc.nextLine();
		  
		  int count = 0;
		  int a = num;
		  while(true) {
			  num = ((num%10)*10) + (((num/10) + (num%10))%10);
			  count++;
			  if(a == num) {
				  break;
			  }
		  }
		  System.out.print(count);
	}

}
