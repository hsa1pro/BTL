package control;
import model.*;

import java.util.Random;
import java.util.Scanner;

public class battleGameFirstFirst {
    private firstPet Pet;
    private firstBoss Boss;
    private int option;
    public battleGameFirstFirst(){
        Boss = new firstBoss();
        Pet = new firstPet();
    }
    public boolean check(){
        if (Boss.getHealth() <= 0)
            return false;
        else if (Pet.getHealth() <= 0)
            return false;
        return true;
    }

    public int petHealth(){return Pet.getHealth();}
    public int bossHealth(){return Boss.getHealth();}
    public void petPassive(){
        Pet.passive();
    }
    public void petAttack(){
        Pet.attackSkill();
    }
    public  void petHeal(){
        Pet.healSkill();
    }
    public void petElemental(){
        Pet.elementalSkill();
    }
    public void petBurst(){
        Pet.burstSkill();
    }
    public  int petET(){return Pet.getElementalTurn();}
    public  int petBT(){return Pet.getBurstTurn();}
    public void petETD(){Pet.setElementalTurn(Pet.getElementalTurn() - 1);}
    public void petBTD(){Pet.setBurstTurn(Pet.getBurstTurn() - 1);}

    public void bossPassive(){
        Boss.passive();
    }
    public void bossAttack(){
        Boss.attackSkill();
    }
    public  void bossHeal(){
        Boss.healSkill();
    }
    public void bossElemental(){
        Boss.elementalSkill();
    }
    public void bossBurst(){
        Boss.burstSkill();
    }

    public String petNoti1(){
        int damage = (Pet.getDamage() - Boss.getArmor());
         Boss.healDown(damage);
         String s = "Ban su dung tan cong" + " Don danh gay " + damage + " sat thuong. ";
        return s;
    }
    public String petNoti2(){

        return "Ban su dung hoi phuc. ";

    }
    public String petNoti3(){
        int damage = (Pet.getDamage() - Boss.getArmor());
        Boss.healDown(damage);
        String s = "Ban su dung " + Pet.getElemental() + " Don danh gay " + damage + " sat thuong. ";
        return s;
    }
    public String petNoti4(){
        int damage = (Pet.getDamage() - Boss.getArmor());
        Boss.healDown(damage);
        String s = "Ban su dung " + Pet.getBurst() + " Don danh gay " + damage + " sat thuong. ";
        return s;
    }
    public String bossNoti1(){
        int damage = (Boss.getDamage() - Pet.getArmor());
        String s = Boss.getName() + " su dung tan cong Don danh gay " + damage + " sat thuong. ";
        Pet.healDown(damage);
        return s;
    }
    public String bossNoti2(){
        return Boss.getName() + " su dung hoi phuc. ";
    }
    public String bossNoti3(){
        int damage = (Boss.getDamage() - Pet.getArmor());
        String s = Boss.getName() + " su dung " + Boss.getElemental() + "Don danh gay " + damage + " sat thuong. ";
        Pet.healDown(damage);
        return s;
    }
    public String bossNoti4(){
        int damage = (Boss.getDamage() - Pet.getArmor());
        String s = Boss.getName() + " su dung " + Boss.getBurst() + "Don danh gay " + damage + " sat thuong. ";
        Pet.healDown(damage);
        return s;
    }
}
