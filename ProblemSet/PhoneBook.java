package SWECourseWork.ProblemSet;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<>(); //name is the key, phoneNumber is the value

    /*adds a name and phone number to the phoneBook hashmap
    * @name - key
    * @phoneNumber - value*/
    public void addContact(String name, String phoneNumber){
        phoneBook.put(name, phoneNumber);
    }

    /* searched for the student's name in the Hashmap and retrieves the String representing their number
    @name - the person's name to search for*/
    public String searchContact(String name){
        return phoneBook.getOrDefault(name, "Number not found");
    }

    //based on the person's name (@name), removes the key+value pair from the hashmap
    public void deleteContact(String name){
        phoneBook.remove(name);
    }

    //views all names + numbers
    public void viewAll(){
        System.out.println(phoneBook);
    }

    //prompts the user to pick an option
    public static void prompt(){
        System.out.println("----------------------------------------------------");
        System.out.println("""
                Please Select An Option (1-5)\s
                 1: Add a New Contact
                 2: Search Contact
                 3: Delete Contact\s
                 4: View All Contacts
                 5: Quit""");
    }

    public static void main(String[] args){
        PhoneBook yourPhoneBook = new PhoneBook();
        Scanner input = new Scanner(System.in); //opens the scanner for user input
        int response;

        while(true){
            prompt();
            response = input.nextInt();
            input.nextLine(); //allows the scanner to not ignore String text input
            if(response == 1){
                System.out.println("Please enter a name: ");
                String name = input.nextLine();
                System.out.println("Please enter their phone number: ");
                String number = input.nextLine();
                yourPhoneBook.addContact(name, number);
            } else if(response == 2){
                System.out.println("Please enter a name to search: ");
                String name = input.nextLine();
                System.out.println(name + "'s Number: " + yourPhoneBook.searchContact(name));
            } else if(response == 3){
                System.out.println("Please enter a name to remove: ");
                String name = input.nextLine();
                yourPhoneBook.deleteContact(name);
            } else if(response == 4){
                yourPhoneBook.viewAll();
            } else {
                System.out.println("You have closed the phonebook.");
                break;
            }
        }
        input.close();
    }
}
