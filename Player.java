import java.util.Scanner;

public class Player{
  String name;
  int lives;
  int attack_value;
  Enemy current_enemy;


public Player(String name, int lives){
  this.name = name;
  this.lives = lives;
  }

public Player(int lives){
  this.lives = lives;
  name = "Unknown";
  }

public void assign_enemy(Enemy e){
  current_enemy = e;
  }

public void welcome_player(){ // Welcomes the player and explains how to play the game
  System.out.println("WELCOME TO MY GAME " + name);
  System.out.println();
  System.out.println("During the game, you get 7 random cards when you encounter enemies and you have to use math to defeat them by combining operations to deal damage, but BE CAREFUL as if you do more than enough damage, you will heal them.");
  System.out.println();
  System.out.println("The operations follow the order of operations, so be careful on what your intended order is");
  System.out.println("You also have 3 lives which can be lost upon not defeating an enemy in the given amount of turns");
  System.out.println("Each enemy has a set amount of turns which you will need to combine cards to defeat them");
  }

public void attack_enemy(Enemy x, int damage){
  int after_defense_dmg = damage/x.getDefense();
  int hp_after = x.getHp() - after_defense_dmg;
  x.setHp(hp_after);
  System.out.println("The " + x.getEnemy_type() + " has " + hp_after + " hp left");
  }

public void form_attack(Card x){
  if (attack_value <= 0){
    attack_value += x.getValue();
  }
  else if (x.getOperation() == "Addition"){
    attack_value += x.getValue();
  }
  else if (x.getOperation() == "Subtraction"){
    attack_value -= x.getValue();
  }
  else if (x.getOperation() == "Division"){
    attack_value /= x.getValue();
  }
  else if (x.getOperation() == "Multiply"){
    attack_value *= x.getValue();
  }
  else if (x.getOperation() == "Mod"){
    attack_value %= x.getValue();
  }
 }

public void decide_action(){
  System.out.println("What do you do?\n(1)Attack\n(2)Form Attack\n(3)Draw a card\n(4)Display Current Attack Value");
  Scanner action_input = new Scanner(System.in);
  int action = action_input.nextInt();
  if (action == 1){
    System.out.println("Attacking!");
    attack_enemy(getCurrent_enemy(), getAttack_value());
    }
  else if (action == 2){
    System.out.println("Which card do you want to use? Select cards from 1-7 based on their order");
    int card_attack = action_input.nextInt();
//    form_attack(card_attack); // Fix this next time
    System.out.println("Your new attack value is " + attack_value);
    }
  }

public Enemy getCurrent_enemy(){
  return current_enemy;
  }

public int getAttack_value(){
  return attack_value;
  }

}