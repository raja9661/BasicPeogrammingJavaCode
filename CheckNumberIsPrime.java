import java.util.*;
class CheckNumberIsPrime
{
  public static void main(String args[])
  {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the number:");
    int num=scn.nextInt();
    boolean b=false;
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        {
            b=true;
            break;
        }
    }
    if(b==false)
    {
        System.out.println("number is prime:");
    }
    else
    {
        System.out.println("number is not prime:");
    }
  }
}