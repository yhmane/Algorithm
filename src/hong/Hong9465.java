package hong;
/*
스티커
상근이의 여동생 상냥이는 문방구에서 스티커 2n개를 구매했다. 스티커는 그림 (a)와 같이 2행 n열로 배치되어 있다. 상냥이는 스티커를 이용해 책상을 꾸미려고 한다.
상냥이가 구매한 스티커의 품질은 매우 좋지 않다. 스티커 한 장을 떼면, 그 스티커와 변을 공유하는 스티커는 모두 찢어져서 사용할 수 없게 된다. 즉, 뗀 스티커의 왼쪽, 오른쪽, 위, 아래에 있는 스티커는 사용할 수 없게 된다.
50 10 100 20 40
30 50 70  10 60
모든 스티커를 붙일 수 없게된 상냥이는 각 스티커에 점수를 매기고, 점수의 합이 최대가 되게 스티커를 떼어내려고 한다. 먼저, 그림 (b)와 같이 각 스티커에 점수를 매겼다. 상냥이가 뗄 수 있는 스티커의 점수의 최댓값을 구하는 프로그램을 작성하시오. 즉, 2n개의 스티커 중에서 점수의 합이 최대가 되면서 서로 변을 공유 하지 않는 스티커 집합을 구해야 한다.
위의 그림의 경우에 점수가 50, 50, 100, 60인 스티커를 고르면, 점수는 260이 되고 이 것이 최대 점수이다. 가장 높은 점수를 가지는 두 스티커 (100과 70)은 변을 공유하기 때문에, 동시에 뗄 수 없다.
        // 스티커의 위치상태를 저장하는 배열
        //  50 10 100 20 40
        //  30 50 70  10 60 
        // d[n][0] n번째 스티커를 둘다 안뜯을때
        // d[n][1] n번째 스티커 첫번째 스티커 뜯을때
        // d[n][2] n번째 스티커 두번째 스티커 뜯을때
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong9465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] d = new int[n + 1][3];
			int[][] a = new int[n + 1][3];
			
			
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= n; i++) {
				a[i][1] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= n; i++) {
				a[i][2] = Integer.parseInt(st.nextToken());
			}
			
			d[1][0] = 0;
			d[1][1] = a[1][1];
			d[1][2] = a[1][2];
			
			for (int i = 2; i <= n; i++) {
				d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
				d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + a[i][1];
				d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + a[i][2];
			}
			
			System.out.println(Math.max(d[n][0], Math.max(d[n][1], d[n][2])));
		}
		br.close();
	}
	
}
