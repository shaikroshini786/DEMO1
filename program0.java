class B
{
public static void main()//no arguments
{
System.out.println("main metod is called withouut argument.");
}
public static void main(int x)//with integer
{
System.out.println("main metod is called withouut argument."+x*2);
}
public static void main(String s)//string without arrays
{
System.out.println("welcome"+s);
}
public static void main(String args[])//string with arrays
{
System.out.println("sudha is typing");
main();
main("roshini");
main(20);
}
}


