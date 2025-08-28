import java.util.Scanner;

public class Myswitch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("please enter oprater \nfor + prees 1\nfor - prees 2\nfor * prees 3\nfor / prees 4\n");
        int op = s1.nextInt();

        System.out.print("ENTER THE VALUE OF a: ");
        int  a = s1.nextInt();
        System.out.print("ENTER THE VALUE OF b: ");
        int  b = s1.nextInt();

        switch (op){
            case 1:
                System.out.println(a+b);
                break;

            case 2:
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                System.out.println(a/b);
                break;

            default:
                System.out.println("ENTER VALID OPRATER");
        }
    }
}
