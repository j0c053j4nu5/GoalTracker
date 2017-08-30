import java.util.*;

public class GoalTrackerApp{

	ArrayList <Goal> goalList = new ArrayList<Goal>();



	public static void main(String[] args){

		ArrayList<Goal> goalList = new ArrayList<Goal>();
		Boolean continueInput = true;
		String newName;
		double newTodayDouble;
		String newToday;
		double newFinalDouble;
		String newFinal;
		String newFinalDate;
		int newFinalDateInt;
		//Start the game
		while(continueInput){

			GameHelper helper = new GameHelper();

			String userInput = helper.getUserInput("What would you like to do? 1)Enter Goal 2) Get Goal Progress 3)Exit");
			int userInputInt = Integer.parseInt(userInput);

			if(userInputInt==1){
				Goal newGoal = new Goal();
				newName = helper.getUserInput("What would you like to call your goal?");
				newToday = helper.getUserInput("How far are you now?");
				newTodayDouble = Integer.parseInt(newToday);
				newFinal = helper.getUserInput("How long is your goal?");
				newFinalDouble = Integer.parseInt(newFinal);
				newFinalDate = helper.getUserInput("How many months will this take?");
				newFinalDateInt = Integer.parseInt(newFinal);
				newGoal.setGoalName(newName);
				newGoal.setCurrentPosition(newTodayDouble);
				newGoal.setFinalPosition(newFinalDouble);
				newGoal.setProgress();
				newGoal.setCreationDate();
				newGoal.setFinishDate(newFinalDateInt);
				goalList.add(newGoal);
			
			}
			else if(userInputInt == 2){
				for(Goal i : goalList){
					String goalName = i.getGoalName();
					double goalProgress = i.getProgress();
					Date startDate = i.getCreationDate();
					String startDateString = String.format(" Created: %tc", startDate);
					Date finishDate = i.getFinishDate();
					String finishDateString = String.format(" Target Finish: %tc", finishDate);
					System.out.println("Goal Name: " + goalName + startDateString + " Progress:" + goalProgress + finishDateString);
				}
			}
			else if(userInputInt==3){ 
				System.out.println("Goodbye");
				continueInput = false; 
			}
			else{
				System.out.println("Incorrect User Input.  Please Enter Again");
			}
		}
	}
}