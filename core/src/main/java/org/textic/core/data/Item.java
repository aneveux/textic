package org.textic.core.data;

public abstract class Item extends GameElement {

	protected boolean alreadyUsed;

	protected ItemCategory category;

	public Item(String name, String description, ItemCategory category) {
		super(name, description);
		this.alreadyUsed = false;
		this.category = category;
	}

	public Item setAlreadyUsed(boolean alreadyUsed) {
		this.alreadyUsed = alreadyUsed;
		return this;
	}

	public ItemCategory getCategory() {
		return this.category;
	}

	public abstract String use();

}
