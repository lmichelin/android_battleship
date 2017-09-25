package battleships.ship;

import java.io.Serializable;

public class Destroyer extends AbstractShip {
	
	public Destroyer() {
		this(Orientation.NORTH);
	}

	public Destroyer(Orientation o) {
		super('D', "Frégate", 2, o);
	}
}
