package ProblemSet;

import java.util.Scanner;

public class HighScoreTracker {
    private int[] scores = new int[10];

    public HighScoreTracker(int[] scores){
        this.scores = scores;
    }

    //prints all scores in the array
    public void printAllScores(){
        for(int x : scores){
            System.out.print(x + ", ");
        }
        System.out.println("\n");
    }

    //prints the highest score in the scores array
    public int showHighestScore(){
        int highest = scores[0];
        for(int x : scores){
            if(x > highest){
                highest = x;
            }
        }
        return highest;
    }

    //prints the average of all scores
    public int printAverage(){
        int sum = 0;
        for(int x: scores){
            sum+= x;
        }
        return sum/scores.length;
    }

    private int findMin(){
        int min = scores[0];
        for(int x: scores){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
    /* replaces the lowest score with a new score
    * @newScore -> the new score the user puts in (int)*/
    public void replaceScore(int newScore){
        int min = findMin();
        if(newScore > min){
            for (int i = 0; i < scores.length; i++){
                if(scores[i] == min){
                    scores[i] = newScore;
                }
            }
        }
    }

//states the prompt
    public static void prompt(){
        System.out.println("----------------------------------------------------");
        System.out.println("""
                Please Select An Option (1-5)\s
                 1: View all scores
                 2: View the Average \
                Score
                 3: View the Highest Score\s
                 4: Replace a Score
                 5: Quit""");
    }

    //....
    public static void main(String[] args){
        int[] playerScores = {25, 30, 54, 23, 50, 12, 29, 57, 29, 48};
        HighScoreTracker basketballScores = new HighScoreTracker(playerScores);
        Scanner input = new Scanner(System.in);
        int response = 0; //the user's response (picking 1-5)
        while(true){ //while(true) creates an infinite loop
            prompt();
            response = input.nextInt();
            if(response == 1){
                System.out.println("All Player Scores: ");
                basketballScores.printAllScores();
            } else if(response == 2){
                System.out.println("Average Score: " + basketballScores.printAverage());
            } else if(response == 3){
                System.out.println("Highest Score: " +basketballScores.showHighestScore());
            } else if(response == 4){
                System.out.println("Please enter a new score");
                int newScore = input.nextInt();
                basketballScores.replaceScore(newScore);
                //input.close();
                System.out.println("Here's the updated player scores list");
                basketballScores.printAllScores();
            } else {
                System.out.println("Goodbye!");
                break; //breaks out of the infinite loop
            }
        }
        input.close();
    }
}
