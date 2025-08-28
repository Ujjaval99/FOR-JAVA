
class Me {
    int a;

    public int getA(){
        return a;
    }

    Me(int v){
        this.a = v;
    }

    public int returnone(){
        return 1;
    }

}
public class this_super_class {
    public static void main(String[] args) {
        Me e = new Me(15);
        System.out.println(e.getA());
    }
}
