import java.util.*;
public class g_method_overloading
{
    class Calculator
    {
        int sum(int a, int b)
        {
            return a+b;
        }
        float sum(float a, float b)
        {
            return a + b;
        }
        int sum(int a, int b, int c)
        {
            return a+b+c;
        }
    }
    public static void main(String[] args) {
        g_method_overloading outerObj = new g_method_overloading();
        Calculator clt = outerObj.new Calculator();
        System.out.println(clt.sum(1, 2));
        System.out.println(clt.sum(1, 2, 3));
        System.out.println(clt.sum((float) 1.5, (float) 2.5));
    }
}
