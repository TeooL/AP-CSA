public class Pair
{
  private int first_num;
  private int second_num;

  public Pair(int one, int two)
  {
    first_num = one;
    second_num = two;
  }
  
  public Pair()
  {
    System.out.println("You didn't include numbers for a pair");
  }
  
  public void roll()
  {
    System.out.println("Rolling!");
  }
  public void display()
  {
    System.out.println("Your pair is " + first_num + " and " + second_num);
  }
}
  
