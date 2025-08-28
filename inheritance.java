public class inheritance {
    // in ths process when i want use same class propertity in other class but also want what i change in class1 it also change in next class when i use it

    static class base{
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            System.out.println("NOW IAM IN BASE CLASS AND SETTING X VALUE");
            this.x = x;
        }
    }
   static class base1 extends base{
        int y;

        public int getY() {
            return y;
        }


         public void setY(int y) {
            this.y = y;
        }
    }
    public static void main(String[] args) {

        // for class base
        base b1 = new base();
        b1.setX(12);
        System.out.println(b1.getX());

        // for class base1
        base1 b2 = new base1();
        b2.setX(12);
        System.out.println(b1.getX());

        b2.setY(12);
        System.out.println(b2.getY());
    }
}