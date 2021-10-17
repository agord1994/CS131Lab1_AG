package CS131Lab1_AG;

public abstract class SportsTeam {

protected String teamName;
protected String teamMascot;
protected String headCoach;
protected int wins;
protected int losses;


////setters

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}

public String getTeamMascot() {
	return teamMascot;
}

public void setTeamMascot(String teamMascot) {
	this.teamMascot = teamMascot;
}

public String getHeadCoach() {
	return headCoach;
}

public void setHeadCoach(String headCoach) {
	this.headCoach = headCoach;
}

public int getWins() {
	return wins;
}

public void setWins(int wins) {
	this.wins = wins;
}

public int getLosses() {
	return losses;
}

public void setLosses(int losses) {
	this.losses = losses;
}



public SportsTeam() {
	this.headCoach="";
	this.teamMascot="";
	this.teamName="";
	this.wins=0;
	this.losses=0;
	
	
}//end empty argument constructor

public SportsTeam(String teamName,String teamMascot, String headCoach) {
	this.headCoach=headCoach;
	this.teamMascot=teamMascot;
	this.teamName=teamName;
	this.wins=0;
	this.losses=0;
	
	
}//end preferred constructor

public double getWinPercentage() {
	return wins/(wins+losses);
	
}//end getWin Percentage

public abstract double [] getStats();//endgetSt
		
		
	

}
