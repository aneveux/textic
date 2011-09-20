package org.textic.core.data;

public abstract class Item extends GameElement {

	protected boolean alreadyUsed;

	public Item(String name, String description) {
		super(name, description);
		this.alreadyUsed = false;
	}

	public Item setAlreadyUsed(boolean alreadyUsed) {
		this.alreadyUsed = alreadyUsed;
		return this;
	}

	public abstract String use();

}
