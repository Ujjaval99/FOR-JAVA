import java.util.Scanner;

public class Access_modifiers {
    // take id and name from user and they can enter wrong things

    static class Employee{
       private int id;
       private String name;

        public void setid(int i){
            id = i;
        }
        public int getid(){
            return id;
        }
        public void setname(String n){
            name = n;

        }
        public String getname(){
            return name;
        }
    }
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Employee e1 = new Employee();

      /*  System.out.print("ENTER YOUR ID: ");
        int id = s1.nextInt();

        System.out.print("ENTER YOUR NAME: ");
        int id = s1.nextLine();

        System.out.println("YOUR ARE SUCCESSFUL REGISTER");*/

        e1.setid(45);
        System.out.println(e1.getid());

        e1.setname("UJJAVAL");
        System.out.println(e1.getname());


    }
}
