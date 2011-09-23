package org.textic.core.data;

import org.textic.core.util.StringCreator;

public class World {

	private Direction memory;

	private Room currentRoom;

	private Player player;

	private World() {

	}

	private static final class Holder {
		private static World _instance = new World();
	}

	public static World getWorld() {
		return Holder._instance;
	}

	public World setMemory(Direction memory) {
		this.memory = memory;
		return this;
	}

	public World setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
		return this;
	}

	public World setPlayer(Player player) {
		this.player = player;
		return this;
	}

	public Direction getMemory() {
		return this.memory;
	}

	public Room getCurrentRoom() {
		return this.currentRoom;
	}

	public Player getPlayer() {
		return this.player;
	}

	public String look() {
		return new StringCreator().println("--").println("Memory: ")
				.print(this.memory.toString()).println("Current: ")
				.print(this.currentRoom.look()).println("Player: ")
				.print(this.player.look()).toString();
	}

	@Override
	public String toString() {
		return new StringCreator().println("--").println("Memory: ")
				.print(this.memory.toString()).println("Current: ")
				.print(this.currentRoom.toString()).println("Player: ")
				.print(this.player.toString()).toString();
	}
}
