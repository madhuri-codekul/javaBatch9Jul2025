package javabatch.common;

/**
 * a container which holds the value
 * assigned with a data type
 * name memory location
 * Types of variable
 * 1. local variable
 *      - declared inside the method body
 * 2. instance variable
 *      - declared inside the class but outside the body of the method
 *      - not allow in static methods
 * 3. static variable
 *      - declared inside the class but outside the body of the method and declared with static keyword
 *      - cannot be local
 *
 */
public class Variables {
    int b = 10;
    static int c = 20;

    public static void main(String[] args) {
        int a= 15;
//        b = 60; // instance variable not able to assign in static context
        System.out.println("main a: "+a);
//        System.out.println("b: "+b); // instance variable not allow in static context
        System.out.println("c: "+c);

//        check();

        Variables v = new Variables();
        System.out.println("V: "+v);
        v.check();
    }

    void check(){
        int a=20;
        b = 60;
        c = 80;
//        static int d = 60;  // not allowed in non static method
        System.out.println("check a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }
}
