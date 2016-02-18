package patterns.creational.AbstractFactory;

public class MazeClient {
	
	/**
	 * Creates a hard coded maze game. While the rooms and doors are hard coded, the type of maze can be switched
	 * between Enchanted and Bomb by merely passing in a different implementation of MazeFactory.
	 * @param factory
	 * @return
	 */
	public static Maze createMazeGame(MazeFactory factory) {
		Maze maze = factory.createMaze();
		maze.addDoor(factory.createDoor());
		maze.addRoom(factory.createRoom());
		maze.addRoom(factory.createRoom());
		return maze;
	}
	
	/**
	 * Main method acting as a client for the Maze family
	 * @param args
	 */
	public static void main(String[] args) {
		Maze bombMaze = createMazeGame(new BombMazeFactory());
		for (Door door : bombMaze.getDoors()) {
			System.out.println(door.open());
		}
		for (Room room : bombMaze.getRooms()) {
			System.out.println(room.enter());
		}
		
		Maze enchantedMaze = createMazeGame(new EnchantedMazeFactory());
		for (Door door : enchantedMaze.getDoors()) {
			System.out.println(door.open());
		}
		for (Room room : enchantedMaze.getRooms()) {
			System.out.println(room.enter());
		}
	}
}
