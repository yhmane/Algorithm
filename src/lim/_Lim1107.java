package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1107 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);
		int brokenCNT = Integer.parseInt(br.readLine());
		int answer;
		int curCH = 100;
		boolean[] broken = new boolean[10];
		
		if(brokenCNT > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < brokenCNT; i++) {
				broken[Integer.parseInt(st.nextToken())] = true;
			}
			
			int initMin = power(10, nStr.length() - 2);
			int initMax = power(10, nStr.length() + 1);
			int answer1 = Integer.MAX_VALUE;
			
			for(int i = initMin; i <= initMax; i++) {
				
				if(checkPossible(broken, i)) {
					int diff = String.valueOf(i).length() + Math.abs(i - n);
					
					if(diff < answer1) {
						answer1 = diff;
					}
				};				
			}
			
			int answer2 = Math.abs(n - curCH);
			
			answer = Math.min(answer1, answer2);			
		} else {
			answer = nStr.length();
		}
		
		System.out.println(answer);
	}
	
	private static boolean checkPossible(boolean[] broken, int channelNo) {
		String chStr = String.valueOf(channelNo);
		boolean ret = true;
		
		for(int i = 0; i < chStr.length(); i++) {
			
			if(broken[chStr.charAt(i) - 48]) {
				ret = false;
				break;
			}
		}
		
		return ret;
	}

	private static int power(int a, int n) {
		int ret = 1;
		
		// 원래 거듭제곱에서는 0이 아니지만 이 문제의 경우 채널이 0번이 있어서 그냥 이렇게 함
		if(n <= 0) {
			ret = 0;
		} else {
			for(int i = 0; i < n; i++) {
				ret *= a;
			}
		}
		
		return ret;
	}
}
