//WRITE A JAVA PROGRAM TO FIND A NUMBER IS EVEEN OR ODD BY % OPERATOR
import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n=scob.nextInt();
if (n%2==0) 
{
System .out.println("EVEN");
}
else
{
System.out.println("ODD");
}
}
}