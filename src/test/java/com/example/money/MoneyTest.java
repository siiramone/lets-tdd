package com.example.money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(3);
    assertEquals(15, five.amount);
  }
}
