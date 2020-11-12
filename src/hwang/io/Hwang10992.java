package hwang.io;

import java.util.Scanner;

public class Hwang10992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n - 1; ++j) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else if (i == n - 1) {
                for (int j = 0; j < n * 2 - 1; ++j) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < i * 2 - 1; ++j) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
