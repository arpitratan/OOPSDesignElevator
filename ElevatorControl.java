package elevatorsystem;

public class ElevatorControl {
	
	private AbstractElevatorState currentState;
	private SimpleElevatorStateFactory factory;
	
	public ElevatorControl() {
		factory = new SimpleElevatorStateFactory(this);
		currentState = factory.createElevatorState("STOP");
	}
	
	public void setState(AbstractElevatorState state) {
		currentState = state;
	}

	public void selectFloor(Floor floor) {
		currentState.addFloor(floor);
	}
	
	public void openDoor() {
		//opens the door
	}
	
	public void closeDoor() {
		//close the door.
	}
	
	public void init() {
		while(true) {
			currentState.next();
			openDoor();
			closeDoor();
		}
	}
		
}
