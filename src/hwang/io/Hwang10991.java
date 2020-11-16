package hwang.io;

import java.util.Scanner;

public class Hwang10991 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1;i <= num; i++) {
            for (int j = num-i ; j > 0; j--) {
                System.out.print(" ");
            }

            System.out.print("*");
            for ( int j = 1; j < i ;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
