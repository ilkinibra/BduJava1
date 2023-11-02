import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array nece elementden ibaretdir: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];


        System.out.println("Array elementlerini yazin:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int sumOfPrimes = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sumOfPrimes += num;
            }
        }

        System.out.println("Cemi: " + sumOfPrimes);

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}