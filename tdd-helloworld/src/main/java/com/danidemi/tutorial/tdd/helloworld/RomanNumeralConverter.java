package com.danidemi.tutorial.tdd.helloworld;

public class RomanNumeralConverter {

  public int convertRoman(String roman){
    return multiplesOfSingles(roman);
  }

  public int multiplesOfSingles(String roman){
    return roman.length() * translateFirstRoman(roman);
  }

  public int translateFirstRoman(String roman){
    String firstRoman = roman.substring(0, 1);

    switch(firstRoman){
      case "I":
        return 1;
      case "X":
        return 10;
      case "C":
        return 100;
      case "M":
        return 1000;
      default:
        return 0;
    }
  }


}
