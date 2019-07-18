package submit_check;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ProgressCheck {
	
	private static String defaultUser = "임민석";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> participantInfo = InitData.getParticipantInfo();
		System.out.println("진행상황을 체크할 사람의 이름을 입력해주세요. 그냥 엔터 키를 누르면 디폴트 유저의 값이 표시됩니다.");
		System.out.println("명단 : " + participantInfo.keySet());	
		String user = br.readLine().trim();
		
		if("".equals(user)) {
			user = defaultUser;
		}
		
		while(!participantInfo.containsKey(user)) {
			System.out.println("명단을 확인 후 정확히 입력해주세요. 그냥 엔터 키를 누르면 디폴트 유저의 값이 표시됩니다.");
			System.out.println("명단 : " + participantInfo.keySet());			
			user = br.readLine().trim();
			
			if("".equals(user)) {
				user = defaultUser;
			}
		}
		
		progressCheck(user, participantInfo);
	}
	
	private static void progressCheck(String user, Map<String, String> participantInfo) {
		String currDir = System.getProperty("user.dir");
		StringBuffer sb = new StringBuffer();
		String familyNM = participantInfo.get(user);
		File directory = new File(currDir + File.separator + "src" + File.separator + familyNM);
		List<String> solved = Arrays.stream(directory.list()).map(fileNm -> fileNm.substring(familyNM.length(), fileNm.lastIndexOf('.'))).collect(Collectors.toList());
		int questionCNT = InitData.getTotalQuestionCNT();
		
		for(Entry<String, List<Integer>> e : InitData.getTotalQuestions().entrySet()) {
			List<String> notSolved = e.getValue().stream().map(String::valueOf).filter(x -> !solved.contains(x)).collect(Collectors.toList());
			questionCNT -= notSolved.size();
			sb.append(e.getKey() + " : " + notSolved + "\n");
		}
		
		System.out.println("★ " + user + " - 푼 문제 수 : " + questionCNT + ", 풀지 않은 문제 수 : " + (InitData.getTotalQuestionCNT() - questionCNT)
					  + " (현재 진행률 : "+ checkProgress(questionCNT) + ")");
		System.out.println();
		System.out.println("------ 풀지 않은 문제 목록 ------");
		System.out.println(sb);
	}
	
	private static String checkProgress(int size) {
		double progress = (size * 10000 / InitData.getTotalQuestionCNT()) / 100.0;
		return progress + " %";
	}
}
