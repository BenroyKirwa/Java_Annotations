package com.importantmethod;

import java.lang.reflect.Method;

public class PaymentProcessor {

    @ImportantMethod
    public void addPayments(){
        System.out.println("Here is where we add payments");
    }

    @ImportantMethod
    public void deletePayments(){
        System.out.println("Here is where we delete payments");
    }

    @ImportantMethod
    private void updatePayments(){
        System.out.println("We'll update your payments soon!!");
    }

    public void pay(){
        System.out.println("Payment made.");
    }

    public void withdraw(){
        System.out.println("Money withdrawn successfully");
    }

    public static void main(String[] args) throws Exception{

        // Creating processor object
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        for (Method method : paymentProcessor.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(ImportantMethod.class)){
                method.setAccessible(true);
                method.invoke(paymentProcessor);
            }
        }
    }
}
