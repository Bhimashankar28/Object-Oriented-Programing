import java.util.*;
import java.io.*;
public class d_inheritance
{
    class Animal
    {
        String color;
        void eat()
        {
            System.out.println("Fruits");
        }
        void drink()
        {
            System.out.println("water");
        }
    }
    class Tiger extends Animal
    {
        String king;
        void run()
        {
            System.out.println("Fast in all animal");
        }
    }

    public static void main(String[] args) {
        d_inheritance outerObj= new d_inheritance();
        Tiger tg= outerObj.new Tiger();
        tg.eat();
    }
}
