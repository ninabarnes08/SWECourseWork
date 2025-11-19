package SWECourseWork.ProblemSet;

import java.util.Scanner;
import java.util.Stack;

public class UndoRedoSimulator {
    Stack<String> undo = new Stack<>();
    Stack<String> redo = new Stack<>();

    /* adds a word to the undo list, clears the redo list
    * @words -- the sentence(s) the user types*/
    public void typeWord(String words){
        undo.push(words);
        while(!redo.empty()){
            redo.pop();
        }
        System.out.println("Current Text: " + undo.peek());
    }

    //removes the last action from the undo stack and adds it to redo
    public void undoAction(){
        String removed = undo.pop();
        redo.push(removed);
        System.out.println("Current Text: " + undo.peek());
    }

    //removes the latest action from the redo stack to add to the undo stack
    public void redoAction(){
        String redone = redo.pop();
        undo.push(redone);
        System.out.println("Current Text: " + undo.peek());
    }

    //prompts the user to choose an option
    public static void prompt(){
        System.out.println("----------------------------------------------------");
        System.out.println("""
                Please Select An Option (1-4)\s
                 1: Type something
                 2: Undo
                 3: Redo\s
                 4: Quit""");
    }

    public static void main(String[] args){
        UndoRedoSimulator wordBoard = new UndoRedoSimulator();
        Scanner input = new Scanner(System.in);
        int response; //an integer representing the user's response to 1-4 prompt
        while(true){
            prompt();
            response = input.nextInt();
            input.nextLine(); //allows the scanner to not ignore String text input
            if(response == 1){
                System.out.println("Type Here: ");
                String text = input.nextLine();
                wordBoard.typeWord(text);
            } else if(response == 2){
                wordBoard.undoAction();
            } else if(response == 3){
                wordBoard.redoAction();
            } else {
                System.out.println("Bye!");
                break;
            }
        }

    }
}
