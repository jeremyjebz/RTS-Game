package Test;

import UnitData.Unit;

public class TestClass {

	public static void main(String[] args) {
		Unit unitA = new Unit("Unit A", true);
		
		Unit unitB = new Unit();
		unitB.setName("Unit B");
		unitB.setPC(false);
		
		System.out.println("Unit A:\n" + " Name: " + unitA.getName() + "\n" + " PC: " + unitA.getPC());
		System.out.println("Unit B:\n" + " Name: " + unitB.getName() + "\n" + " PC: " + unitB.getPC());
	}

}
