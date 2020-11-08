package hwang.io;

import java.util.Scanner;

public class Hwang2445 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * num; j > 2 * i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 2 * num; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 1; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            for (int j =  2 * (num -i); j < 2 * num; j++) {
                System.out.print(" ");
            }
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
