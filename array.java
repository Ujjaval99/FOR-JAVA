import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int[] arr = new int[12];

        for (int i = 0; i < 12; i++) {
            arr[i] = s1.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < 12; i++) {
            System.out.println(arr[i]);
        }
        s1.close(); // Close scanner
    }
}
