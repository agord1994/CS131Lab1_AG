package CS131Lab1_AG;
import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	
	
	public boolean isActive() {
		return active;
	}//end isActive
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligenceType

	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}//end empty argument constructor
	
	public NonPlayerCharacter(String id,String personality,boolean active,String intelligenceType) {
		super(id,personality);
		
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
		
	}//end preferred argument constructor
	

	public String reportStructure() {
		StringBuilder sr = new StringBuilder();
		//Append in Java is a StringBuilder and StringBuffer class method used to append a value to the current sequence. String concatenation in Java is done using the StringBuilder or StringBuffer class and append() method.
		sr.append(super.reportStructure()).append("\n==================================\n").append("Active: ").append(active).append("\n").append("Intelligence: ").append(intelligenceType);
	       sr.append("\n==================================");
	      return sr.toString();
		
	}//end reportStructure
	
	
	public String introduce() {
		 return "Hello, my name is "+super.uniqueID;

	}//end introduce
	public String exclaim() {
		String[] exArray={"Dag Gummit","Doggone it","Holy cow","Jeez","Well cheese and crackers"};
		SecureRandom r= new SecureRandom();
		int rand=r.nextInt(4);
		return exArray[rand];
		
	}//end exclaim
	
	
}//end class
