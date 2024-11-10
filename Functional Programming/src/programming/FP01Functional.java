package programming;

import java.sql.SQLOutput;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List <Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        //printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        //printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printSquaresOfEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void print(int number) {
        System.out.println(number);
    }
    //[12,3,4,6,12,4,5,7,8,9,10]
    //12
    //4
    //6

    private static boolean isEven(int number) {
        return number%2==0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP01Functional::print); // Method Reference


    }

    //number -> number%2==0
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()

                //.filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
                .filter(number -> number%2==0) //Lambda Expression

                .forEach(FP01Functional::print); // Method Reference


    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do
        numbers.stream()

                //.filter(FP01Functional::isEven) //Filter - Only Allow Even Numbers
                .filter(number -> number%2==0) //Lambda Expression
                .map(number -> number * number) //Mapping - Convert number to number * number
                .forEach(System.out::println); // Method Reference


    }



}
