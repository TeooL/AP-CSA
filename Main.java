import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
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
      displayDefense(slime);
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
          displayDefense(wolf);
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
              displayDefense(dragon);
              one.decide_action();
              turns_left -= 1;
              System.out.println("You have " + turns_left + " turns left.");
            }
            if (turns_left != 0){
              game.endingOne();
            }
            else{
              System.out.println("You have been defeated");
            }
          }
          else if (next_location.equals("wizard tower")){
            game.evilwizardEncounter();
            Enemy evilwizard = new Enemy("Evil Wizard", 250, 8);
            one.assign_enemy(evilwizard);
            turns_left = 8;
            while (evilwizard.getHp() != 0 && turns_left != 0){
              displayDefense(evilwizard);
              one.decide_action();
              turns_left -= 1;
              System.out.println("You have " + turns_left + " turns left.");
            }
            if (turns_left != 0){
              game.endingTwo();
            }
            else{
              System.out.println("You have been defeated");
            }
          }
          else{
            System.out.println("You have been defeated");
          }
        }
      }
      else if (next_location.equals("cave")){
        game.skeletonEncounter();
        Enemy skeleton = new Enemy("Skeleton", 101, 2);
        one.assign_enemy(skeleton);
        turns_left = 15;
        while (skeleton.getHp() != 0 && turns_left != 0){
          displayDefense(skeleton);
          one.decide_action();
          turns_left -= 1;
          System.out.println("You have " + turns_left + " turns left.");
        }
        if (turns_left != 0){
          game.defeated_Skeleton();
          next_location = s.nextLine();
          if (next_location.equals("outside")){
            game.banditEncounter();
            Enemy bandit = new Enemy("Bandit", 100, 5);
            one.assign_enemy(bandit);
            turns_left = 8;
            while (bandit.getHp() != 0 && turns_left != 0){
              displayDefense(bandit);
              one.decide_action();
              turns_left -= 1;
              System.out.println("You have " + turns_left + " turns left.");
            }
            if (turns_left != 0)game.endingThree();
          }
          else if (next_location.equals("dungeon")){
            game.wardenEncounter();
            Enemy warden = new Enemy("Warden", 400, 10);
            one.assign_enemy(warden);
            turns_left = 8;
            while (warden.getHp() != 0 && turns_left != 0){
              displayDefense(warden);
              one.decide_action();
              turns_left -= 1;
              System.out.println("You have " + turns_left + " turns left.");
            }
            if (turns_left != 0)game.endingFour();
            else System.out.println("You have been defeated");
          }
        }
        else System.out.println("You have been defeated");
      }
      else System.out.println("You have been defeated");
    }
  }
  public static void displayDefense(Enemy e){
    System.out.println("The enemy has " + e.getDefense() + " armor.");
  }
}


