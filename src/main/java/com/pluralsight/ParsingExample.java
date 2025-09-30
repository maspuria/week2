package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingExample {
    public static void main(String[] args) {
        // Parse String to Int Example
        String numberAsString = "45";
        int number = Integer.parseInt(numberAsString)+ 1;
        int result = number + 1;
        System.out.println(result);

        //Parse string to date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String userInput = "10/17/2022";

        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay.getDayOfWeek());

    }
}
