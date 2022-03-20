package model;
import java.util.Random;
public class Character extends modelCharacter{
    public Random generator = new Random();
    private int originAttack;
    private int originArmor;
    private int damage;
    private int buff;
    private int debuff;
    private int debuffTurn;
    private boolean passiveMode;
    private int passiveTurn;
    private int elementalTurn;
    private int burstTurn;

    public void setOriginAttack(int originAttack){this.originAttack = originAttack;}
    public void setOriginArmor(int originArmor){this.originArmor = originArmor;}
    public void setDamage(int damage){this.damage = damage;}
    public void setBuff(int buff){this.buff = buff;}
    public void setDebuff(int debuff){this.debuff = debuff;}
    public void setDebuffTurn(int debuffTurn){this.debuffTurn = debuffTurn;}
    public void setPassiveTurn(int passiveTurn){this.passiveTurn = passiveTurn;}
    public void setPassiveMode(boolean passiveMode){this.passiveMode = passiveMode;}
    public void setElementalTurn(int elementalTurn){this.elementalTurn = elementalTurn;}
    public void setBurstTurn(int burstTurn){this.burstTurn = burstTurn;}

    public int getDamage(){return damage;}
    public int getOriginAttack(){return originAttack;}
    public int getOriginArmor(){return originArmor;}
    public int getBuff(){return buff;}
    public int getDebuff(){return debuff;}
    public int getDebuffTurn(){return debuffTurn;}
    public int getPassiveTurn(){return passiveTurn;}
    public boolean getPassiveMode(){return passiveMode;}
    public int getElementalTurn(){return elementalTurn;}
    public int getBurstTurn() {return burstTurn;}

    public void debuffEffect()
    {
        if (debuffTurn > 0)
        {
            if (getDebuff() == 1)
            {
                setAttack(getAttack() - 10);
            }
            else if (getDebuff() == 2)
            {
                setArmor(getArmor() - 10);
            }
            else if (getDebuff() == 3);
            {
                setHealth(getHealth() - (int)(getHealth()*0.15));
            }
            setDebuffTurn(getDebuffTurn() - 1);
        }
        if (debuffTurn == 0)
        {
            setAttack(getOriginAttack());
            setArmor(getOriginArmor());
        }
    }
}
