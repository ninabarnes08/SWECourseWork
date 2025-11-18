package ProblemSet;
import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager {
    private ArrayList<String> songTitles;
    public PlaylistManager(ArrayList<String> songTitles){
        this.songTitles = songTitles;
    }

    /*adds a song to the songTitles arrayList
    * @songName -> song to be added to the list*/
    public void addSong(String songName){
        songTitles.add(songName);
        viewPlaylist();

    }

    /*removes a song based on its name
    * @songName -> the song the user wants to remove*/
    public void removeSong(String songName){
        songTitles.remove(songName);
        viewPlaylist();
    }

    /*views every element in the playlist arrayList*/
    public void viewPlaylist(){
        System.out.println("*********\n" + " YOUR PLAYLIST" + "\n*********");
        for(String x : songTitles){
            System.out.println("• " + x);
        }
    }
    /*prompts the user to choose an option*/
    public static void prompt(){
        System.out.println("----------------------------------------------------");
        System.out.println("""
                Please Select An Option (1-4)\s
                 1: Add song
                 2: Remove song
                 3: View Playlist\s
                 4: Quit""");
    }


    public static void main(String[] args){
        ArrayList<String> songs = new ArrayList<>();
        PlaylistManager chillPlaylist = new PlaylistManager(songs);
        Scanner input = new Scanner(System.in);

        int response;
        while(true){ //creates an infinite loop
            prompt();
            response = input.nextInt();
            input.nextLine(); //ensures the Scanner doesn't skip over the line and actually takes time to read
            if(response == 1){
                System.out.println("Please enter a song name (and artist if desired)");
                String song = input.nextLine();
                chillPlaylist.addSong(song);
            } else if(response == 2){
                System.out.println("Please enter the title you would like to remove (EXACTLY as typed)");
                String song = input.nextLine();
                chillPlaylist.removeSong(song);
            } else if(response == 3){
                chillPlaylist.viewPlaylist();
            } else {
                System.out.println("Goodbye!");
                break; //exits out of the program
            }
        }
        input.close();
    }
}

