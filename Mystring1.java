import java.util.Scanner;

public class Mystring1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        String n1 = s1.nextLine();
       // System.out.println(n1);

        System.out.print("LENGTH: " );
        System.out.println(n1.length());

        System.out.print("LOWERCASE: ");
        System.out.println(n1.toLowerCase());

        System.out.print("UPPERCASE: ");
        System.out.println(n1.toUpperCase());

        System.out.print("TRIM: ");
        System.out.println(n1.trim());

        System.out.print("Substring: ");
        System.out.println(n1.substring(2));

        System.out.print("CHANGE: ");
        System.out.println(n1.replace('a','u'));

        System.out.print("TRUE OR FALSE: ");
        System.out.println(n1.startsWith("Bun"));

        System.out.print("TRUE OR FALSE: ");
        System.out.println(n1.endsWith("ty"));

        System.out.print("WHAT IS CHARACTER AT THIS NUMBER 3: ");
        System.out.println(n1.charAt(3));

        System.out.print("WHAT IS INDEX OF CHARACTER n: ");
        System.out.println(n1.indexOf('n'));



    }
}
