import java.util.*;
public class j_abstract_class
{
    abstract class Animal
    {
        String color;
        Animal()
        {
            color="brown";
        }
        void eat()
        {
            System.out.println("Animal eats");
        }
        abstract void walk();
    }
    class horse extends Animal
    {
        void changeColor()
        {
            color="black";
        }
        @Override
        void walk() {
            System.out.println("Walk on 4 leg");
        }
    }

    public static void main(String[] args) {
        j_abstract_class outerObj= new j_abstract_class();
        horse hs=outerObj.new horse();
        hs.eat();
        hs.walk();
        System.out.println(hs.color);

    }
}
