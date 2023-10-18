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
    System.out.println("It's called Cards Attack");
    System.out.println();
    System.out.println("During the game, you get 7 random cards when you encounter enemies and you have to use math to defeat them by using the value and operations to deal damage, but BE CAREFUL as if you do more than enough damage, you will heal them.");
    System.out.println("The cards do not go away when you use them, so you can use the same value and operations a lot of times, however you can also replace them."); 
    System.out.println();
    System.out.println("You also have 3 lives which can be lost upon not defeating an enemy in the given amount of turns");
    System.out.println("Each enemy has a set amount of turns which you will need to combine cards to defeat them");
  }
  
  public void attack_enemy(Enemy x, int damage){ //Function for Action 1
    int after_defense_dmg = damage/x.getDefense();
    int hp_after = x.getHp() - after_defense_dmg;
    x.setHp(hp_after);
    System.out.println("The " + x.getEnemy_type() + " has " + hp_after + " hp left");
    attack_value = 0;
  }
  
  public void form_attack(Card x){ //Function for Action 2
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
    System.out.println("What do you do?\n(1)Attack\n(2)Form Attack\n(3)Replace a card");
    Scanner action_input = new Scanner(System.in);
    int action = action_input.nextInt();
    if (action == 1){
      System.out.println("Attacking!");
      try
      {
      attack_enemy(getCurrent_enemy(), getAttack_value());
      }
      catch (NullPointerException e)
      {
        System.out.println("Why would you attack when your value is 0? What a waste of a turn.");
    }
    }
    else if (action == 2){
      System.out.println("Which card do you want to use? Select cards from 1-7 based on their order");
      int card_attack = action_input.nextInt();
      try 
      {
        form_attack(deck.getCard(card_attack)); 
        System.out.println("Your new attack value is " + attack_value);
      }
      catch (NullPointerException e)
      {
        System.out.println("Invalid Card Number");
      }
    }
    else if (action == 3){
      System.out.println("Which card do you want to replace?");
      int replace_card_num = action_input.nextInt();
      if (replace_card_num == 1){
        c1.newCard();
      }
      else if (replace_card_num == 2){
        c2.newCard();
      }
      else if (replace_card_num == 3){
        c3.newCard();
      }
      else if (replace_card_num == 4){
        c4.newCard();
      }
      else if (replace_card_num == 5){
        c5.newCard();
      }
      else if (replace_card_num == 6){
        c6.newCard();
      }
      else if (replace_card_num == 7){
        c7.newCard();
      }
    }
    System.out.println("Your current attack value is " + getAttack_value());
    
    System.out.println("First Card is value " + (deck.getCard1()).getValue() + " with operation " + (deck.getCard1()).getOperation());
    System.out.println("Second Card is value " + (deck.getCard2()).getValue() + " with operation " + (deck.getCard2()).getOperation());
    System.out.println("Third Card is value " + (deck.getCard3()).getValue() + " with operation " + (deck.getCard3()).getOperation());
    System.out.println("Fourth Card is value " + (deck.getCard4()).getValue() + " with operation " + (deck.getCard4()).getOperation());
    System.out.println("Fifth Card is value " + (deck.getCard5()).getValue() + " with operation " + (deck.getCard5()).getOperation());
    System.out.println("Sixth Card is value " + (deck.getCard6()).getValue() + " with operation " + (deck.getCard6()).getOperation());
    System.out.println("Seventh Card is value " + (deck.getCard7()).getValue() + " with operation " + (deck.getCard7()).getOperation());
  }


public Enemy getCurrent_enemy(){
  return current_enemy;
}

public int getAttack_value(){
  return attack_value;
}
Card c1 = new Card();
Card c2 = new Card();
Card c3 = new Card();
Card c4 = new Card();
Card c5 = new Card();
Card c6 = new Card();
Card c7 = new Card();
Deck deck = new Deck(c1,c2,c3,c4,c5,c6,c7); // Player's Deck
}
