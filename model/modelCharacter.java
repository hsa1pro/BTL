package model;
// buff la hieu ung gay cho ke dich
// debuff la hieu ung ke dich gay cho minh
// debuff 1 la giam attack trong 3 luot
// debuff 2 la giam armor trong 3 luot
// debuff 3 la tru mau trong 3 luot
// debuff 4 la choang / debuff 4 se dung trong phan battle
public class modelCharacter {
    private String namechar;
    private int health;
    private int armor;
    private int attack;
    private String passive;
    private String elemental;
    private String burst;
    //function set
    public void setName(String name){
        namechar = name;
    }
    public void setPassive(String passive){this.passive = passive;}
    public void setElemental(String element){this.elemental = elemental;}
    public void setBurst(String burst){this.burst = burst;}
    public void setHealth(int health){
        this.health = health;
    }
    public void setArmor(int armor){
        this.armor = armor;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    //function get
    public String getName(){return namechar;}
    public String getPassive(){return passive;}
    public String getElemental(){return elemental;}
    public String getBurst(){return burst;}
    public int getHealth(){return health;}
    public int getArmor(){return armor;}
    public int getAttack(){return attack;}

    //skill
    public void passive(){}
    public void attackSkill(){}
    public void healSkill(){}
    public void elementalSkill(){}
    public void burstSkill(){}
}