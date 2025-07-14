package com.demo.exception;

public class handledException {
    public static void main(String args[]){
        int i =100;
        int res=0;
        System.out.println("Divided by zero");
//        try catch blocks are used to handle the exception
//        if except
        try {
             res = i / 0;
            System.out.println("Well this print?");
            res = i / 100;
        }
        catch(Exception exception){
            System.out.println(exception);
            System.out.println(exception.getMessage());
            System.out.println("Gracefully handled.");
        }
        System.out.println("error i n this window");
        System.out.println(res);
    }
}
