package org.textic.core.data;

public abstract class Exit extends GameElement {

	protected Room exitRoom;

	public Exit(String name, String description, Room exitRoom) {
		super(name, description);
		this.exitRoom = exitRoom;
	}

	public abstract Room getExitRoom();

}
