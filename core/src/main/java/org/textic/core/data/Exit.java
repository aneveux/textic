package org.textic.core.data;

import org.textic.core.util.StringCreator;

public abstract class Exit extends GameElement {

	protected Room exitRoom;

	public Exit(String name, String description, Room exitRoom) {
		super(name, description);
		this.exitRoom = exitRoom;
	}

	public abstract Room getExitRoom();

	@Override
	public String look() {
		return new StringCreator().println("--").println("Exit: ")
				.print(this.name).println(this.description).println("to: ")
				.print(this.exitRoom.getName()).toString();
	}

	@Override
	public String toString() {
		return new StringCreator().println("--").println("Exit:")
				.println(this.id).println(this.name).println(description)
				.println(this.exitRoom.name).print("(").print(this.exitRoom.id)
				.print(")").toString();
	}

}
