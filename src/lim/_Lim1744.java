package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _Lim1744 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> positives = new ArrayList<Integer>();
		List<Integer> nonPositives = new ArrayList<Integer>();
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			int elem = Integer.parseInt(br.readLine());
			
			if(elem > 0) {
				positives.add(elem);
			} else {
				nonPositives.add(elem);
			}
		}
		
		positives.sort(Comparator.reverseOrder());
		nonPositives.sort(Comparator.naturalOrder());
		
	}
}
