package u4pp;

public class Combatant {

private String names;
private int maxHealths;
private int attacks;
private int healths;

public Combatant(String name, int maxHealth, int attack){
    names = name;
    maxHealths = maxHealth;
    attacks = attack;
    healths = maxHealth;
}
public String getName(){
    return names;
}
public int getHealth(){
    return healths; 
}
public int getMaxHealth(){
    return maxHealths;
}
public int getAttackPower(){
    return attacks;
}
public void setHealth(int health){
    if (health > maxHealths) {
        healths = maxHealths;
    } else if (health < 0) {
        healths = 0;
    } else {
        healths = health;
    }
}
public void setMaxHealth(int health){
    if (health <= 0) {
        maxHealths = 1;
    } else {
        maxHealths = health;
    } if (maxHealths < healths) {
        healths = maxHealths;
    }
}
public void setAttackPower(int attackPower){
    if (attackPower >= 0) {
        attacks = attackPower;
    } else {
        attacks = 0;
    }
}
public void takeDamage(int damage){
int newHealth;
    if (damage >= 0) {
        newHealth = healths - damage;
        setHealth(newHealth);
    }
    }
public boolean canFight(){
    if (healths > 0) {
    return true;
    }
    return false;
    }
public String toString(){
    return "Name: " + names + "Health: "+ healths + "Maximum Health: " + maxHealths + "Attack Power: " + attacks;
}
    
}
