public class Enemy{
  private String enemy_type;
  private int enemy_hp;
  private int defense;


public Enemy(String enemy_type, int enemy_hp, int defense){
  this.enemy_type = enemy_type;
  this.enemy_hp = enemy_hp;
  this.defense = defense;
 }
public int getHp(){
  return enemy_hp;
}
public void setHp(int set_val){
  enemy_hp = set_val;
}
public String getEnemy_type(){
  return enemy_type;
}
public int getDefense(){
  return defense;
}

}
