package patterns.creational.AbstractFactory;

public class EnchantedMazeFactory implements MazeFactory {

	@Override
	public Maze createMaze() {
		return new Maze();
	}

	@Override
	public Room createRoom() {
		return new EnchantedRoom();
	}

	@Override
	public Door createDoor() {
		return new EnchantedDoor();
	}

}
