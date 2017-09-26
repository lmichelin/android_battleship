package battleships;

import java.io.Serializable;
import java.util.List;

import battleships.ship.AbstractShip;

public class Player implements Serializable {
    protected Board board;
    protected Board opponentBoard;
    public int destroyedCount;
    protected AbstractShip[] ships;
    public boolean lose;
    private String name;

    public Player(String name, Board board, Board opponentBoard, List<AbstractShip> ships) {
        this.name = name;
        this.board = board;
        this.ships = ships.toArray(new AbstractShip[0]);
        this.opponentBoard = opponentBoard;
    }


    public Hit sendHit(int[] coords) {
        return null;
    }

    public void putShips() {
    }

    public AbstractShip[] getShips() {
        return ships;
    }

    public void setShips(AbstractShip[] ships) {
        this.ships = ships;
    }

    public String getName() {
        return name;
    }
}