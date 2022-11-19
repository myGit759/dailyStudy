package programmers;

import java.util.*;

public class Pccp모의고사1_1 {
	public static void main(String[] args) {
		System.out.println(solution("edeaaabbccd"));	// == edeabcd와 똑같은 구조
	}
	
	public static String solution(String input_string) {

		String answer = "";
		String filter = "";
		
		// 중복 판별
		Set<Character> set = new TreeSet<>();
//		Map<Character, Boolean> map = new HashMap<>();

		char[] carr = input_string.toCharArray();

		char current = ' ';	// 중복을 없애기 위한 빈칸

		for (char temp : carr) {
			if (current != temp) {	// temp가 전과 중복되지 않다면(중복되면 그냥 지나가기)
				if (filter.contains(temp+"")) {	// filter에 저장되었던 철자라면 (한번 나왔던 철자라면)
					set.add(temp);	// set에 add
				}
				filter+=temp;	// 필터에 temp저장
				current = temp;	// 중복 방지를 위한 temp값 주기
			}
		}

		for (char temp : set) {
			answer += temp;
		}

		if (answer == "") {
			return "N";
		}

		return answer;

	}
}
