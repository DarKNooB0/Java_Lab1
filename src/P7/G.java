package P7;

public class G {
    public static void main(String[] args) {
        int x = 7, y = 11, z = 11;
        boolean a = true, b = false;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x<y = " + (x<y));
        System.out.println("x>z = " + (x>z) );
        System.out.println("x<=z = " + (x<=z));
        System.out.println("x>=y =" + (x>=y));
        System.out.println("y==z = " + (y==z));
        System.out.println("x!=z = " + (x!=z));
        System.out.println("a && b  = " + (a && b));
        System.out.println("a || b  = " + !(a || b));
        System.out.println("a && b  = " + !(a && b)) ;
    }
}
