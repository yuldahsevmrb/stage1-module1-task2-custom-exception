package com.epam.mjc;

public class StudentNotFound extends IllegalArgumentException{
    public StudentNotFound(String msg){
        super(msg);
    }
}
