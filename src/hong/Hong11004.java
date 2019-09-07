package hong;
/*
 * K번째 수
 * 수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다.
 * 둘째에는 A1, A2, ..., AN이 주어진다. (-109 ≤ Ai ≤ 109)
 * A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.
5 2
4 1 2 3 5 => 2

 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		sort(arr, 0, arr.length - 1);
		System.out.println(arr[K - 1]);
		
		br.close();
	}
	
	private static void sort(long[] arr, int low, int high) {
		if(low >= high) return;
		
		int mid = partition(arr, low, high);
		sort(arr, low, mid - 1);
		sort(arr, mid, high);
	}
	
	private static int partition(long[] arr, int low, int high) {
		long pivot = arr[(low + high) / 2];
		while (low <= high) {
			while(arr[low] < pivot) low++;
			while(arr[high] > pivot) high--;
			if (low <= high) {
				swap(arr, low, high);
				low++;
				high--;
			}
		}
		
		return low;
	}
	
	private static void swap(long[] arr, int i, int j) {
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
