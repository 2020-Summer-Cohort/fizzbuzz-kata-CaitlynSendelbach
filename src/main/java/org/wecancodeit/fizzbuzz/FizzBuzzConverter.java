package org.wecancodeit.fizzbuzz;

public class FizzBuzzConverter {
    public String convert(int toConvertToFizzBuzz) {
        if (toConvertToFizzBuzz % 15 == 0) {
            return "Fizz Buzz";
        }
        if (toConvertToFizzBuzz % 8 == 0) {
            return "Fizz";
        }
        if (toConvertToFizzBuzz % 5 == 0) {
            return "Buzz";
        }
        if (toConvertToFizzBuzz % 11 == 0) {
            return "Bang";
        }
        return String.valueOf(toConvertToFizzBuzz);
    }
}

