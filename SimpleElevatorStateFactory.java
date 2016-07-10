package elevatorsystem;

public class SimpleElevatorStateFactory {
	
	private ElevatorControl control;
	
	public SimpleElevatorStateFactory(ElevatorControl control) {
		this.control = control;
	}
	private static AbstractElevatorState moveUpState;
	private static AbstractElevatorState moveDownState;
	private static AbstractElevatorState stopState;
	
	public AbstractElevatorState createElevatorState(String state) {
			if(state.equalsIgnoreCase("MOVEUP")) {
				moveUpState = new MoveUpElevatorState(control, this);
				return moveUpState;
			}
			
			if(state.equalsIgnoreCase("MOVEDOWN")) {
				moveDownState = new MoveDownElevatorState(control, this);
				return moveDownState;
			}
			
			if(state.equalsIgnoreCase("STOP")) {
				stopState = new StopElevatorState(control, this);
				return stopState;
			}
			
			return null;
	}

}
