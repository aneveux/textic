package org.textic.core.data;

import java.util.Collection;

public class Inventory extends GameElement {

	protected ItemCollection<Item> items;

	protected int maxItems;

	public Inventory(String name, String description, int maxItems) {
		super(name, description);
		this.maxItems = maxItems;
		this.items = new ItemCollection<Item>();
	}

	public Inventory setMaxItems(int maxItems) {
		this.maxItems = maxItems;
		return this;
	}

	public int getMaxItems() {
		return this.maxItems;
	}

	@SuppressWarnings("serial")
	static class FullInventoryException extends Exception {

		public FullInventoryException() {
			super();
		}

		public FullInventoryException(String msg) {
			super(msg);
		}

		public FullInventoryException(Throwable t) {
			super(t);
		}

		public FullInventoryException(String msg, Throwable t) {
			super(msg, t);
		}

	}

	public Inventory addItem(Item item) throws FullInventoryException {
		if (this.items.size() < this.maxItems)
			this.items.add(item);
		else
			throw new FullInventoryException();
		return this;
	}

	public Inventory addItems(Collection<Item> items)
			throws FullInventoryException {
		if (items.size() + this.items.size() <= this.maxItems)
			this.items.addAll(items);
		else
			throw new FullInventoryException();
		return this;
	}

	public boolean drop(Item item) {
		return this.items.remove(item);
	}

	public Inventory clear() {
		this.items.clear();
		return this;
	}

	public ItemCollection<Item> getItems() {
		return this.items;
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
