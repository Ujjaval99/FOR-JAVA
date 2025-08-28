public class Methode_overloading {

    static void foo(){
        System.out.println("GOOD MORNING BRO");
    }

    static void foo(int a){
        System.out.println("YOUR LUCKY NUMBER IS: "+a);
    }

    public static void main(String[] args) {

        foo();
        foo(12);
    }

}
