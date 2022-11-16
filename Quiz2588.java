package baekjoon;

public class Quiz2588 {
	public static void main(String[] args) {
	
		int n1 = 472;
		String n2 = "385";
		int[] arr = new int[n2.length()];
		int idx = n2.length(), total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n1 * Integer.parseInt(n2.charAt(--idx)+"");
			System.out.println(arr[i]);
			total += arr[i] *Math.pow(10, i);
		}
		System.out.println(total);
	}
}
