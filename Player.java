public class Player{
  String name;
  int lives;


public Player(String name, int lives){
  this.name = name;
  this.lives = lives;
}

public Player(int lives){
  this.lives = lives;
  name = "Unknown";
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
}
  