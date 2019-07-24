package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author hwang-yunho on 2019-07-24
 * @project Algorithm
 */
public class Hwang9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();

            int len = input.length();
            for(int j = 0; j < len; j++) {
                char c = input.charAt(j);
                if(c == '(') stack.push(c);
                else {
                    if(!stack.empty() && stack.peek() == '(') stack.pop();
                    else stack.push(stack.push(c));
                }
            }
            System.out.println(stack.empty() == true ? "TRUE" : "FALSE");
        }
    }
}