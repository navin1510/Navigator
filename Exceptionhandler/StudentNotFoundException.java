package com.learning_navigator.Learning.Navigator.Exceptionhandler;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message){
        super(message);
    }
}
