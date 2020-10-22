import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/22/2020
 * Time: 1:52 PM
 */
public class InsertionSortByStep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = Integer.parseInt(input.nextLine());
        int[] numbers = new int[size];
        System.out.println("Enter " + numbers.length + " values: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(numbers);
    }

    public static void insertionSortByStep(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                System.out.println("Swap " + arr[j + 1] + " with " + arr[j]);
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            System.out.println("Swap " + arr[j + 1] + " with " + key);
            arr[j + 1] = key;
            System.out.print("List after the '" + i + "' sort: ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
