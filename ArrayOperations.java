import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sum = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < 10; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        double average = (double) sum / 10;

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Number of even elements = " + even);
        System.out.println("Number of odd elements = " + odd);

        sc.close();
    }
}
