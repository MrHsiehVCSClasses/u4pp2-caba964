package u4pp;

public class Fighter extends Combatant {

private int lvl;
private int xp;
private int focusStacks;
private boolean blocking;
    
public Fighter(String name, int maxHealth, int attack){
    super (name, maxHealth, attack);
    lvl = 1;
    xp = 0;
    focusStacks = 0;
    blocking = false;
}
public int getXp(){
    return xp;
}
public int getFocusStacks(){
    return focusStacks;
}
public int getLvl(){
    return lvl;
}
public boolean getIsBlocking(){
    return blocking;
}
public void attack(Combatant target){
    int num = 1;
    for (int i = 0; i < focusStacks; i++){
        num *= 2;
    }
    if (focusStacks == 0){
        target.takeDamage(getAttackPower());
    } 
    else {
        target.takeDamage(num * getAttackPower());
        focusStacks = 0;
    }      
}
public void block(){
    blocking = true;
}
public void focus(){
    focusStacks += 1;
}
public void gainEXP(int exp){
    xp = getXp() + exp;
    while (xp >= lvl){
        xp -= lvl;
        lvl += 1;
        setMaxHealth(getMaxHealth() + 5);
        setAttackPower(getAttackPower() + 1);
        setHealth(getMaxHealth());
    }
}
public void takeDamage(int damage){
    if (blocking == true){
        setHealth(getHealth() - (damage/2));
        blocking = false;
    }
    else {
        setHealth(getHealth() - damage);
        blocking = false;
    }
}
public String toString(){
    return super.toString() + "Level: " + lvl + "XP: " + xp + "Focus Stacks: " + focusStacks + "Is Blocking: " + blocking;}
}