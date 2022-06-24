package P2;

public class B {
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;

    public static void main(String[] args) {
        B df = new B();
        df.s = 100;
        df.i = 200;
        df.l = 300;
        df.f = 5.5f;
        df.d = 10.55;
        df.c = 'Z';
        df.str = "SoftEng";
        df.b = true;
        System.out.println("\nShort s = " + df.s);
        System.out.println("\nInt i = " + df.i);
        System.out.println("\nLong l = " + df.l);
        System.out.println("\nFloat = " + df.f);
        System.out.println("\nDouble d = " + df.d);
        System.out.println("\nChar c = " + df.c);
        System.out.println("\nString str = " + df.str);
        System.out.println("\nBoolean b = " + df.b);


    }

}
