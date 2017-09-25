package battleships.ship;

import java.io.Serializable;

public class Carrier extends AbstractShip {
	
	public Carrier() {
		this(Orientation.NORTH);
	}
	
	public Carrier(Orientation o) {
		super('C', "Porte avions", 5, o);
	}
}
