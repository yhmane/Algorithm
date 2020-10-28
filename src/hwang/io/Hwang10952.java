package hwang.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while((input =br.readLine()) != null) {
            String[] nums = input.split(" ");
            System.out.println(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
        }
    }
}