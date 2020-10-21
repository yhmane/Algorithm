package hong;
/*
18
1
-1
0
0
0
1
1
-1
-1
2
-2
0
0
0
0
0
0
0
=====================
-1
1
0
-1
-1
1
1
-2
2
0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Hong11286 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
			new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					if (o1 + o2 == 0) {
						if (o2 < o1) {
							return 1;
						} else {
							return -1;
						}
					}
					o1 = o1 < 0 ? -1 * o1 : o1;
					o2 = o2 < 0 ? -1 * o2 : o2;
					return o1 - o2;
				};
			}
		);
		
		StringBuilder sb = new StringBuilder();
		while (N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				if (pq.isEmpty()) {
					sb.append(0);
				} else {
					sb.append(pq.poll());
				}
				sb.append("\n");
			} else {
				pq.add(num);
			}
		}
		
		System.out.println(sb);
	}
}
