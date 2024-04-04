package com.learning_navigator.Learning.Navigator.Exceptionhandler;

public class SubjectNotFoundException extends RuntimeException{
    public SubjectNotFoundException(String message){
        super(message);
    }
}
