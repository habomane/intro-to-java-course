package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        List<String> otherItems = new ArrayList<>();
        for (Integer number : numbers)
        {
            if(number % 3 == 0 && number % 5 == 0) {
                otherItems.add("FizzBuzz");
            }
            else if(number % 3 == 0) { otherItems.add("Fizz");}
            else if(number % 5 == 0) { otherItems.add("Buzz");}
            else { otherItems.add(String.valueOf(number));}
        }

        return otherItems;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        switch(number)
        {
            case 1:
            return "January";
            case 2:
            return "February";
            case 3:
            return "March";
            case 4:
            return "April";
            case 5:
            return "May";
            case 6:
            return "June";
            case 7:
            return "July";
            case 8:
            return "August";
            case 9:
            return "September";
            case 10:
            return "October";
            case 11:
            return "November";
            case 12:
            return "December";
            default:
            return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for(int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0) 
            {
                evens.add(i);
                continue;
            }

            odds.add(i);
        }

        Map<String, Integer> sums = new HashMap<>();

        sums.put("SumOfEvens", evens.stream().mapToInt(Integer::valueOf).sum());
        sums.put("SumOfOdds", odds.stream().mapToInt(Integer::valueOf).sum());
        return sums;

    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        List<Integer> reverseNumbers = new ArrayList<>();

        for(int i = numbers.size() - 1; i  >= 0 ; i--)
        {
            reverseNumbers.add(numbers.get(i));
        }

        return reverseNumbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
