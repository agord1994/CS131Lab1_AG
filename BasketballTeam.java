package CS131Lab1_AG;

public class BasketballTeam extends SportsTeam{

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
		
	
	public BasketballTeam() {
		super();
		
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
		
		
	}//end BasketballTeam empty constructor
	
	public BasketballTeam(String teamName,String teamMascot, String headCoach) {
		super.teamName=teamName;
		super.teamMascot=teamMascot;
		super.headCoach=headCoach;
		this.fieldGoals=0;
		this.fieldGoalsAttempted=0;
		this.freeThrows=0;
		this.freeThrowsAttempted=0;
		
	}//end preferred constructor
	public double fieldGoalPercentage() {
		return fieldGoals/fieldGoalsAttempted;
		
	}
	
	public double freeThrowPercentage() {
		return freeThrows/freeThrowsAttempted ;
	}

	@Override
	public double[] getStats() {
		double[]array= {super.getWinPercentage(),fieldGoalPercentage(),freeThrowPercentage()};
		return array;
		
	}
	
	public void setStats(int wins,int fieldGoals, int FieldGoalsAttempted,int freethrows, int freeThrowsAttempted) {
		super.wins=wins;
		this.fieldGoals=fieldGoals;
		this.fieldGoalsAttempted=FieldGoalsAttempted;
		this.freeThrows=freethrows;
		this.freeThrowsAttempted=freeThrowsAttempted;
	}// end setStats
	
	
}//end class
