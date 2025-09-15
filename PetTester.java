public class PetTester{
    public static void main(String[] args){
        VirtualPet testPet = new VirtualPet("Luna");
        testPet.play();
        System.out.print(testPet);
        testPet.feed();
        System.out.print(testPet);
        testPet.passTime();
        System.out.print(testPet);
        testPet.feed();
        System.out.print(testPet);
        testPet.play();
        System.out.print(testPet);
        testPet.passTime();
    }
}