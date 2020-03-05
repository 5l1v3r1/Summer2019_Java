package day42_OOP_encapsulation;

public class TestData {
	
	/*
	 Test Data: 
	 Name 
	 ID
	 */
	private String name = "Bekir"; // the data is not visible to any other classes
	private int ID = 234;
	
// getter:
	public String getName() { // this is how we print 
		return name;
	}
	
	public int getID() {
		return ID;
	}
	
// setter:
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setID(int ID) {
		this.ID = ID;
					
	}
	
	
}
