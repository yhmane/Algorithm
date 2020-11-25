package hong;
/*
https://www.acmicpc.net/problem/1655
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Hong1655 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		int mid = Integer.parseInt(br.readLine());
		sb.append(mid).append(System.lineSeparator());
		
		for (int i = 1; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num >= mid) {
				minQ.add(num);
				if (minQ.size() > maxQ.size() + 1) {
					maxQ.add(mid);
					mid = minQ.poll();
				}
			} else {
				maxQ.add(num);
				if (maxQ.size() > minQ.size()) {
					minQ.add(mid);
					mid = maxQ.poll();
				}
			}
			sb.append(mid).append(System.lineSeparator());
		}
		
		System.out.println(sb);
	}
}
