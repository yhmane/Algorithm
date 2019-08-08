package submit_check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InitData {
	
	private static List<String> participants = Arrays.asList("hong|홍대표", "hwang|황윤호", /*"ju|주홍선", "koo|구해안", "lee|이석화",*/ "lim|임민석");
	
	// 입출력
	private static List<Integer> ioList = Arrays.asList(2557, 1000, 2558, 10950, 10951, 10952, 11021, 11022, 11718, 11719, 11720, 11721, 2741, 2742, 
														2739, 1924, 8393, 10818, 2438, 2439, 2440, 2441, 2442, 2445, 2522, 2446, 10991, 10992);
	// DP
	private static List<Integer> dpList = Arrays.asList(1463, 11726, 11727, 9095, 10844, 11057, 2193, 9465, 2156, 11053, 11055, 11722, 11054, 1912, 2579, 
														1699, 2133, 9461, 2225, 2011, 11052);
	// 수리
	private static List<Integer> mathList = Arrays.asList(2751, 11650, 11651, 10814, 10825, 10989, 11652, 11004, 10828, 9012, 10799, 10845, 10866, 10808, 
														  10809, 10820, 2743, 11655, 10824, 11656, 1406, 1158, 1168, 10430, 2609, 1934, 1850, 9613, 11005, 
														  2745, 1373, 1212, 2089, 11576, 1978, 1929, 6588, 11653, 10872, 1676, 2004);
	// 그래프
	private static List<Integer> graphList = Arrays.asList(1260, 11724, 1707, 10451, 2331, 9466, 2667, 4963, 7576, 2178, 2146, 1991, 11725, 1167, 1967);
	// 이분탐색, 삼분탐색
	private static List<Integer> pSearchList = Arrays.asList(1654, 2805, 2110, 10815, 10816, 11662);
	// 그리디
	private static List<Integer> greedyList = Arrays.asList(11047, 2875, 10610, 1783, 1931, 11399, 2873, 1744);
	// 완전탐색
	static List<Integer> fSearchList = Arrays.asList(1476, 1107, 1451, 10819, 10971, 1697, 1963, 9019, 1525, 2251, 2186, 3108, 5014, 1759, 2580, 1987, 
													 6603, 1182, 2003, 1806, 1644, 1261, 1208, 7453, 2632, 2143);
	
	private static Map<String, String> participantInfo = new HashMap<String, String>();
	private static Map<String, List<Integer>> totalQuestions = new HashMap<String, List<Integer>>();
	private static int totalQuestionCNT = 0;
	
	static {
		participants.stream().forEach(str -> participantInfo.put(str.substring(str.indexOf('|') + 1), str.substring(0, str.indexOf('|'))));

		totalQuestions.put("입출력", ioList);
		totalQuestions.put("DP", dpList);
		totalQuestions.put("수리", mathList);
		totalQuestions.put("그래프", graphList);
		totalQuestions.put("이분탐색, 삼분탐색", pSearchList);
		totalQuestions.put("그리디", greedyList);
		totalQuestions.put("완전탐색", fSearchList);
			
		totalQuestions.values().forEach(e -> totalQuestionCNT += e.size());
		
		duplicateCheck();
	}
	public static Map<String, String> getParticipantInfo() {	
		return participantInfo;
	}

	public static Map<String, List<Integer>> getTotalQuestions() {	
		return totalQuestions;
	}

	public static int getTotalQuestionCNT() {
		return totalQuestionCNT;
	}
	
	private static void duplicateCheck() {
		List<Integer> tmp = new ArrayList<Integer>();
		totalQuestions.values().forEach(tmp::addAll);

		if(tmp.size() != tmp.stream().distinct().count()) {
			Set<Integer> duplicateSet = new HashSet<>();
			tmp.sort(Comparator.naturalOrder());
			for(int i = 0; i < tmp.size() - 1; i++) {
				
				if(tmp.get(i).equals(tmp.get(i + 1))) {
					duplicateSet.add(tmp.get(i));
				}
			}
			
			try {
				throw new Exception("추가된 문제에서 중복된 항목이 있습니다. --> " + duplicateSet);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
