package patterns.creational.Builder;

import patterns.creational.AbstractFactory.Maze;

public interface MazeBuilder {
	
	public void buildMaze();
	public void buildRoom();
	public void buildDoor();
	public Maze getMaze();
	
}
