package battleships;


import java.util.List;

import battleships.ship.AbstractShip;

public class AIPlayer extends Player {
    private BattleShipsAI ai;
    public AIPlayer(String name, Board ownBoard, Board opponentBoard, List<AbstractShip> ships) {
        super(name, ownBoard, opponentBoard, ships);
        ai = new BattleShipsAI(ownBoard, opponentBoard);
    }

    // TODO AIPlayer must not inherit "keyboard behavior" from player. Call ai instead.

    public void putShips() {
        ai.putShips(ships);
    }

    public Hit sendHit(int[] coords) {
        return ai.sendHit(coords);
    }
}