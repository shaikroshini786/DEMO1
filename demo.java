class A
{
public static void funA1()// without creating objet
{
System.out.println("FunA1 called from class A");
}
public static void funA2()
{
System.out.println("FunA2 called from class A");
}
}
class B
{
public static void main(String args[])
{
A.funA1();
A.funA2();
}
}