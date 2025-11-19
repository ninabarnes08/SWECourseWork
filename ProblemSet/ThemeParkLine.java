package SWECourseWork.ProblemSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ThemeParkLine {
    private Queue<String> line = new LinkedList<>();

    /*adds a person to the back end of the queue
    * @name - the name of the person to add*/
    public void addPerson(String name){
        line.add(name);
    }

    //removes the first person in the line (FIFO) from the queue
    public void removePerson(){
        line.remove();
    }

    //views the entirety of the queue
    public void viewQueue(){
        for(int i = 0; i < line.toArray().length; i++){
            System.out.println(i+1 +".) " + line.toArray()[i]);
        }
    }

    /*prompts the user to choose an option*/
    public static void prompt(){
        System.out.println("----------------------------------------------------");
        System.out.println("""
                Please Select An Option (1-4)\s
                 1: Add name
                 2: Remove next person
                 3: View line\s
                 4: Quit""");
    }

    public static void main(String[] args){
        ThemeParkLine sixFlagsLine = new ThemeParkLine();
        Scanner input = new Scanner(System.in);

        int response;
        while(true){ //creates an infinite loop
            prompt();
            response = input.nextInt();
            input.nextLine(); //ensures the Scanner doesn't skip over the line and actually takes time to read

            if(response == 1){
                System.out.println("Please enter name: ");
                String name = input.nextLine();
                sixFlagsLine.addPerson(name);
            } else if(response == 2){
                sixFlagsLine.removePerson();
            } else if(response == 3){
                sixFlagsLine.viewQueue();
            } else {
                System.out.println("You have left the line.");
                break;
            }
        }
}

}
