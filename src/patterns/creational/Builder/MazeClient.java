package patterns.creational.Builder;

import patterns.creational.AbstractFactory.Door;
import patterns.creational.AbstractFactory.Maze;
import patterns.creational.AbstractFactory.Room;

public class MazeClient {
	
	public static void main(String[] args) {
		MazeGameDirector mazeGame = new MazeGameDirector();
		// The client can make something complicated in just one call, with the actual building logic abstracted to the
		// director
		Maze enchantedSimpleMaze = mazeGame.createComplexMaze(new EnchantedMazeBuilder());
		for (Door door : enchantedSimpleMaze.getDoors()) {
			System.out.println(door.open());
		}
		for (Room room : enchantedSimpleMaze.getRooms()) {
			System.out.println(room.enter());
		}
	}
}
