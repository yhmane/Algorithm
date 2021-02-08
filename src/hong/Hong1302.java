package hong;
/*
https://www.acmicpc.net/problem/1302
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hong1302 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			String title = br.readLine();
			
			if (map.containsKey(title)) {
				map.put(title, map.get(title) + 1);
			} else {
				map.put(title, 0);
			}
		}
		
		List<Map.Entry<String, Integer>> entries = new LinkedList(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (o2.getValue() == o1.getValue()) {
					return o1.getKey().compareTo(o2.getKey());
				} else {
					return o2.getValue() - o1.getValue();
				}
			}
		});

		System.out.println(entries.get(0).getKey());
		
	}
}
