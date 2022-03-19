package model;

public class modelCharacter {
    private int health;
    private int armor;
    private int attack;
    private String namechar;
    private int mana;
    protected void setName(String name){
        namechar = name;
    }
    protected void setHealth(int health){
        this.health = health;
    }
    protected void setArmor(int armor){
        this.armor = armor;
    }
    protected void setAttack(int attack){
        this.attack = attack;
    }
    protected void setMana(int mana) {this.mana = mana;}
    protected String getName(){return namechar;}
    protected int getHealth(){return health;}
    protected int getArmor(){return armor;}
    protected int getAttack(){return attack;}
    protected void passive(){}
    protected void attackSkill(){}
    protected void defendSkill(){}
    protected void normalSkill(){}
    protected void elementalSkill(){}
    protected void ultimateSkill(){}
    protected void spealcialSkill(){} // co the co hoac khong
}