package homeworks.exeptions.array_excep;

import java.util.Scanner;

public class ArraysEx {

    /**
     * catching non-integer value
     */
    public static void ArraysExc() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {

            try {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            } catch (Exception e) {
                System.out.println("Nope");
                break;
            }
        }


        System.out.println(sum);

    }


}
