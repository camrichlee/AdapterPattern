package coffeeMachineInterface;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unitTest {

	//Testing adapter
	@Test
	void testAdapter() {
		oldMachine oldMachine = new oldMachine();	
		
		//calling constructor from new machine 
		coffeeMachineAdapter machineAdapter = new coffeeMachineAdapter(new oldMachine());

		assertNotNull(machineAdapter);
	}
	
	//Testing
	@Test
	void testOption1() {
		oldMachine oldMachine = new oldMachine();	
		
		//calling constructor from new machine class
		coffeeMachineAdapter machineAdapter = new coffeeMachineAdapter(new oldMachine());

		assertEquals(machineAdapter.chooseOption1(), "regular coffee");
	}
	
	//Testing
	@Test
	void testOption2() {
		oldMachine oldMachine = new oldMachine();	
		
		//calling constructor from new machine 
		coffeeMachineAdapter machineAdapter = new coffeeMachineAdapter(new oldMachine());

		assertEquals(machineAdapter.chooseOption2(), "decaf coffee");
	}
}
