import java.util.*;

public class i_method_overriding {
    class Animal {
        void eat() {
            System.out.println("Eat anything");
        }
    }

    class Deer extends Animal { // Corrected the class name to "Deer"
        @Override
        void eat() { // Overriding the eat method
            System.out.println("Eat grass");
        }
    }

    public static void main(String[] args) {
        i_method_overriding outerObj = new i_method_overriding();
        Deer dr = outerObj.new Deer();
        dr.eat(); // Calls the overridden eat method in the Deer class
    }
}
