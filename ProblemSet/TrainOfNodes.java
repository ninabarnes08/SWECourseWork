package SWECourseWork.ProblemSet;
public class TrainOfNodes {

    //helper class = TrainCar
    static class TrainCar{
        private String name;
        private TrainCar next;
        //TrainCar constructor
        public TrainCar(String name){
            this.name = name;
        }
        //TrainCar methods
        public void setNext(TrainCar next){
            this.next = next;
        }
        public TrainCar getNext(){
            return next;
        }
        public String getName(){
            return name;
        }
    }
    /*traverses the nodes system to print what's at the front of the note (before the pointer)
    * @front = the TrainCar at the front of the "line"*/
    public static void traverseNodes(TrainCar front){
        TrainCar current = front;
        while(current != null){
            System.out.println(current.getName());
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args){
        TrainCar blueTrain = new TrainCar("blueTrain");
        TrainCar redTrain = new TrainCar("redTrain");
        TrainCar greenTrain = new TrainCar("greenTrain");
        TrainCar purpleTrain = new TrainCar("purpleTrain");
        TrainCar violetTrain = new TrainCar("violetTrain");

        //creating the node line
        blueTrain.setNext(redTrain); //blueTrain points to redTrain
        redTrain.setNext(greenTrain); //redTrain points to greenTrain
        greenTrain.setNext(purpleTrain); //greenTrain points to purpleTrain
        purpleTrain.setNext(violetTrain); //purpleTrain points to violetTrain

        traverseNodes(blueTrain);

    }


}
