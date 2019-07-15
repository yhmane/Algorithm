package lim;

public class MemoryTest {
	public static void main(String[] args) throws Exception {
		int[] sdfg = new int[10_000_000];
		
		Runtime runtime = Runtime.getRuntime();
		long mb = 1024 * 1024;
		System.out.println("Total Memory : " + runtime.totalMemory() / mb + " MB");
		System.out.println("Max Memory : " + runtime.maxMemory() / mb + " MB");
		System.out.println("Used Memory : " + (runtime.totalMemory() - runtime.freeMemory()) / mb + " MB");
	}
}
