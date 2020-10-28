package hwang.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            String[] nums = br.readLine().split(" ");
            System.out.println("Case #" + i + ": " + nums[0] + " + " + nums[1] + " = " + (Integer.parseInt(nums[0]) +  Integer.parseInt(nums[1])));
        }
    }
}
