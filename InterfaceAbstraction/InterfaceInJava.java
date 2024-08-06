interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("up, down , left ,right ,diagonal (in all 4 directions)");
    }
}
class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("up, down , left ,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonalbyone1stem");
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        Queen q1=new Queen();
        q1.moves();
    }
}
