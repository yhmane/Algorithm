package hong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		int[] intArr = new int[caseNum];
		
		for (int i = 0; i < caseNum; i++) {
			intArr[i] = Integer.parseInt(br.readLine());
		}
		
		qsort(intArr, 0, intArr.length - 1);
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static void qsort(int[] arr, int l, int r) {
		int left = l;
		int right = r;
		int pivot = arr[(l + r) / 2];
		
		do {
			while(arr[left] < pivot) left++;
			while(arr[right] > pivot) right--;
			if(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
		
		if(l < right) qsort(arr, l, right);
		if(r > left) qsort(arr, left, r);
	}
}
