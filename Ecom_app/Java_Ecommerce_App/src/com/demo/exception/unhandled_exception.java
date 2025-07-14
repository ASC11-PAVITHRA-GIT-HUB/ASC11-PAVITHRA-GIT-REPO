package com.demo.exception;

public class unhandled_exception {

        public static void main(String args[]){
            int i =100;
            int res=0;
            System.out.println("Divided by zero");
                res = i / 0;
                System.out.println("Well this print?");
                res = i / 100;

            System.out.println("error i n this window");
            System.out.println(res);
        }
    }


