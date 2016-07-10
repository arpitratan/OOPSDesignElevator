package elevatorsystem;

public class MoveDownElevatorState extends AbstractElevatorState {
	
	
	public MoveDownElevatorState(ElevatorControl control, SimpleElevatorStateFactory factory) {
		super(control, factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pressedFloors.hasPrevious();
	}

	@Override
	public void next() {
		pressedFloors.previous();

	}


}
