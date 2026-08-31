import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(i + " x " + num + " = " + result);
            sum = sum + result;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
