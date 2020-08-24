import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		
		System.out.println(" ");
		
		System.out.println("Max: " + arr[9]);
		System.out.println("Min: " + arr[0]);
		
	}

}
