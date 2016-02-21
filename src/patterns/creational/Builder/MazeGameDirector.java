package patterns.creational.Builder;

import patterns.creational.AbstractFactory.Maze;

public class MazeGameDirector {

	public Maze createSimpleMaze(MazeBuilder builder) {
		// The director doesn't need to know what the room or door interfaces even are, which makes them more flexible
		builder.buildMaze();
		builder.buildRoom();
		builder.buildDoor();
		return builder.getMaze();
	}
	
	public Maze createComplexMaze(MazeBuilder builder) {
		builder.buildMaze();
		for (int i = 0; i < 10; i++) {
			builder.buildRoom();
		}
		builder.buildDoor();
		return builder.getMaze();
	}
}
