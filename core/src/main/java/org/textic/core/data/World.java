package org.textic.core.data;

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

}
