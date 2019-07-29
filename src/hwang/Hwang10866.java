package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Hwang10866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<String> queue = new LinkedList();
		for(int i = 0; i < N; i ++) {
			String[] input = br.readLine().split(" ");
			
			if(input[0].equals("push_front")) queue.addFirst(input[1]);
			if(input[0].equals("push_back")) queue.addLast(input[1]);
			if(input[0].equals("pop_front")) System.out.println(  queue.isEmpty() ? "-1" : queue.pollFirst());
			if(input[0].equals("pop_back")) System.out.println(  queue.isEmpty() ? "-1" : queue.pollLast());
			if(input[0].equals("empty")) System.out.println( queue.isEmpty() ? "1" : "0");
			if(input[0].equals("front")) System.out.println( queue.isEmpty() ? "-1" : queue.getFirst()); 
			if(input[0].equals("back")) System.out.println( queue.isEmpty() ? "-1" : queue.getLast());
			if(input[0].equals("size")) System.out.println( queue.size());
			
		}
	}
}
