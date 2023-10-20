import java.util.*;
public class k_interface
{
    interface ChessPlayer
    {
        void moves();
    }
    class Queen implements ChessPlayer
    {
        public void moves()
        {
            System.out.println("up,doun,right,diagonal(in all direction)");
        }
    }
    class Rook implements ChessPlayer
    {
        public void moves()
        {
            System.out.println("up,doun,right,left");
        }
    }
    class King implements ChessPlayer
    {
        public void moves()
        {
            System.out.println("up,doun,right,diagonal(by 1 Step)");
        }
    }

    public static void main(String[] args) {
        k_interface outerObj =new k_interface();
        Queen q=outerObj.new Queen();
        q.moves();
    }
}
