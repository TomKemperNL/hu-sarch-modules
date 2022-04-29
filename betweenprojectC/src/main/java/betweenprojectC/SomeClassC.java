package betweenprojectC;


import betweenprojectA.SomeClassA;
import betweenprojectB.SomeClassB;

public class SomeClassC {
    public static void main(String[] args) {
        SomeClassB b = new SomeClassB(); //ok!

        SomeClassA a = new SomeClassA(); //niet ok!


    }
}
