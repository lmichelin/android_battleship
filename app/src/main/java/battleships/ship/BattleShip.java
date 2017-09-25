package battleships.ship;

import java.io.Serializable;

public class BattleShip extends AbstractShip {
	
	public BattleShip() {
		this(Orientation.NORTH);
	}
	public BattleShip(Orientation o) {
		super('B', "Croiseur", 4, o);
	}
}
