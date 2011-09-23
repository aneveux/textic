package org.textic.core.data;

public class SimpleExit extends Exit {

	public SimpleExit(String name, String description, Room exitRoom) {
		super(name, description, exitRoom);
	}

	@Override
	public Room getExitRoom() {
		return this.exitRoom;
	}

}
