package patterns.creational.Builder;

import patterns.creational.AbstractFactory.EnchantedDoor;
import patterns.creational.AbstractFactory.EnchantedRoom;
import patterns.creational.AbstractFactory.Maze;

public class EnchantedMazeBuilder implements MazeBuilder {

	private Maze maze;
	
	@Override
	public void buildMaze() {
		maze = new Maze();
	}

	@Override
	public void buildRoom() {
		maze.addRoom(new EnchantedRoom());
	}

	@Override
	public void buildDoor() {
		maze.addDoor(new EnchantedDoor());
	}

	@Override
	public Maze getMaze() {
		return maze;
	}

}
