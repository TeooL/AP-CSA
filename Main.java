import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
// Start of Project
        System.out.println("Lets see something cool");
        System.out.println("Choose a whole number to divide 4 by");
        Scanner s = new Scanner(System.in);
        Integer number_chosen = new Integer(s.nextInt());
        try {
            double four = 3.0;
            four ++;
            double result = 4.0 / number_chosen;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Why did you input 0");
        }
        System.out.println("How about something else?");
        System.out.println("Enter two numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        s.nextLine();
        equals(num1, num2);
        System.out.println("Input a word");
        String word = s.nextLine();
        System.out.println("Lets print a part of it");
        System.out.println("Enter the index of the string you want to print to from 0.");
        try{
        int position = s.nextInt();
        s.nextLine();
        System.out.println(word.substring(0,position));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
        String word2 = word.toString();
        System.out.print(word +  " is " + word2);
        System.out.println();
        System.out.println("Ok time to start");


        Dialogue game = new Dialogue();
        System.out.println("What is your name?");
        final String player_name = s.nextLine();
        Player one = new Player(player_name);
        one.welcome_player();
        game.slimeEncounter();
        Enemy slime = new Enemy("Slime", 21);
        System.out.println("Also known as " + slime);
        one.assign_enemy(slime);
        int turns_left = 20;
        while (slime.getHp() != 0 && turns_left != 0){
            displayHealth(slime);
            displayDefense(slime);
            boolean negative_atk = isAttackNegative(one.getAttack_value());
            if (negative_atk){
                one.setAttack_value(0);
            }
            one.decide_action();
            turns_left --;
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
                    displayHealth(wolf);
                    displayDefense(wolf);
                    boolean negative_atk = isAttackNegative(one.getAttack_value());
                    if (negative_atk)one.setAttack_value(0);
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
                            displayHealth(dragon);
                            displayDefense(dragon);
                            boolean negative_atk = isAttackNegative(one.getAttack_value());
                            if (negative_atk)one.setAttack_value(0);
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
                            boolean negative_atk = isAttackNegative(one.getAttack_value());
                            if (negative_atk)one.setAttack_value(0);
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
                    boolean negative_atk = isAttackNegative(one.getAttack_value());
                    if (negative_atk)one.setAttack_value(0);
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
                            boolean negative_atk = isAttackNegative(one.getAttack_value());
                            if (negative_atk)one.setAttack_value(0);
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
                            boolean negative_atk = isAttackNegative(one.getAttack_value());
                            if (negative_atk)one.setAttack_value(0);
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
    public static void displayHealth(Enemy e){
        System.out.println("The enemy has " + e.getHp() + " HP");
}
    public static boolean isAttackNegative(int attack_value){
        return attack_value < 0;
    }
    public static void equals(int x, int y){
        if (x == y) System.out.println("They are the same.");
        else System.out.println("They are different.");
    }
}



