package hwang.io;

import java.util.Scanner;

public class Hwang2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int i = 1; i <= cnt; i ++) {
            for (int j = cnt; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
