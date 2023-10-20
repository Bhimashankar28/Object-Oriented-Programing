import java.util.*;
public class a_simple
{
    public static void main(String[] args) {
        student std=new student();
        std.setAge(21);
        std.setName("ashish");
        System.out.println(std.name);
        System.out.println(std.age);

        pen p1=new pen();
        p1.setColor("Red");
        p1.setThin(5);
        System.out.println(p1.color);
        System.out.println(p1.thin);
    }
}
class student
{
    String name;
    int age;

    void setName(String newname)
    {
        name= newname;
    }
    void setAge(int newage)
    {
        age=newage;
    }
}
class pen
{
    String color;
    int thin;
    void setColor(String newColor)
    {
        color=newColor;
    }
    void setThin(int newThin)
    {
        thin=newThin;
    }
}