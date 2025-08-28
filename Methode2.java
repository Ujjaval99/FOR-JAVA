
public class Methode2 {
     int logic(int x,int y){

        int z;
        if(x>y){
            z = x-y;
        }
        else {
            z = y-x;
        }
        return z;

    }

    public static void main(String[] args) {

         Methode2 obj = new Methode2();

        int c = obj.logic(12,13);
        System.out.println(c);
    }
}
