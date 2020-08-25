
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] =(int)(Math.random()*10+1);
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
