package submit_check;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubmitCheck {
	
	static int totalQuestionCNT = 146;
	
	public static void main(String[] args) throws Exception {
		
		List<Integer> questionNo = new ArrayList<Integer>();
		List<String> participants = Arrays.asList("hong|홍대표", "hwang|황윤호", "ju|주홍선", "koo|구해안", "lee|이석화", "lim|임민석");
						
		List<Integer> week_01 = Arrays.asList(2557, 1000, 2558, 10950, 10951, 10952, 1463, 2751, 1260);
		questionNo.addAll(week_01);
		
		List<Integer> week_02 = Arrays.asList(11021, 11022, 11718, 11719, 11720, 11721, 2741, 2742, 2739, 1924, 8393, 10818, 2438, 2439);
		questionNo.addAll(week_02);
		
		List<Integer> week_03 = Arrays.asList(2440, 2441, 2442, 2445, 2522, 2446, 10991, 10992, 11726, 11727, 9095, 10844, 11057);
		questionNo.addAll(week_03);
		
		List<Integer> week_04 = Arrays.asList(2193, 9465, 2156, 11053, 11055, 11722, 11054, 1912, 2579, 1699, 2133, 9461, 2225, 2011, 11052);
		questionNo.addAll(week_04);

		List<Integer> week_05 = Arrays.asList(11650, 11651, 10814, 10825, 10989, 11652, 11004, 10828, 9012, 10799, 10845, 10866, 10808,
								10809, 10820, 2743, 11655, 10824);
		questionNo.addAll(week_05);

		duplicateCheck(questionNo);
		System.out.println("★ 목표 진행률 : " + checkProgress(questionNo.size()) + ", 남은 문제 수 : " + (totalQuestionCNT - questionNo.size()));
		System.out.println();
		submitCheck(questionNo, participants);		
	}
	private static void submitCheck(List<Integer> questionNo, List<String> participants) {
		
		String currDir = System.getProperty("user.dir");
		
		participants.forEach(p -> {			
			String[] pInfo = p.split("\\|");
			
			File directory = new File(currDir + File.separator + "src" + File.separator + pInfo[0]);
			
			List<String> notSolved = questionNo.stream().map(String::valueOf).collect(Collectors.toList());
			List<String> solved = Arrays.stream(directory.list())
							.map(fileNm -> fileNm.substring(pInfo[0].length(), fileNm.lastIndexOf('.')))
							.filter(notSolved::contains)
							.collect(Collectors.toList());
			
			notSolved.removeAll(solved);
			
			System.out.println(pInfo[1] + " - 푼 문제  수: " + solved.size() + ", 풀지 않은 문제 수 : " + notSolved.size() 
					+ " (현재 진행률 : "+ checkProgress(solved.size()) + ")");
//			System.out.println("푼 문제 목록 : " + solved);
			System.out.println("풀지 않은 문제 목록 : " + notSolved);
			System.out.println();
		});
	}
	
	private static void duplicateCheck(List<Integer> questionNo) throws Exception {
		int listSize = questionNo.size();
		long filteredSize = questionNo.stream().distinct().count();
		
		if(listSize != filteredSize) {			
			throw new Exception("추가된 문제에서 중복된 항목이 있습니다.");
		}
	}
	
	private static String checkProgress(int size) {
		double progress = (size * 10000 / totalQuestionCNT) / 100.0;
		return progress + " %";
	}
}
