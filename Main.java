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
        increase_num += 3.14;
        System.out.println("Would you like to double this number?");
        typein = new Scanner(System.in);
        String yes_no = typein.nextLine();
        if(yes_no.equals("yes")){
            System.out.println((double) increase_num * 2);
        }
        else{
            System.out.println("Ok I'll half it then");
            System.out.println((double) increase_num / 2);
        }
       
        
        
// Start of Project
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String player_name = s.nextLine();
        Player one = new Player(player_name, 3);
        one.welcome_player();
        System.out.println("Here comes a slime with 21 health");
        Enemy slime = new Enemy("Slime", 21, 1, 7);
        one.decide_action();
        while (slime.getHp() != 0){
          one.decide_action();
          }
        }
    }
