package hong;

/*
골드바흐의 추측
1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.
4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.
이 추측은 아직도 해결되지 않은 문제이다.
백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.
입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.
각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000)
입력의 마지막 줄에는 0이 하나 주어진다.
각 테스트 케이스에 대해서, n = a + b 형태로 출력한다. 이때, a와 b는 홀수 소수이다. 숫자와 연산자는 공백 하나로 구분되어져 있다. 만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다. 또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.
8
20
42
0
=======================
8 = 3 + 5
20 = 3 + 17
42 = 5 + 37
나중에 에라스토스테ㅔ스의 체로 풀어볼 것.
*
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong6588 {
	static int[] prime = new int[1000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] Tarr = new int[100000];
		int Tcnt = 0;
		int Nmax = 0;
		
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) {
				break;
			}
			Tarr[Tcnt] = N;
			if(N > Nmax) {
				Nmax = N;
			}
			Tcnt++;
		}
		
		
		prime[2] = 1;
		for (int i = 3; i < Nmax; i+=2) {
			if(isPrime(i) == 1) {
				prime[i] = 1;
			}
		}
		
		for (int i = 0; i < Tcnt; i++) {
			sb.append(solve(Tarr[i]));
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	public static int isPrime(int n) {
		if(n == 1) {
			return 0;
		}
		
		int end = (int)Math.sqrt(n);
		for (int i = 3; i <= end; i+=2) {
			if(n % i == 0) {
				return 0;
			}
		}
		
		return 1;
	}
	
	public static String solve(int n) {
		int[] res = new int[2];
		for (int i = 3; i <= n; i+=2) {
			if(prime[i] == 1 && prime[n - i] == 1) {
				res[0] = i;
				res[1] = n - i;
				break;
			}
		}
		
		if(res[0] > 0) {
			return n + " = " + res[0] + " + " + res[1] + "\n";
		} else {
			return "Goldbach's conjecture is wrong.\n";
		}
		
	}
}
