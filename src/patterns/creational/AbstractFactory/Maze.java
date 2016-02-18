package patterns.creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Maze {
	
	private List<Room> rooms = new ArrayList<Room>();
	private List<Door> doors = new ArrayList<Door>();
	
	public List<Room> getRooms() {
		return rooms;
	}
	
	public List<Door> getDoors() {
		return doors;
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	public void addDoor(Door door) {
		doors.add(door);
	}

}
