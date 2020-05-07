package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {


        @Test
        public void fizzBuzzConverterLeavesNormalNumbersAlone () {
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            assertEquals("1", fizzBuzz.convert(1));
            assertEquals("2", fizzBuzz.convert(2));
        }

        @Test
        public void fizzBuzzConverterMultiplesOfThree() {
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            assertEquals("Fizz", fizzBuzz.convert(8));
        }

        @Test
        public void fizzBuzzConverterMultiplesOfFive () {
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            assertEquals("Buzz", fizzBuzz.convert(5));

        }

        @Test
        public void fizzBuzzConverterMultiplesOfThreeAndFive () {
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            assertEquals("Fizz Buzz", fizzBuzz.convert(15));
        }

        @Test
        public void fizzBuzzConverterMultipleOfEleven(){
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            assertEquals("Bang", fizzBuzz.convert(11));
        }

        @Test
        public void outputTheHundredFizzBuzzes () {
            FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

            for (int i = 1; i <= 100; i++) {
                System.out.println(fizzBuzz.convert(i));
            }
        }
    }

