package ProblemSet;
import java.util.*;

public class MiniDatabase {
    HashMap<String, ArrayList<Integer>> studentGrades = new HashMap<>();

    /*adds the student name and a list of their grades to the HashMap
    * @name - the key of the HashMap
    * @grades - the values of the HashMap */
    public void addStudentGrades(String name, ArrayList<Integer> grades){
        studentGrades.put(name, grades);
    }

    //based on the student's name (@name), removes the key+value pair from the hashmap
    public void removeStudent(String name){
        studentGrades.remove(name);
    }

    /* searched for the student's name in the Hashmap and retrieves the list of their grades
    @name - the student's name to search for*/
    public ArrayList<Integer> searchStudent(String name){
        return studentGrades.get(name);
    }

    //views all student names + grades
    public void viewAll(){
        System.out.println(studentGrades);
    }

    //based on a user's input of grades, turns the String into an integer ArrayList
    public static ArrayList<Integer> stringToArrayList(String values){
        String[] gradesArray = values.split(",");
        ArrayList<Integer> gradesIntegerList = new ArrayList<>();
        for(String x : gradesArray){
            gradesIntegerList.add(Integer.parseInt(x.trim())); //trim is to get rid
                                                                    // of any spaces that may mess things up
        }
        return gradesIntegerList;
    }

    //prompts the user to pick an option
    public static void prompt(){
        System.out.println("----------------------------------------------------");
        System.out.println("""
                Please Select An Option (1-5)\s
                 1: Add a New Student
                 2: Search Student
                 3: Delete Student\s
                 4: View All Students
                 5: Quit""");
    }

    public static void main(String[] args){
        MiniDatabase hunStudentGrades = new MiniDatabase();
        Scanner input = new Scanner(System.in); //opens the scanner for user input
        int response;

        while(true){
            prompt();
            response = input.nextInt();
            input.nextLine(); //allows the scanner to not ignore String text input
            if(response == 1){
                System.out.println("Please enter a student name:");
                String name = input.nextLine();
                System.out.println("Please enter their number grades, using a comma (,) to separate each grade");
                String grades = input.nextLine();
                hunStudentGrades.addStudentGrades(name, stringToArrayList(grades));
            } else if(response == 2){
                System.out.println("Please enter a student's name");
                String name = input.nextLine();
                System.out.println("Grades: " +hunStudentGrades.searchStudent(name));
            } else if(response == 3){
                System.out.println("Please enter a student to remove");
                String name = input.nextLine();
                hunStudentGrades.removeStudent(name);
            } else if(response == 4){
                hunStudentGrades.viewAll();
            } else {
                System.out.println("Bye!");
                break;
            }
        }
        input.close();
    }
}
