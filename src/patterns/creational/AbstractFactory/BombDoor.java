package patterns.creational.AbstractFactory;

public class BombDoor implements Door {

	@Override
	public String open() {
		return "Opened a bomb door";
	}

}
