package elevatorsystem;

public abstract class AbstractElevatorState {
	
	protected ElevatorControl control;
	protected SimpleElevatorStateFactory factory;
	
	public AbstractElevatorState(ElevatorControl control, SimpleElevatorStateFactory factory) {
		this.control = control;
		this.factory = factory;
	}
	
	protected DoublyLinkedList<Floor> pressedFloors;
	
	abstract boolean hasNext();
	abstract void next();
	protected Floor getCurrent() {
		return pressedFloors.current();
	}
	protected void addFloor(Floor floor) {
		pressedFloors.addToList(floor);
	}

}
