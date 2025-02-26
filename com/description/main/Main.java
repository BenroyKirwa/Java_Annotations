package com.description.main;

import com.description.Description;
import com.description.employees.Employee;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{

        // Creating employee object
        Employee employee = new Employee();
        // Looping through each field
        for (Field field : employee.getClass().getDeclaredFields()){
            // Get if its annotated
            if (field.isAnnotationPresent(Description.class)){
                Description description = field.getAnnotation(Description.class);
                // field.setAccessible(true);
                // Printing out field value
                System.out.println(field.getName() + " : " + description.info());
            }
        }
    }
}