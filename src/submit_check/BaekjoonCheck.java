package submit_check;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BaekjoonCheck {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("백준 사이트의 마이페이지에서 푼 문제 리스트를 복사한 후 붙여넣어주세요.");
		System.out.println("예) 1000 1001 1158 1168");
		List<String> solved = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
		StringBuffer sb = new StringBuffer();
		int solvedCNT = ProgressCheck.getUnsolvedList(sb, solved);
		
		System.out.println("★ 푼 문제 수 : " + solvedCNT + ", 풀지 않은 문제 수 : " + (InitData.getTotalQuestionCNT() - solvedCNT)
				  + " (현재 진행률 : "+ ProgressCheck.checkProgress(solvedCNT) + ")");
		System.out.println();
		System.out.println("------ 풀지 않은 문제 목록 ------");
		System.out.println(sb);
	}
}
