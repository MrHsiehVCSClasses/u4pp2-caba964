package u4pp;
public class DefenseMonster extends Monster {

private int defensePoints;
public DefenseMonster(String name, int health, int attack, int exp, int defense){
    super(name, health, attack, exp);
    defensePoints = defense;
}
public int getDefense(){
    return defensePoints;
}
public void takeDamage(int damage){
    if (damage - getDefense() > 0){
        super.takeDamage(damage - defensePoints);
    }
    else {
        super.takeDamage(0);
    }
}
public String toString(){
    return super.toString() + "Defense Points: " + defensePoints;
}
}
