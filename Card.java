import java.util.Random; 
public class Card{
  private int value;
  private String operation;
  public Card(int v , String o)
  {
    value = v;
    operation = o;
  }
  public Card(){
    Random rand = new Random();
    value = rand.nextInt(11);
    int operation_assignment = rand.nextInt(5);
    if (operation_assignment == 0){
      operation = "Addition";
    }
    else if (operation_assignment == 1){
      operation = "Subtraction";
    }
    else if (operation_assignment == 2){
      operation = "Multiplication";
    }
    else if (operation_assignment == 3){
      operation = "Division";
    }
    else if (operation_assignment == 4){
      operation = "Mod";
    }
  }
  
  public int getValue(){
    return value;
  }
  
  public String getOperation(){
    return operation;
  }
  public void newCard(){ //Gives card a new operation and value 1 - 10
    Random rand = new Random();
    value = rand.nextInt(10) + 1;
    int operation_assignment = rand.nextInt(5);
    if (operation_assignment == 0){
      operation = "Addition";
    }
    else if (operation_assignment == 1){
      operation = "Subtraction";
    }
    else if (operation_assignment == 2){
      operation = "Multiplication";
    }
    else if (operation_assignment == 3){
      operation = "Division";
    }
    else if (operation_assignment == 4){
      operation = "Mod";
    }
  }
}
