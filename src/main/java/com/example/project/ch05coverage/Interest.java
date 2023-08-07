package com.example.project.ch05coverage;

public class Interest {

  public long simpleInterestCal(double p, double rate, int time)
  {
    long intAmt = 0;
    intAmt = (long) (( p * rate * time) / 100 );
    return intAmt;
  }

  public long compoundInterestCal(double p, double rate, int time, int n)
  {
    long intAmt = 0;
    intAmt = (long) Math.pow(( p * ( 1 + ( rate / n ))), time);
    return intAmt;
  }



}
