package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim11662 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double aX = Double.parseDouble(st.nextToken()); 
		double aY = Double.parseDouble(st.nextToken()); 
		double bX = Double.parseDouble(st.nextToken()); 
		double bY = Double.parseDouble(st.nextToken()); 
		double cX = Double.parseDouble(st.nextToken()); 
		double cY = Double.parseDouble(st.nextToken()); 
		double dX = Double.parseDouble(st.nextToken()); 
		double dY = Double.parseDouble(st.nextToken()); 
		
		double distance1 = Math.sqrt(((aX - bX) * (aX - bX) + (aY - bY) * (aY - bY)));
		double distance2 = Math.sqrt(((cX - dX) * (cX - dX) + (cY - dY) * (cY - dY)));
		
		double tolerance = 1 / 1000D;
		double time = Math.max(distance1 / tolerance, distance2 / tolerance);
		
		double dX1 = (bX - aX) / time;
		double dY1 = (bY - aY) / time;
		double dX2 = (dX - cX) / time;
		double dY2 = (dY - cY) / time;
		
		double min = Math.sqrt((aX - cX) * (aX - cX) + (aY - cY) * (aY - cY));
		
		for(int i = 0; i < time; i++) {
			aX += dX1;
			aY += dY1;
			cX += dX2;
			cY += dY2;
			
			double distance = Math.sqrt((aX - cX) * (aX - cX) + (aY - cY) * (aY - cY));
			
			if(min > distance) {
				min = distance;
			}
		}
		
		System.out.println(min);
	}
}
