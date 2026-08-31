import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }

            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        sc.close();
    }
}
