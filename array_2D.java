import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int [][] arr = new int [2][2];

        System.out.println("ENTER VALUE OF 2D MATRIX");
        for (int i = 0; i<2; i++ ){
            for (int j = 0; j<2; j++){

                arr[i][j] = s1.nextInt();
            }
        }

        System.out.println("YOUR MATRIX");
        for (int i = 0; i<2; i++ ){
            for (int j = 0; j<2; j++){

                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }



    }
}
