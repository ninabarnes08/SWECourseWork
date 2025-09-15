import java.util.Scanner;
public class PetGame{
    static VirtualPet pet = new VirtualPet("Luna");
    static Scanner input = new Scanner(System.in);
    private static int userChoice;

    public static void updatePet(){
        if(userChoice == 1){
            pet.feed();
            System.out.println(pet);
            homeScreen();
        } else if(userChoice == 2){
            pet.play();
            System.out.println(pet);
            homeScreen();
        } else if(userChoice == 3){
            pet.passTime();
            System.out.println(pet);
            homeScreen();
        } else if(userChoice == 4) {
            System.out.println("Goodbye!");
            System.out.println(pet);
        } else {
            System.out.println("Please type a number 1-4!");
            homeScreen();
        }
    }

    public static void homeScreen(){
        System.out.println("What would you like to do?" +"\n"+"1. Feed Pet" + "\n"+
        "2. Play with pet" +"\n" + "3. Do Nothing (time passes)" +
        "\n"+"4. Quit");
        userChoice = input.nextInt();
        updatePet();
        input.close(); //closing the scanner 
    }

    public static void main(String[] args){
        homeScreen();
    }
}