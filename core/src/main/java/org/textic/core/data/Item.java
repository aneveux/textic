package org.textic.core.data;

import org.textic.core.util.StringCreator;

public abstract class Item extends GameElement {

	protected Boolean alreadyUsed;

	protected ItemCategory category;

	public Item(String name, String description, ItemCategory category) {
		super(name, description);
		this.alreadyUsed = false;
		this.category = category;
	}

	public Item setAlreadyUsed(Boolean alreadyUsed) {
		this.alreadyUsed = alreadyUsed;
		return this;
	}

	public ItemCategory getCategory() {
		return this.category;
	}

	public Boolean isAlreadyUsed() {
		return this.alreadyUsed;
	}

	public abstract String use();

	@Override
	public String toString() {
		return new StringCreator().println("--").println("Item:")
				.println(this.id).println(this.name).print(" (")
				.print(this.category.toString()).print(")")
				.println(this.description).println("used: ")
				.print(this.alreadyUsed.toString()).toString();
	}

	@Override
	public String look() {
		return new StringCreator().println("--").println("Item:")
				.println(this.name).print(" (").print(this.category.toString())
				.print(")").println(this.description).println("used: ")
				.print(this.alreadyUsed.toString()).toString();
	}

}
