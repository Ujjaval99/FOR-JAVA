public class Methode1 {
    static int logic(int x,int y){

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

        int c = logic(12,13);
        System.out.println(c);
    }
}
