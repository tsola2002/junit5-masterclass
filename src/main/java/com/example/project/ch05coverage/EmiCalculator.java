package com.example.project.ch05coverage;

public class EmiCalculator {

  public long calculateEmi(double p, double rate, double time)
  {
    long emiAmt = 0;
    time = time * 12;
    rate = rate / 12 / 100;
    double temp = Math.pow( 1 + rate, time );
    emiAmt = (long) ( p * rate * (temp/ ( temp - 1 )));
    return emiAmt;
  }

}
