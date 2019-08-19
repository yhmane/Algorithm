package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim1931 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Schedule> list = new ArrayList<Schedule>();
		List<Schedule> assignedList = new ArrayList<Schedule>();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			list.add(new Schedule(start, end));
		}
		
		list.sort(Comparator.naturalOrder());	
		
		for(Schedule candidate : list) {
			boolean canAssigned = true;
			
			for(Schedule assigned : assignedList) {
				
				if(assigned.intersect(candidate)) {
					canAssigned = false;
					break;
				}
			}
			
			if(canAssigned) {
				assignedList.add(candidate);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	static class Schedule implements Comparable<Schedule> {
		private int start;
		private int end;
		private int duration;
		
		public Schedule(int start, int end) {
			this.start = start;
			this.end = end;
			this.duration = end - start;
		}

		public int getStart() {
			return start;
		}

		public int getEnd() {
			return end;
		}

		public int getDuration() {
			return duration;
		}

		@Override
		public int compareTo(Schedule o) {
			int ret = this.duration - o.getDuration();
			
			if(ret == 0) {
				ret = this.start - o.start;
			}
			return ret;
		}
		
		public boolean intersect(Schedule o) {
			if(o.getStart() < this.end && o.getEnd() > this.start) {
				return true;
			}
			return false;
		}
	}
}
