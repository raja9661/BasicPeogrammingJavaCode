import java.util.*;
class ReverseTheNumber
{
  public static void main(String args[])
  {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=scn.nextInt();
    int remainder;
    int quotient;
    while(num!=0)
    {
        remainder=num%10;
        System.out.print(remainder);
        num=num/10;
    }
  }
}