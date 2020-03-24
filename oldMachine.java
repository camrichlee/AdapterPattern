package coffeeMachineInterface;


//binary machine that reads two options
public class oldMachine implements coffeeMachineInterface{
	public String chooseOption1 (){
		System.out.println("regular coffee");
		return "regular coffee";
	}

	public String chooseOption2() {
		System.out.println("decaf coffee");
		return "decaf coffee";
	}
}
