package elevatorsystem;

public class MoveUpElevatorState extends AbstractElevatorState {

	
	public MoveUpElevatorState(ElevatorControl control, SimpleElevatorStateFactory factory) {
		super(control, factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return pressedFloors.hasNext();
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		pressedFloors.next();

	}

	

}
