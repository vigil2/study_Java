package org.opentutorials.javatutorials.logindemo;

public class loginDemo_and_or {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("good");
        } else {
            System.out.println("wrong");
        }
        if ((id.equals("egoing") || id.equals("egoing2")) && password.equals("111111")) {
            System.out.println("good");
        } else {
            System.out.println("wrong");
        }

    }
    	
}
