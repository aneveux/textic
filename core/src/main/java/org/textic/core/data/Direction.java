package org.textic.core.data;

public enum Direction {

	NORTH, SOUTH, EAST, WEST;

	public Direction getOpposite() {
		if (this.toString().equalsIgnoreCase("NORTH"))
			return Direction.SOUTH;
		else if (this.toString().equalsIgnoreCase("SOUTH"))
			return Direction.NORTH;
		else if (this.toString().equalsIgnoreCase("EAST"))
			return Direction.WEST;
		else
			return Direction.EAST;
	}

}
