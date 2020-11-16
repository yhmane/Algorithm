package hwang.io;

import java.util.Scanner;

public class Hwang2441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = cnt - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
