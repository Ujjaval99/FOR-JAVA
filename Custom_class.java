import java.util.Scanner;

class employ{
    int id;
    String name;
}
public class Custom_class {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        employ[] arr = new employ[3];

        for (int i = 0;i<3;i++){
            arr[i]= new employ();

            System.out.print("ENTER YOUR ID: ");
            arr[i].id = s1.nextInt();
            s1.nextLine();
            System.out.print("ENTER YOUR NAME: ");
            arr[i].name = s1.nextLine();
        }
        for (int i = 0;i<3;i++){

            System.out.println("ID IS: " + arr[i].id);
            System.out.println("NAME IS: " + arr[i].name);
        }

    }
}
