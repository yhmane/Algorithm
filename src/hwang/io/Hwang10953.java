package hwang.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while(num-- > 0) {
            String[] nums = br.readLine().split(",");
            System.out.println(Integer.parseInt(nums[0]) +  Integer.parseInt(nums[1]));
        }
    }
}
