package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author hwang-yunho on 2019-07-23
 * @project Algorithm
 */
public class Hwang11004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);

        String[] nums = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        sort(arr,0,arr.length-1);

        System.out.println(arr[Integer.parseInt(input[1]) - 1]);

    }

    public static void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];

        do {

            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;

            if(left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }  while (left <= right);

        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
}
