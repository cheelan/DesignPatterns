package patterns.creational.AbstractFactory;

public class BombMazeFactory implements MazeFactory {

	@Override
	public Maze createMaze() {
		return new Maze();
	}

	@Override
	public Room createRoom() {
		return new BombRoom();
	}

	@Override
	public Door createDoor() {
		return new BombDoor();
	}
	
}
