package com.excilys.formation.battleships.android.ui.ships;

import android.graphics.drawable.Drawable;

import java.util.HashMap;
import java.util.Map;

import battleships.formation.excilys.com.battleships.R;
import battleships.ship.AbstractShip;
import battleships.ship.BattleShip;

public class DrawableBattleship extends BattleShip implements DrawableShip {

    static final Map<Orientation, Integer> DRAWABLES = new HashMap<>();

    static {
        DRAWABLES.put(Orientation.NORTH, R.drawable.battleship_n);
        DRAWABLES.put(Orientation.SOUTH, R.drawable.battleship_s);
        DRAWABLES.put(Orientation.EAST, R.drawable.battleship_e);
        DRAWABLES.put(Orientation.WEST, R.drawable.battleship_w);
    }

    @Override
    public int getDrawable() {
        return DRAWABLES.get(getOrientation());
    }
}
