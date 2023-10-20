public class f_heirarchical
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
    class fish extends Animal
    {
        void swin()
        {
            System.out.println("fish can swim in water?");
        }
    }
    class bird extends Animal
    {
        void fly()
        {
            System.out.println("Birds always fly");
        }
    }

    public static void main(String[] args) {
        f_heirarchical outerObj=new f_heirarchical();
        bird bd=outerObj.new bird();
        bd.drink();
        fish fs=outerObj.new fish();
        fs.eat();
    }
}
