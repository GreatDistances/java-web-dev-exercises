package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        /*
        Make a program similar to GradebookHashMap that does the following:

        1. It takes in student names and ID numbers (as integers) instead of names and grades.
        2. The keys should be the IDs and the values should be the names.
        3. Modify the roster printing code accordingly.
        */

        HashMap<String, Integer> myMap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.print("Student name: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty()) {
                System.out.print("Student ID: ");
                int newIDnumber = input.nextInt();
                myMap.put(newStudent, newIDnumber);

                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        for (Map.Entry<String, Integer> student : myMap.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }

}
