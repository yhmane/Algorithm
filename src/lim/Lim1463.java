package lim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class Lim1463 {

    public Lim1463() {}
    public void solution() {   	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int input;
			input = Integer.parseInt(br.readLine());
			
			List<Integer> list = new ArrayList<Integer>();
			list.add(Integer.MAX_VALUE);
			list.add(0);
			
			IntStream.rangeClosed(2, input).forEach(i -> {
				int a = i % 3 == 0 ? i / 3 : 0;
				int b = i % 2 == 0 ? i / 2 : 0;
				int c = i - 1;
				list.add(Math.min(Math.min(list.get(a), list.get(b)), list.get(c)) + 1);
			});
			
			System.out.println(list.get(input));
			
			br.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}		
    }
}



