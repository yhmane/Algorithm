package submit_check;

import java.util.List;
import java.util.stream.Collectors;

// 다음 주에 어떤 문제를 풀지를 참고하는데 사용
public class NextQuestionReference {
	public static void main(String[] args) {
		List<String> questionNo = SubmitCheck.getQuestionNo().stream().map(String::valueOf).collect(Collectors.toList());
		StringBuffer sb = new StringBuffer();
		int solvedCNT = ProgressCheck.getUnsolvedList(sb, questionNo);
		
		System.out.println("★ 푼 문제 수 : " + solvedCNT + ", 풀지 않은 문제 수 : " + (InitData.getTotalQuestionCNT() - solvedCNT)
				  + " (현재 진행률 : "+ ProgressCheck.checkProgress(solvedCNT) + ")");
		System.out.println();
		System.out.println("------ 풀지 않은 문제 목록 ------");
		System.out.println(sb);
	}
}
