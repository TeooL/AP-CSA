public class Deck{
  private Card c1;
  private Card c2;
  private Card c3;
  private Card c4;
  private Card c5;
  private Card c6;
  private Card c7;
  private Card placeholder;
  
  public Deck(Card c1, Card c2, Card c3, Card c4, Card c5, Card c6, Card c7){
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
    this.c4 = c4;
    this.c5 = c5;
    this.c6 = c6;
    this.c7 = c7;
  }
  
  public Card getCard(int x){
    if (x == 1){
      return c1;
    }
    else if (x == 2){
      return c2;
    }
    else if (x == 3){
      return c3;
    }
    else if (x == 4){
      return c4;
    }
    else if (x == 5){
      return c5;
    }
    else if (x == 6){
      return c6;
    }
    else if (x == 7){
      return c7;
    }
    else{
        return placeholder;
    }
  }
}


                     
    
