package org.textic.core.data;

import java.util.HashMap;

import org.textic.core.util.StringCreator;

public class Room extends GameElement {

	private String shortDescription;

	private Boolean visited;

	private HashMap<Direction, Exit> exits;

	private ItemCollection<Item> items;

	public Room(String name, String description) {
		super(name, description);
		this.exits = new HashMap<Direction, Exit>();
		this.visited = false;
		this.items = new ItemCollection<Item>();
	}

	public Room setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
		return this;
	}

	public Room setVisited(Boolean visited) {
		this.visited = visited;
		return this;
	}

	public Room addExit(Direction direction, Exit exit) {
		this.exits.put(direction, exit);
		return this;
	}

	public Room addItem(Item item) {
		this.items.add(item);
		return this;
	}

	public Room addItems(ItemCollection<Item> items) {
		this.items = items;
		return this;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public Boolean isVisited() {
		return this.visited;
	}

	public ItemCollection<Item> getItems() {
		return this.items;
	}

	@SuppressWarnings("serial")
	static class ExitNotFoundException extends Exception {

		public ExitNotFoundException() {
			super();
		}

		public ExitNotFoundException(String msg) {
			super(msg);
		}

		public ExitNotFoundException(Throwable t) {
			super(t);
		}

		public ExitNotFoundException(String msg, Throwable t) {
			super(msg, t);
		}

	}

	public Exit goTo(Direction direction) throws ExitNotFoundException {
		Exit exit = this.exits.get(direction);
		if (exit == null)
			throw new ExitNotFoundException();
		return exit;
	}

	public String look() {
		if (this.visited)
			return this.shortDescription;
		else {
			this.visited = true;
			return this.description;
		}
	}

	@Override
	public String toString() {
		StringCreator sc = new StringCreator().println("--").println("Room:")
				.println(this.id).println(this.name).println(this.description)
				.println(this.shortDescription).println("visited: ")
				.print(this.visited.toString()).println(this.items.toString());
		for (Direction entry : this.exits.keySet())
			sc.println(this.exits.get(entry).toString());
		return sc.toString();
	}

	public String checkItems() {
		return this.items.toString();
	}

	public boolean pick(Item item) {
		return this.items.remove(item);
	}

	public boolean drop(Item item) {
		return this.items.add(item);
	}

}
