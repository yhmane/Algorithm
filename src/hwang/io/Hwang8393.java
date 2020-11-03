package hwang.io;

import java.util.Scanner;

public class Hwang8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        int tot = 0;
        for (int i = 1; i <= cnt; i++) {
            tot += i;
        }
        System.out.println(tot);
    }
}
