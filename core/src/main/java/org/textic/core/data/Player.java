package org.textic.core.data;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
