package com.excilys.formation.battleships.android.ui;

import android.app.Application;
import android.content.Intent;

import com.excilys.formation.battleships.AIPlayer;
import com.excilys.formation.battleships.Board;
import com.excilys.formation.battleships.Player;
import com.excilys.formation.battleships.android.ui.ships.DrawableBattleship;
import com.excilys.formation.battleships.android.ui.ships.DrawableCarrier;
import com.excilys.formation.battleships.android.ui.ships.DrawableDestroyer;
import com.excilys.formation.battleships.android.ui.ships.DrawableSubmarine;
import com.excilys.formation.battleships.ship.AbstractShip;

import java.util.Arrays;
import java.util.List;

public class BattleShipsApplication extends Application {

    /* ***
     * Attributes
     */
    private static BoardController mBoard;
    private static Board mOpponentBoard;
    private static Game mGame;
    private static Player[] mPlayers;


    /* ***
     * Lifecycle
     */

    @Override
    public void onCreate() {
        super.onCreate();
        mGame = new Game();
    }


    /* ***
     * Methods
     */

    public static Player[] getPlayers() {
        return mPlayers;
    }

    public static BoardController getBoard() {
        return mBoard;
    }

    public static Board getOpponentBoard() {
        return mOpponentBoard;
    }

    public static Game getGame() {
        return mGame;
    }

    /* ***
     * Nested classes
     */

    public class Game {
        /* ***
         * Attributes
         */
        private Player mPlayer1;
        private Player mPlayer2;


        /* ***
         * Methods
         */
        public Game() {

        }

        public Game init(String playerName) {

            Board b = new Board(playerName);
            mBoard = new BoardController(b);
            mOpponentBoard = new Board("IA");

            mPlayer1 = new AndroidPlayer(playerName, b, mOpponentBoard, createDefaultShips());
            mPlayer2 = new AIPlayer(playerName, mOpponentBoard, b, createDefaultShips());

            // place player ships
            mPlayer1.putShips();
            mPlayer2.putShips();
            mPlayers = new Player[] {mPlayer1, mPlayer2};

            return this;
        }

        private List<AbstractShip> createDefaultShips() {
            AbstractShip[] ships = new AbstractShip[]{new DrawableDestroyer(), new DrawableSubmarine(), new DrawableSubmarine(), new DrawableBattleship(), new DrawableCarrier()};
            return Arrays.asList(ships);
        }

    }

    public class AndroidPlayer extends Player {

        public AndroidPlayer(String name, Board board, Board opponentBoard, List<AbstractShip> ships) {
            super(name, board, opponentBoard, ships);
        }

        @Override
        public void putShips() {
            Intent intent = new Intent(BattleShipsApplication.this, PutShipsActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

}
