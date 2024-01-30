package org.example.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        do{
            System.out.println("Enter student name");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.println("Enter student id");
                Integer id = input.nextInt();
                students.put(newStudent,id);
                input.nextLine();
            }
        }while(!newStudent.equals(""));
        for(Map.Entry<String,Integer> s: students.entrySet()){
            System.out.println("Student name is: "+ s.getKey() + " and id is: " + s.getValue());
        }

    }
}
