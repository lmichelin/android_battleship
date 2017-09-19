package com.excilys.formation.battleships.android.ui.ships;

import com.excilys.formation.battleships.ship.AbstractShip;
import com.excilys.formation.battleships.ship.Submarine;

import java.util.HashMap;
import java.util.Map;

import battleships.formation.excilys.com.battleships.R;

/**
 * Created by scaltot on 12/09/17.
 */

public class DrawableSubmarine extends Submarine implements DrawableShip {

    private static final Map<AbstractShip.Orientation, Integer> DRAWABLES = new HashMap<>();

    static  {
        DRAWABLES.put(Orientation.SOUTH, R.drawable.submarine_s);
        DRAWABLES.put(Orientation.EAST, R.drawable.submarine_e);
        DRAWABLES.put(Orientation.NORTH, R.drawable.submarine_n);
        DRAWABLES.put(Orientation.WEST, R.drawable.submarine_w);
    }

    @Override
    public int getDrawable() {
        return DRAWABLES.get(this.getOrientation());
    }
}
