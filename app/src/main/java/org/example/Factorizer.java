package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(int n) {
    ArrayList<Integer> factors = new ArrayList<Integer>();

    //adding factors into array as long as they a divisable by 2
    while(n%2 == 0){
      factors.add(2);
      n = n/2;
    }
    
    //checking if it's factorable with other numbers
    for(int i = 3; i < n; i++){
      while(n%i == 0){
        factors.add(i);
        n = n/i;
      }
    }

    //adding any remaining numbers not divisable
    if(n > 2){
      factors.add(n);
    }

    return factors;
  }
}
