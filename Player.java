import java.util.Scanner;

public class Player{
    String name;
    int attack_value;
    Enemy current_enemy;


    public Player(String name){
        this.name = name;
    }

    public Player(){
        name = "Unknown";
    }

    public void assign_enemy(Enemy e){
        current_enemy = e;
    }

    public void welcome_player(){ // Welcomes the player and explains how to play the game
        System.out.println("Welcome to my game, " + name);
        System.out.println("It's called Cards Attack");
        System.out.println("It's a text based RPG game with cards.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------How to Play-----------------------------------------------------------------------------------------------");
        System.out.println("During the game, you get 7 random cards when you encounter enemies.");
        System.out.println("If you do more than enough damage, you will heal them. Also when your attack value is at 0, you will always add the value of the card you select regardless of its operation.");
        System.out.println("The cards do not go away when you use them, so you can use the same value and operations a lot of times, however you can also replace them.");
        System.out.println("Each enemy has a set amount of turns which you will need to combine cards to defeat them\nEach Enemy also has an armor class that will lower the damage that you deal in the form of damage/armor.");
        System.out.println("You can't get your attack value in the negatives and the max attack is just " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void attack_enemy(Enemy x, int damage){ //Function for Action 1
        int after_defense_dmg = damage/x.getDefense();
        int hp_after = x.getHp() - after_defense_dmg;
        x.setHp(hp_after);
        if (x.getHp() < 0){
            x.setHp(Math.abs(x.getHp()));
            System.out.println("You dealt too much damage. The " + x.getEnemy_type() + " healed " + Math.abs(x.getHp()));
            attack_value = 0;
        }
        else{
            System.out.println("The " + x.getEnemy_type() + " has " + hp_after + " hp left");
            attack_value = 0;
        }
    }

    public void form_attack(Card x){ //Function for Action 2
        if (attack_value <= 0){
            attack_value += x.getValue();
        }
        else if (x.getOperation().equals("+")){
            attack_value += x.getValue();
        }
        else if (x.getOperation().equals("-")){
            attack_value -= x.getValue();
        }
        else if (x.getOperation().equals("/")){
            attack_value /= x.getValue();
        }
        else if (x.getOperation().equals("*")){
            attack_value *= x.getValue();
        }
        else if (x.getOperation().equals("%")){
            attack_value %= x.getValue();
        }
    }

    public void decide_action(){
        System.out.println();
        System.out.println("Your current attack value is " + getAttack_value());
        System.out.println();
        System.out.println("1) " + (deck.getCard1()).getValue() + " " + (deck.getCard1()).getOperation());
        System.out.println();
        System.out.println("2) " + (deck.getCard2()).getValue() + " " + (deck.getCard2()).getOperation());
        System.out.println();
        System.out.println("3) " + (deck.getCard3()).getValue() + " " + (deck.getCard3()).getOperation());
        System.out.println();
        System.out.println("4) " + (deck.getCard4()).getValue() + " " + (deck.getCard4()).getOperation());
        System.out.println();
        System.out.println("5) " + (deck.getCard5()).getValue() + " " + (deck.getCard5()).getOperation());
        System.out.println();
        System.out.println("6) " + (deck.getCard6()).getValue() + " " + (deck.getCard6()).getOperation());
        System.out.println();
        System.out.println("7) " + (deck.getCard7()).getValue() + " " + (deck.getCard7()).getOperation());
        System.out.println();
        System.out.println("What do you do?\n(1)Attack\n(2)Form Attack\n(3)Replace a card");
        Scanner action_input = new Scanner(System.in);
        int action = action_input.nextInt();
        if (action == 1){
            System.out.println("Attacking!");
            try
            {
                attack_enemy(getCurrent_enemy(), getAttack_value());
            }
            catch (ArithmeticException e)
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
    }


    public Enemy getCurrent_enemy(){
        return current_enemy;
    }

    public int getAttack_value(){
        return attack_value;
    }
    public void setAttack_value(int value){
        attack_value = value;
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
