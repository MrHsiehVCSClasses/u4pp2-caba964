package u4pp;
public class Monster extends Combatant {

int monsterXP;
public Monster(String name, int health, int attack, int exp){
    super(name, health, attack);
    if (exp < 0){
            monsterXP = 0;
    } else {
        monsterXP = exp;
    }
}
public void takeTurn(Combatant target){
    target.takeDamage(getAttackPower());
}
public int getExpGiven(){
    return monsterXP;
}
public String toString(){
    return super.toString() + "Monster's XP Count: " + monsterXP;
}
}