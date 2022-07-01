package P10;

public class Human {
    String name ;
    int age ;
    // constructor
    public Human() {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        //instance
        Human noob = new Human();
        Human jimon = new Human();
        noob.name = "eiei";
        noob.age  = 30;
        jimon.name = "warawut";
        jimon.age = 20;

        System.out.println("Human Name is " + noob.name);
        System.out.println("Human Age is " + noob.age);
        System.out.println("Human Name is " + jimon.name);
        System.out.println("Human Age is " + jimon.age);
    }
}
