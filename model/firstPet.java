package model;

public class firstPet extends Character{

    public firstPet(){
        setName("Mugendaina");
        setPassive("Void Energy");
        setElemental("Dynamax Cannon");
        setBurst("Enternabeam");
        setHealth(75);
        setOriginAttack(100);
        setOriginArmor(70);
        setAttack(getOriginAttack());
        setArmor(getOriginArmor());
        setPassiveMode(false);
        setBuff(0);
        setDebuff(0);
        setDebuffTurn(0);
    }
    private void passiveEffect()
    {
        if (getPassiveTurn() > 0){
            setOriginAttack(120);
            setAttack(getOriginAttack());
            setHealth(getHealth() + 10);
            setPassiveTurn(getPassiveTurn() - 1);
        }
    }
    @Override
    public void passive()
    {
        passiveEffect();
        if (getHealth() <= getHealth()/2 && getPassiveMode() == false)
        {
            setPassiveTurn(3);
            setPassiveMode(true);
        }
    }
    public void attackSkill(){
        int damage = generator.nextInt(((int)(getAttack()*1.2) - (int)(getAttack()*0.8)) + 1) + (int)(getAttack()*0.8);
        setDamage(damage);
    }
    public void healSkill(){
        int heal = generator.nextInt((15 - 10) + 1) + 10;
        setHealth(getHealth() + heal);
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
