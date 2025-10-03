public class Interface {
    public static void main(String[] args) {
        queen qc = new queen();
        qc.moves(); 
    }
interface chessPlayer {
void moves();
}
static class queen implements chessPlayer{
    public void moves(){  // implementing public because interface allows public and abstract so while not writing it will guess only default
     System.out.println("Queen moves up right left down & diagonal");
    }
}
class rook implements chessPlayer{
    public void moves(){
        System.out.println("Hook moves are up right left down");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("King moves up right left down by 1 step");
    }
}
}
