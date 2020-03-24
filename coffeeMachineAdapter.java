package coffeeMachineInterface;

public class coffeeMachineAdapter implements coffeeMachineInterface{
	
	//instantiates the object of the old machine; the adapter has a oldMachine
	private oldMachine oldMachine;
	
	//creates a constructor of the adapter, passing in the object oldMachine defined on line 6. 
	//adapter now has a oldMachine object
	public coffeeMachineAdapter(oldMachine oldMachine) {
		this.oldMachine = oldMachine;
	}
	
	//inherit first option functions from the interface
	public String chooseOption1() {
		return oldMachine.chooseOption1();
	}
	
	//inherit second option functions from the interface
	public String chooseOption2() {
		return oldMachine.chooseOption2();
	}
}
