package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim11053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
//		List<List<Integer>> lists = new ArrayList<List<Integer>>();
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(seq[0]);
		
		List<int[]> tests = new ArrayList<int[]>();
		int[] test = new int[11];
		test[seq[0]] = 1;
		
		for(int i = 0; i < n - 1; i++) {
			
			if(seq[i] < seq[i + 1]) {
//				list.add(seq[i + 1]);
				test[seq[i + 1]] = 1;
			} else {				
//				lists.add(list);
//				list = new ArrayList<Integer>();
//				list.add(seq[i + 1]);
				tests.add(test);
				test = new int[11];
				test[seq[i + 1]] = 1;
			}
		}
		
//		lists.add(list);
//		lists.forEach(System.out::println);
		
		tests.add(test);
		tests.forEach(e -> System.out.println(Arrays.toString(e)));
	}
}
