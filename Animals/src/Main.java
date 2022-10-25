//Спростив для себе, для кращого розуміння і багато коду трохи мені важко сприймати поки.

import java.util.Arrays;
public class Main implements Comparable <Main> {
    public static void main(String[] args) {
        // topic 9
int animalcount = 3;
int canspeakanimals = 0;

try {
int resultofcount = animalcount/canspeakanimals;}
catch (ArithmeticException ae) {
    System.out.println( "You cant divide on zero ");
}
        System.out.println("I counted it !");
Dog dog = new Dog();
CanRun canRun = dog;
dog  = (Dog) canRun;
Flyable flyable = new Bird ();
flyable.fly();
    }

    @Override
    public int compareTo(Main o) {
        return 0;
    }

}