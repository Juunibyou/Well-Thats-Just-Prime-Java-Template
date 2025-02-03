package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<>());
  }

  @Test
  void itReturnsAnEmptyListForOne(){
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(1), new ArrayList<>());
  }

  @Test
  void itReturnsAListFor10(){
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> factors = new ArrayList<>();
    factors.add(2);
    factors.add(5);
    assertEquals(factorizer.primeFactors(10), factors);
  }

  @Test
  void itReturnsAListFor25(){
    ArrayList<Integer> factors = new ArrayList<>();
    Factorizer factorizer = new Factorizer();
    factors.add(5);
    factors.add(5);
    assertEquals(factorizer.primeFactors(25), factors);
  }

  @Test
  void itReturnsAListFor100(){
    ArrayList<Integer> factors = new ArrayList<>();
    Factorizer factorizer = new Factorizer();
    factors.add(2);
    factors.add(2);
    factors.add(5);
    factors.add(5);
    assertEquals(factorizer.primeFactors(100), factors);
  }
}
