package programmers;

import java.util.Arrays;

public class Quiz86491 {
	public static void main(String[] args) {
		int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(arr));
		
	}
	
	public static int solution(int[][] sizes) {
        int answer = 0;
        int maxW=0,maxH=0;
        
        for(int i = 0; i < sizes.length; i++) {
        	Arrays.sort(sizes[i]);		// 각 배열마다 정렬 시킨다(가로 세로 돌려도 상관 없기 때문에)
        	// 정렬시키면 다음과 같은 모습이다 -> {{50, 60}, {30, 70}, {30, 60}, {40, 80}};
        	
        	maxW = Math.max(maxW,sizes[i][0]);	// sizes[i]안에 0번째 인덱스 중 제일 큰 수를 maxW에 입력한다 -> 50
        	maxH = Math.max(maxH,sizes[i][1]);	// sizes[i]안에 1번째 인덱스 중 제일 큰 수를 maxH에 입력한다 -> 80
        }
        answer = maxW * maxH;	// 가로 세로 곱해준다 -> 4000
        return answer;
        
    }
}
