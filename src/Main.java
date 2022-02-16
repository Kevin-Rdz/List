import uaslp.objetos.lista.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();

        team1.addAtTail("Jesus");
        team1.addAtTail("Salomon");
        team1.addAtTail("Yael");

        team2.addAtFront("Jesus");
        team2.addAtFront("Salomon");
        team2.addAtFront("Yael");

    }
}
