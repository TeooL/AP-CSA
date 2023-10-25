import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner typein = new Scanner(System.in);
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
    Dialogue game = new Dialogue();
    System.out.println("What is your name?");
    final String player_name = s.nextLine();
    Player one = new Player(player_name, 3);
    one.welcome_player();
    game.slimeEncounter();
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
      game.defeated_Slime();
      String next_location = s.nextLine();
      if (next_location.equals("forest")){
        game.wolfEncounter();
        Enemy wolf = new Enemy("Wolf", 101, 2);
        one.assign_enemy(wolf);
        turns_left = 15;
        while (wolf.getHp() != 0 && turns_left != 0){
          one.decide_action();
          turns_left -= 1;
          System.out.println("You have " + turns_left + " turns left.");
        }
        if (turns_left != 0){
          game.defeated_Wolf();
          next_location = s.nextLine();
          if (next_location.equals("village")){
            game.dragonEncounter();
            Enemy dragon = new Enemy("Dragon", 500, 4);
            one.assign_enemy(dragon);
            turns_left = 8;
            while (dragon.getHp() != 0 && turns_left != 0){
              one.decide_action();
              turns_left -= 1;
              System.out.println("You have " + turns_left + " turns left.");
            }
          }
          else if (next_location.equals("wizard tower")){
//            game.evilwizardEncounter();
            Enemy evilwizard = new Enemy("Evil Wizard", 250, 8);
            one.assign_enemy(evilwizard);
            turns_left = 8;
            while (evilwizard.getHp() != 0 && turns_left != 0){
              one.decide_action();
              turns_left -= 1;
              System.out.println("You have " + turns_left + " turns left.");
              if (turns_left != 0){
//                game.endingtwo();
              }
              else{
                System.out.println("You have been defeated");
              }
              else{
                System.out.println("You have been defeated");
              }
            }
            else if (next_location.equals("cave")){
              game.skeletonEncounter();
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
    }
  }
}
