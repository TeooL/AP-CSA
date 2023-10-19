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
    final String player_name = s.nextLine();
    Player one = new Player(player_name, 3);
    one.welcome_player();
    System.out.println("Here comes a slime with 21 health");
    Enemy slime = new Enemy("Slime", 21, 1);
    one.assign_enemy(slime);
    one.decide_action();
    int turns_left = 20;
    while (slime.getHp() != 0 && turns_left != 0){
      one.decide_action();
      turns_left -= 1;
      System.out.println("You have " + turns_left + " turns left.");
    }
    if (turns_left != 0){
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println("You have defeated the slime.");
      System.out.println("You have two choices of where to go next");
      System.out.println("The forest or the cave? Choose carefully");
      String next_location = s.nextLine();
      if (next_location.equals("forest")){
        System.out.println("The forest... huh , interesting, who knows what might wander in those trees");
        System.out.println("You enter the forest and after a few hours of walking you see in the distance a very large wizard tower.");
        System.out.println("You feel thrilled that you might see another human again after waking in this strange world with a deck of cards.");
        System.out.println("However, you hear a twig snap and a large wolf walks into view, staring at you with its teeth bared. GOOD LUCK!");
        Enemy wolf = new Enemy("Wolf", 101, 2);
        one.assign_enemy(wolf);
        turns_left = 15;
        while (wolf.getHp() != 0 && turns_left != 0){
          one.decide_action();
          turns_left -= 1;
          System.out.println("You have " + turns_left + " turns left.");
        }  
      }
      else if (next_location.equals("cave")){
        System.out.println("The cave, a dark and mysterious place, who knows what might lurk in those tunnels");
        System.out.println("On your way to the cave, you spot a lit lamp next to the cave entrance.");
        System.out.println("Wow, just your luck, It's time to enter.");
        System.out.println("A few minutes past as you enter the cave and after turning a corner, you see a brightly lit area by some lava showing a fist sized emerald imbedded in the wall.");
        System.out.println("As you start to walk toward emerald, you hear bones rattling and out comes a skeleton with a sword and shield!");
        System.out.println("Since when was there living skeletons in this world??? Anyways GOOD LUCK!");
        Enemy skeleton = new Enemy("Skeleton", 101, 2);
        one.assign_enemy(skeleton);
        turns_left = 15;
        while (skeleton.getHp() != 0 && turns_left != 0){
          one.decide_action();
          turns_left -= 1;
          System.out.println("You have " + turns_left + " turns left.");
        }
      }
      else{
        System.out.println("You are dead!");
        System.out.println("How did you lose to a slime? Try mathing more");
      }
    }
  }
}
