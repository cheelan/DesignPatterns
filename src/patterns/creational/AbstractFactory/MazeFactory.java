package patterns.creational.AbstractFactory;

public interface MazeFactory {
	
	public abstract Maze createMaze();
	public abstract Room createRoom();
	public abstract Door createDoor();
	
}
