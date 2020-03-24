package coffeeMachineInterface;

//use adapter to test by calling these methods
//creating a new machine adapter - the adapter has a old machine built in
//lines 8 & 9 are calling the methods of the old machine
public class newMachine implements coffeeMachineInterface {
	public static void main(String[] args)	{
		coffeeMachineAdapter machineAdapter = new coffeeMachineAdapter(new oldMachine());
		machineAdapter.chooseOption1();
		machineAdapter.chooseOption2();
	}
}
