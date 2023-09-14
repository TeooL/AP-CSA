import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner typein = new Scanner(System.in);
    System.out.println("Hello World");
    System.out.println("I am a beginner");
    
    final int i = 4;
    System.out.println(i);
    double n = 1.23;
    System.out.println(n);
    boolean t = true;
    System.out.println(t);
    int num = 4;
    System.out.println(num + 10);
    int compound_expression_one = 5 + 6 / 3 * 4;
    double compound_expression_two = 10 - 9.6 / 3 * 2 ;
    System.out.println(compound_expression_one);
    
    try
    {
      System.out.println(4/0);
    }
    catch (ArithmeticException e)
    {
      System.out.println(e);
    }
    
    System.out.println(compound_expression_two);
    System.out.println("Don't Mind This Line");
    System.out.println("Time to add the scanner");
    System.out.println("Ok Let's Test it out, Type your name");
    
    String name = typein.nextLine();
    System.out.println(name);
    
    System.out.println("Ok time for some compound assignment operators");
    int increase_num = 1;
    increase_num++;
    System.out.println(increase_num);
    System.out.println("Oh, it worked!");
    increase_num += 4;
    System.out.println("Time to add 4, did it work?");
    System.out.println(increase_num);
    increase_num--;
    System.out.println(increase_num);
    System.out.println("Oh no what happened to the number?");
    
  }
}