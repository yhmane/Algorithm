package submit_check;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SubmitCheck {		
	public static void main(String[] args) throws Exception {	
		List<Integer> questionNo = new ArrayList<Integer>();
						
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
		
		List<Integer> week_06 = Arrays.asList(11656, 1406, 1158, 1168, 10430, 2609, 1934, 1850, 9613, 11005, 2745, 1373, 1212, 2089, 11576, 
								1978, 1929, 6588, 11653, 10872, 1676, 2004);
		questionNo.addAll(week_06);
		
		duplicateCheck(questionNo);
		System.out.println("★ 목표 진행률 : " + checkProgress(questionNo.size()) + ", 남은 문제 수 : " + (InitData.getTotalQuestionCNT() - questionNo.size()));
		System.out.println();
		submitCheck(questionNo, InitData.getParticipantInfo());		
	}
	
	private static void submitCheck(List<Integer> questionNo, Map<String, String> participantInfo) {
		
		String currDir = System.getProperty("user.dir");
		
		participantInfo.keySet().forEach(p -> {				
			String familyNM = participantInfo.get(p);
			File directory = new File(currDir + File.separator + "src" + File.separator + familyNM);
			
			List<String> notSolved = questionNo.stream().map(String::valueOf).collect(Collectors.toList());
			List<String> solved = Arrays.stream(directory.list())
							.map(fileNm -> fileNm.substring(familyNM.length(), fileNm.lastIndexOf('.')))
							.filter(notSolved::contains)
							.collect(Collectors.toList());
			
			notSolved.removeAll(solved);
			
			System.out.println(p + " - 푼 문제  수 : " + solved.size() + ", 풀지 않은 문제 수 : " + notSolved.size() 
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
			Set<Integer> duplicateSet = new HashSet<>();
			questionNo.sort(Comparator.naturalOrder());
			for(int i = 0; i < questionNo.size() - 1; i++) {
				
				if(questionNo.get(i).equals(questionNo.get(i + 1))) {
					duplicateSet.add(questionNo.get(i));
				}
			}
			
			throw new Exception("추가된 문제에서 중복된 항목이 있습니다. --> " + duplicateSet);
		}
	}
	
	private static String checkProgress(int size) {
		double progress = (size * 10000 / InitData.getTotalQuestionCNT()) / 100.0;
		return progress + " %";
	}
}
