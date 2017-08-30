import java.util.*;

public class Goal{

	private String goalName;
	private double currentPosition;
	private double finalPosition;
	private double goalProgress;
	private Date creationDate;
	private Date finishDate;

	//Getters
	public Date getCreationDate(){
		return creationDate;
	}

	public String getGoalName() {
		return goalName;
	}

	public double getCurrentPosition() {
		return currentPosition;
	}

	public double getFinalPosition() {
		return finalPosition;
	}

	public double getProgress() {
		return goalProgress;
	}

	public Date getFinishDate(){
		return finishDate;
	}

	//Setters
	public void setGoalName(String name) {
		goalName = name;
	}

	public void setCurrentPosition(double update) {
		currentPosition = update;
	}

	public void setFinalPosition(double endPoint) {
		finalPosition = endPoint;
	}

	public void setProgress() {
		goalProgress = currentPosition/finalPosition;
	}

	public void setCreationDate(){
		creationDate = new Date();
	}

	public void setFinishDate(int monthAddition){
		Calendar myCal = Calendar.getInstance();
		myCal.setTime(creationDate);
		myCal.add(Calendar.MONTH, monthAddition);
		finishDate = myCal.getTime();
	}

}