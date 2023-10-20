import java.util.*;
public class e_multi_level
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
    class mamal extends Animal
    {
        int leg;
    }
    class dog extends mamal
    {
        void breed()
        {
            System.out.println("loud");
        }
    }

    public static void main(String[] args) {
        e_multi_level outerObj=new e_multi_level();
        dog dg=outerObj.new dog();
        dg.leg=4;
        System.out.println(dg.leg);
        dg.drink();
        dg.breed();
    }
}
