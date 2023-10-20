public class m_super
{
    class Animal
    {
        Animal()
        {
            System.out.println("Animal ");
        }
    }
    class Horse extends Animal
    {
        Horse()
        {
            super();
            System.out.println("Horse");
        }
    }

    public static void main(String[] args) {
        m_super outerObj=new m_super();
        Horse h=outerObj.new Horse();
    }
}
