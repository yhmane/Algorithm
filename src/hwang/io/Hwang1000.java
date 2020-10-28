package hwang.io;

import java.util.Scanner;

public class Hwang1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
    }
}

