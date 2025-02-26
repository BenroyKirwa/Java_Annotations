package com.entityinfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating class objects
        Class class1 = new Class();
        Answer answer = new Answer();
        Subject subject = new Subject();

        // Adding the classes to a list
        List<Object> classes = new ArrayList<>(){};
        classes.add(class1);
        classes.add(answer);
        classes.add(subject);

        // Looping through all the classes
        for (Object checkClass : classes){
            // If the class is annotated
            if (checkClass.getClass().isAnnotationPresent(EntityInfo.class)){
                // Print out class name
                System.out.println("Class: " + checkClass.getClass().getSimpleName());
                // Get the fields of the class
                for (Field fields : checkClass.getClass().getDeclaredFields()){
                    EntityInfo entityInfo = fields.getAnnotation(EntityInfo.class);
                    System.out.println(fields.getName() + " - " + "Label: " + entityInfo.label() + ", EntityType: " + entityInfo.entityType() + ", DataType: " + entityInfo.dataType());
                }
                System.out.println();
            }
        }

    }
}
