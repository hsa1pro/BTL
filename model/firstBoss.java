package model;

public class firstBoss extends Character{
    public firstBoss(){
        setName("Boss Rabbit");
        setElemental("Rider Kick");
        setBurst("Carrotbeam");
        setOriginHealth(150);
        setHealth(getOriginHealth());
        setOriginAttack(100);
        setOriginArmor(70);
        setAttack(getOriginAttack());
        setArmor(getOriginArmor());
        setPassiveMode(false);
        setBuff(0);
        setDebuff(0);
        setDebuffTurn(0);
    }
    @Override
    public void attackSkill(){
        int damage = generator.nextInt(((int)(getAttack()*1.2) - (int)(getAttack()*0.8)) + 1) + (int)(getAttack()*0.8);
        setDamage(damage);
    }
    public void healSkill(){
        int heal = generator.nextInt((15 - 10) + 1) + 10;
        healUp(heal);
        if (getHealth() > getOriginHealth())
            setHealth(getOriginHealth());
    }
    public void elementalSkill(){
        int damage = generator.nextInt(((int)(getAttack()*1.5) - getAttack()) + 1) + getAttack();
        setBuff(2);
        setDamage(damage);
    }
    public void burstSkill(){
        int damage = generator.nextInt(((int)(getAttack()*1.8) - (int)(getAttack()*1.2)) + 1) + (int)(getAttack()*1.2);
        setDamage(damage);
    }
}
