package SWECourseWork;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args){
        LinkedList<String> toDoList = new LinkedList<>();
        toDoList.addLast("Lay out plan for Euro Project");
        toDoList.addLast("Finish the Greece Trip Form");
        toDoList.addFirst("Finish Terminal Velocity Lab");
        toDoList.addFirst("Read Heart of Darkness assigned pages");
        toDoList.addFirst("Finish the problem set for Multi");
        toDoList.add(3,"homework");
        toDoList.remove(2);
        toDoList.remove("homework");
        toDoList.removeLast();

        System.out.println(toDoList);

    }
}
