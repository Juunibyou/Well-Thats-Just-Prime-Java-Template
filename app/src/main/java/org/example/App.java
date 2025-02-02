package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    //prompt and user input
    System.out.println("|_____Hello! Welcome to the factoring program!_____|\n");
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to factor?");
    int input = scanner.nextInt();
    scanner.close();

    //array list of prime factors
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> factors = factorizer.primeFactors(input);

    //output array list of final result
    System.out.println("The factor of " + input + " would be: " + factors);
  }
}
