package com.danidemi.tutorial.tdd.helloworld;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralConverterTest {

  @Test
  public void shouldReturnMultiplesOfSingles(){
    String[] romans = new String[] {
      "I",
      "II",
      "III",
      "X",
      "XX",
      "XXX",
      "C",
      "CC",
      "CCC",
      "M",
      "MM",
      "MMM",
    };
    int[] results = new int[] {
      1,
      2,
      3,
      10,
      20,
      30,
      100,
      200,
      300,
      1000,
      2000,
      3000,
    };

    validateRomans(romans, results);

  }

  private void validateRomans(String[] romans, int[] results){
    for(int i = 0; i < romans.length; i++){
      String roman = romans[i];
      int result = results[i];
      validateRoman(roman, result);
    }

  }

  private void validateRoman(String roman, int givenResult){
		RomanNumeralConverter converter = new RomanNumeralConverter();
    int result = converter.convertRoman(roman);

		assertThat(result, equalTo(givenResult));
  }

}
