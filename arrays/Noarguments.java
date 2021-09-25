package com.java.java;

public class Noarguments {

        public static void main(String[] args) {

            System.out.println("The number of arguments are:"+args.length);
            System.out.println("The arguments are:");
            for(int i=0;i<args.length;i++)
                System.out.println((i+1)+ ":"+args[i]);
        }
    }
