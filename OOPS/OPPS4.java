public class OPPS4 {
    // Interfaces
    public static void main(String[] args) {
      Queen q = new Queen();
      q.moves();
    }
    
}
 interface Herbivore {

 }
 interface Carnivore{

 }
 class Bear implements Herbivore, Carnivore{ 

 }
 interface ChessPlayer {
    void moves(); // By Default public as well as abstract
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left , Right, Diagonal");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left , Right");
    }
}


class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left , Right");
    }
}

