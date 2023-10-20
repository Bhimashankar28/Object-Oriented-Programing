import java.sql.SQLOutput;
import java.util.*;
public class c_constructor
{
    public static void main(String[] args) {
        c_constructor outerObj=new c_constructor();
        Pen p1=outerObj.new Pen ();
        p1.color="Yello";
        p1.thin=5;
        p1.marks[0]=15;
        p1.marks[1]=25;
        p1.marks[2]=35;
        Pen p2=outerObj.new Pen ("red");
        Pen p3=outerObj.new Pen (5);

        Pen p4=outerObj.new Pen (p1);
        System.out.println(p1.color);
        System.out.println(p1.thin);
        for (int i = 0; i < 3; i++) {
            System.out.println(p4.marks[i]);

        }
    }
    class Pen
    {
        String color;
        int thin;
        int marks[];
        Pen(Pen p1)
        {
            marks=new int[3];
            this.color=p1.color;
            this.thin=p1.thin;



        }
        Pen()
        {
            System.out.println("This is constructor");
        }
        Pen(String color)
        {
            this.color=color;
            System.out.println(color);
        }
        Pen(int thin)
        {
            this.thin=thin;
            System.out.println(thin);
        }
    }
}
