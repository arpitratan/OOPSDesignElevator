package elevatorsystem;

public class StopElevatorState extends AbstractElevatorState {

	public StopElevatorState(ElevatorControl control, SimpleElevatorStateFactory factory) {
		super(control, factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean hasNext() {
		return false;
	}

	@Override
	void next() {
		//Need to confirm whether retain the old state or not.

	}

	@Override
	protected void addFloor(Floor floor) {
		// TODO Auto-generated method stub
		//pressedFloors.clear();
		super.addFloor(floor);
		if(floor.getFloorNumber() > getCurrent().getFloorNumber()) {
			control.setState(factory.createElevatorState("MOVEUP"));
		}
		else if(floor.getFloorNumber() < getCurrent().getFloorNumber()) {
				control.setState(factory.createElevatorState("MOVEDOWN"));
			}
		else {
			//Same floor do nothing.
		}
		
		
	}
	

}
