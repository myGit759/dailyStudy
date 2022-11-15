package programmers;

import java.util.Arrays;
public class Quiz12982 {
	public static void main(String[] args) {
		Solution s= new Solution();
		int[] d = { 1, 3, 2, 5, 4 };
		System.out.println(s.solution(d, 10)); // 4 출력돼야 함
	}
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 배열 정렬(최대한 많은 부서에 지급하기 위해)
        Arrays.sort(d);
        
        // 인덱스 만큼 예산 차감, answer에 완료된 부서 개수 1씩 추가
        for(int i = 0; i < d.length; i++){
            budget -= d[i];
            answer++;
            if(budget < 0){	// 만약 예산이 -가 된다면, 금방 지급 했던 부서 다시 빼고 break 
                answer--;
                break;
            }
        }
        // 완료된 부서개수 반환
        return answer;
    }
}
