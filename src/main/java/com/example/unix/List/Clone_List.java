package com.example.unix.List;

import java.util.ArrayList;

import com.example.unix.List.Entity.Student;

public class Clone_List {

public static void main(String[] args) {
        
        ArrayList<Student> aListStudents = new ArrayList<Student>();
        aListStudents.add( new Student(1, "Raj") );
        aListStudents.add( new Student(2, "Jack") );
        aListStudents.add( new Student(3, "Ryan") );
        aListStudents.add( new Student(4, "Adam") );
        aListStudents.add( new Student(5, "Jessica") );
        
        /*
         * To clone an ArrayList, use the clone method.
         */
        ArrayList<Student> aListClonedList = (ArrayList<Student>) aListStudents.clone();
        
        System.out.println("Original ArrayList elements: " + aListStudents);
        System.out.println("Cloned ArrayList elements: " + aListClonedList);
        
        /*
         * Adding or removing elements from the original
         * or cloned ArrayList does not affect the other
         */
        //remove an element from the original ArrayList
        aListStudents.remove(0);
        
        System.out.println("");
        System.out.println("After removing an element from the original list");
        System.out.println("Original ArrayList elements: " + aListStudents);
        System.out.println("Cloned ArrayList elements: " + aListClonedList);
        
        //add an element to the cloned ArrayList
        aListClonedList.add( new Student(6, "Jay") );
        
        System.out.println("");
        System.out.println("After adding an element to the cloned ArrayList");
        System.out.println("Original ArrayList elements: " + aListStudents);
        System.out.println("Cloned ArrayList elements: " + aListClonedList);
        
        /*
         * However, remember that the clone method creates a shallow copy.
         * Meaning it only copies the references to the actual element objects.
         * So changing any element in the original or cloned ArrayList will
         * change the other list as well.
         */
        
        //change the actual object in the cloned ArrayList
        Student tempStudent = aListClonedList.get(1);
        tempStudent.setId(9999);
        
        System.out.println("");
        System.out.println("After changing actual object in the cloned ArrayList");
        System.out.println("Original ArrayList elements: " + aListStudents);
        System.out.println("Cloned ArrayList elements: " + aListClonedList);
    }
}