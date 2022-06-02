import java.io.*;
import java.math.*;
import java.util.*;  

class GFG
{
  
  static void countSquaresNonSquares(int n)
  {
    int sc = (int)(Math.floor(Math.sqrt(n)));
    System.out.println("Number Of Square Numbers: " + sc);
    System.out.println("Number Of Non-Square Numbers: " + (n - sc))
  
  
  }
  
  public static void main(String args[])
  {
    
    new Scanner scTwo = new Scanner(System.in)
      
    int a = scTwo.nextInt()
      
    n = a
      
    countSquaresNonSquares(n)
  
  
  }


}
