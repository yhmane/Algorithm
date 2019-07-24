package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author hwang-yunho on 2019-07-24
 * @project Algorithm
 */
public class Hwang10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br    = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();


        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            String[] input = br.readLine().split(" ");

            if(input[0].equals("push")) stack.push(Integer.parseInt(input[1]));
            else if(input[0].equals("pop")) System.out.println(stack.empty() == true ? -1 : stack.pop());
            else if(input[0].equals("size")) System.out.println(stack.size());
            else if(input[0].equals("empty")) System.out.println(stack.empty() == true ? 1 : 0);
            else if(input[0].equals("top")) System.out.println(stack.empty() == true ? -1 : stack.peek());
        }
    }
}