package hwang.io;

import java.util.Scanner;

public class Hwang10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        int max = -1000001;
        int min = 1000001;
        for (int i = 0; i < cnt; i++) {
            int num = scanner.nextInt();
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }

        System.out.println(min + " " + max);
    }
}
