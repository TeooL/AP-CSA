import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner typein = new Scanner(System.in);
        //1.2
        System.out.println("Hello World");
        System.out.println("I am a beginner");
        System.out.println("Lets start with a int, a double, and a boolean");
        System.out.println("Oh and some compound expressions");

        //1.3
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
        typein.close();
        System.out.println(name);
        //1.4
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
        //1.5
        System.out.println("Ok lets add pi to it");
        System.out.println((double)increase_num + 3.14);
        System.out.println("Would you like to double this number?");
        typein = new Scanner(System.in);
        String yes_no = typein.nextLine();
        if(yes_no == "yes")
        {
            System.out.println((double) increase_num * 2);
        }
        else
        {
            System.out.println("Ok I'll half it then");
            System.out.println((double) increase_num / 2);
        Pair x = new Pair(1,7);
        x.display();
        x.roll();
        seashell s = new seashell("red", "small");

        
        
        
        
// Start of Project
        
        System.out.println("Welcome to my project, It's gonna be a math operations card game");
        System.out.println();
        System.out.println("During the game, you get 7 random cards when you encounter enemies and you have to use math to defeat them by combining operations to deal damage, but BE CAREFUL as if you do more than enough damage, you will heal them.");
        System.out.println();
        System.out.println("Here comes a slime with 7 health, You are given the cards +18, /2, +4, -3, x3, -7, %2. Defeat Them.");
        Card t1 = new Card(18, "Addition");
        Card t2 = new Card(2, "Division");
        
        
        }
    }
}
