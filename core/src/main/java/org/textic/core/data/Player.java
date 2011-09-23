package org.textic.core.data;

import org.textic.core.util.StringCreator;

public class Player extends GameElement {

	private Inventory inventory;

	public Player(String name, String description) {
		super(name, description);
	}

	public Player setInventory(Inventory inventory) {
		this.inventory = inventory;
		return this;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	@Override
	public String look() {
		return new StringCreator().println("--").println("Player:")
				.println(this.name).println(this.description)
				.println(this.inventory.look()).toString();
	}

	@Override
	public String toString() {
		return new StringCreator().println("--").println("Player:")
				.println(this.id).println(this.name).println(this.description)
				.println(this.inventory.toString()).toString();
	}

}
