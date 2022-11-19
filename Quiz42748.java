package programmers;

import java.util.Arrays;

public class Quiz42748 {
	public static void main(String[] args) {
		int[] arr = { 1,5,2,6,3,7,4 };
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		for(int i : solution(arr,commands)) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] ia = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(ia);
            answer[i] = ia[commands[i][2]-1];
        }
        return answer;
    }
}
