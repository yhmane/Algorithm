package hwang.onedayonecommit;

import java.util.Arrays;
import java.util.Scanner;

public class Hwang1000 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(numbers[0] + numbers[1]);
    }
}
