import java.util.Scanner;
public class seashell{
  private String color;
  private String size;

public void assignColor(){
  Scanner s = new Scanner(System.in);
  System.out.println("What color is your seashell?");
  color = s.nextLine();
}
public void assignSize(){
  Scanner s = new Scanner(System.in);
  System.out.println("What size is your seashell?");
  size = s.nextLine();
}
public void display(){
  System.out.println("Your seashell is " + color + " and " + size);
}
}
  
   
  
           