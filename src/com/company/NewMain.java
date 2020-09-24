package com.company;

public class NewMain {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String outputString = "";
            if (i % 5 == 0) outputString = "Buzz";
            if (i % 3 == 0) outputString = "Fizz" + outputString.toLowerCase();
            if (i == 42) outputString = "Liftarens guide...";
            if (outputString.equals("")) outputString = String.valueOf(i);
            System.out.println(outputString);
        }
    }
}
