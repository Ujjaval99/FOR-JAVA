import java.util.Scanner;

public class Constructors {

    static class Employee{
        int id;
        String name;

        public Employee(int id,String name){
            this.id = id;
           this.name = name;
        }

      public  void display(){
          System.out.println("ID: "+id+ "\t"+ "NAME: "+ name);
      }
    }
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Employee[] e = new Employee[12];

        for (int i = 0;i<2;i++){

            System.out.print("ENTER YOUR ID: ");
            int id = s1.nextInt();
            s1.nextLine();

            System.out.print("ENTER YOUR NAME: ");
            String name = s1.nextLine();

            e[i] = new Employee(id,name);
        }

        for (int i = 0;i<12;i++){

            e[i].display();

        }


    }
}
