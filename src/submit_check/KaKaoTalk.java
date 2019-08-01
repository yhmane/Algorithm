package submit_check;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class KaKaoTalk {
	
	public static void main(String[] args) throws Exception {
		String filePath = "C:\\bizmekaTalk_Group_2019_08_01_105619.txt";
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		Map<String, Integer> participants = new HashMap<String, Integer>();
//		int totalTalkCNT = 0;
		String talk;
		
		while((talk = br.readLine()) != null) {
			
			if(talk.length() > 0 && talk.charAt(0) == '[') {
//				totalTalkCNT++;
				String name = talk.substring(1, talk.indexOf(']'));
				
				if("".equals(name) || name.matches("^(A|P)M [0-1]?[0-9]:[0-5][0-9]")) {				
					continue;
				}
									
				if(!participants.containsKey(name)) {
					participants.put(name, 1);
				} else {
					participants.put(name, participants.get(name) + 1);
				}
			}
		}
		
		List<Entry<String, Integer>> list = participants.entrySet().stream().sorted(new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}		
		}).collect(Collectors.toList());
		
		System.out.println("== 단톡방 대화 수 순위 ==");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i).getKey() + " : " + list.get(i).getValue() + " 번");
		}
		
		br.close();
	}
}
