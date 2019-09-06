package hong;
/*
 * 카드
 * 준규는 숫자 카드 N장을 가지고 있다. 숫자 카드에는 정수가 하나 적혀있는데, 적혀있는 수는 -2^62보다 크거나 같고, 2^62보다 작거나 같다.
 * 준규가 가지고 있는 카드가 주어졌을 때, 가장 많이 가지고 있는 정수를 구하는 프로그램을 작성하시오. 만약, 가장 많이 가지고 있는 정수가 여러 가지라면, 작은 것을 출력한다.
 * 첫째 줄에 준규가 가지고 있는 숫자 카드의 개수 N (1 <= N <= 1000000)이 주어진다. 둘째 줄부터 N개 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
 * 첫째 줄에 준규가 가장 많이 가지고 있는 정수를 출력한다.
 * 
5
1
2
1
2
1 => 1
 * */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hong11652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Set<BigInteger> keySet = new HashSet<>();
		Map<BigInteger, Integer> card = new HashMap<BigInteger, Integer>();
		BigInteger minN = BigInteger.ZERO;
		int maxCnt = 0;
		
		
		for (int i = 0; i < N; i++) {
			BigInteger key = new BigInteger(br.readLine());
			if(card.containsKey(key)) {
				card.put(key, card.get(key) + 1);
			} else {
				card.put(key, 1);
			}
		}
		
		keySet = card.keySet();
		
		for(BigInteger key : keySet) {
			if(card.get(key) > maxCnt) {
				maxCnt = card.get(key);
				minN = key;
			} else if(card.get(key) == maxCnt) {
				if(key.compareTo(minN) == -1) {
					minN = key;
				}
			}
		}
		
		bw.append(String.valueOf(minN));
		
		bw.flush();
		br.close();
	}

}
