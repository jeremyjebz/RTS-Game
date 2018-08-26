package Test;

import java.util.ArrayList;
import UnitData.Unit;

public class TestClass {

	public static void main(String[] args) {
		
		ArrayList<Unit> testList = new ArrayList<Unit>();
		
		Unit unitA = new Unit("Unit A", true);
		testList.add(unitA);
		
		Unit unitB = new Unit();
		unitB.setName("Unit B");
		unitB.setPC(false);
		testList.add(unitB);
		
		for(Unit testUnit : testList) {
			System.out.println(testUnit.hashCode() + "\n" + " Name: " + testUnit.getName() + "\n PC: " + testUnit.getPC());
		}
		
	}

}
