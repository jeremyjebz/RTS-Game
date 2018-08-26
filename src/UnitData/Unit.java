package UnitData;

public class Unit {
	
	// ---------------------------
	// --- Class Variables
	// ---------------------------
	
	private String unitName;
	private boolean unitPC;
	
	// ---------------------------
	// --- Constructors
	// ---------------------------
	
	public Unit() {
		
	}

	public Unit(String name, Boolean PC) {
		unitName = name;
		unitPC = PC;
	}
	
	// ---------------------------
	// --- Methods
	// ---------------------------
	
	// --- unitPC
	public boolean getPC() {
		return unitPC;
	}
	
	public void setPC(Boolean PC) {
		unitPC = PC;
	}
	
	// --- unitName
	
	public String getName() {
		return unitName;
	}
	
	public void setName(String name) {
		unitName = name;
	}

}
