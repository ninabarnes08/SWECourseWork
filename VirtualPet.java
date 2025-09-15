public class VirtualPet{
    //instantiating variables 
    private String name;
    private int hunger;
    private int happiness;

    //arg constructor 
     public VirtualPet(String name){
        this.name = name; //this.name refers to the instance variable 
        hunger = 5;
        happiness = 5;
    }

        //functions 
    public void feed(){
        if(hunger >=2){
            hunger-=2;
        } else {
            System.out.println("your pet is full!" + "\n" + "\n");
            System.out.println("-------------------------------");
        }
    }

    public void play(){
        if(happiness <= 10){
            happiness+=2;
            hunger+=1;
        } else {
            System.out.println("Your pet is overstimulated!" + "\n" + "\n");
            System.out.println("-------------------------------");
        }
    }

    public void passTime(){
        if (hunger <= 10 && hunger >= 0){
            hunger += 1;
        }
        if (happiness <= 10 && happiness >= 0){
            happiness -= 1;
        }
    }

    public String toString(){
        if(hunger >= 10 || happiness == 0){
            return "you have failed your pet </3 Try again another time!" + "\n" + 
            "-------------------------------";
        } else {
            return "Pet Name: " + name + "\n" + "Hunger: " + hunger + "\n" +
            "Happiness: " + happiness +"\n" + "-------------------------------";
        }
    }

    public static void main(String[] args){
        VirtualPet myPet = new VirtualPet("Vanessa");
        System.out.println(myPet);
    }
}