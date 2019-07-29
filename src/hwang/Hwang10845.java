package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Hwang10845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<String> queue = new LinkedList();
		for(int i = 0; i < N; i ++) {
			String[] input = br.readLine().split(" ");
			
			if(input[0].equals("push")) queue.add(input[1]);
			if(input[0].equals("pop")) System.out.println(  queue.isEmpty() ? "-1" : queue.pop());
			if(input[0].equals("empty")) System.out.println( queue.isEmpty() ? "1" : "0");
			if(input[0].equals("front")) System.out.println( queue.isEmpty() ? "-1" : queue.getFirst()); 
			if(input[0].equals("back")) System.out.println( queue.isEmpty() ? "-1" : queue.getLast());
			if(input[0].equals("size")) System.out.println( queue.size());
			
		}
	}
}
