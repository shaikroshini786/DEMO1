//WRITE A JAVA PROGRAM TO FIND A NUMBER IS EVEEN OR ODD without % OPERATOR
import java.util.Scanner;
class Test
{
public static void checkEvenOdd(int a)
{
if ((a/2)*2==a) 
{
System.out.println("EVEN");
}
else
{
System.out.println("ODD");
}
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
Test.checkEvenOdd(a);
}

}