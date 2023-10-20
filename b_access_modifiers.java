import java.util.*;

public class b_access_modifiers
{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setThin(5);
        System.out.println(p1.getThin());
    }

    static class Pen
    {
        private String color;
        private int thin;

        String getColor()
        {
            return this.color;
        }

        void setColor(String newColor)
        {
            this.color = newColor;
        }

        int getThin()
        {
            return this.thin;
        }

        void setThin(int newThin)
        {
            this.thin = newThin;
        }
    }
}
