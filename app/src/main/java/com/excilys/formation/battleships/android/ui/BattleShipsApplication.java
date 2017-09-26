package com.excilys.formation.battleships.android.ui;

import android.app.Application;

import java.util.List;

import battleships.Board;
import battleships.Player;
import battleships.ship.AbstractShip;
import battleships.ship.BattleShip;

public class BattleShipsApplication extends Application {

    /* ***
     * Attributes
     */
    private static BoardController mBoard;
    private static Board mOpponentBoard;
    private static Player[] mPlayers;


    /* ***
     * Lifecycle
     */

    @Override
    public void onCreate() {
        super.onCreate();
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

    /* ***
     * Nested classes
     */


    //TODO copy paste Game class



    // TODO inherit from Player
    public class AndroidPlayer {

        public AndroidPlayer(String name, Board board, Board opponentBoard, List<AbstractShip> ships) {
            //TODO call Players's constructor
        }

        //TODO insert putSHips() here
    }

}
