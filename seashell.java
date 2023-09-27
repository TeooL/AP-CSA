import java.util.Scanner;
public class seashell{
  private String color;
  private String size;

public seashell(String c, String s){
  color = c;
  size = s;
  }
public void display(String s, String c){
  System.out.println("Your seashell is " + c + " and " + s);
  }

public void display(){
  System.out.println("Your seashell is " + color  + size);
  }
}

