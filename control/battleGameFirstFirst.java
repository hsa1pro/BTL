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
    public void BossAction(){
        Random generator = new Random();
        int bot = generator.nextInt((15 - 0) + 1) + 0;
        bossNoti0();
        bossPassive();
        if (bot < 7)
        {
            bossAttack();
            bossNoti1();
        }
        else if (bot < 11){
            bossHeal();
            bossNoti2();
        }
        else if (bot < 14)
        {
            bossElemental();
            bossNoti3();
        }
        else{
            bossBurst();
            bossNoti4();
        }
    }
//    void battle(){
//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("Hp: " + petHealth());
//            System.out.println("Boss's Hp: " + bossHealth());
//            petPassive();
//            petNoti0();
//            System.out.print("Ban muon lam gi: ");
//            int o = scanner.nextInt();
//            switch (o){
//                case 1:
//                    petAttack();
//                    petNoti1();
//                    break;
//                case 2:
//                    petHeal();
//                    petNoti2();
//                    break;
//                case 3:
//                    petElemental();
//                    petNoti3();
//                    break;
//                case 4:
//                    petBurst();
//                    petNoti4();
//                    break;
//            }
//            Random generator = new Random();
//            int bot = generator.nextInt((15 - 0) + 1) + 0;
//            bossNoti0();
//            bossPassive();
//            if (bot < 7)
//            {
//                bossAttack();
//                bossNoti1();
//            }
//            else if (bot < 11){
//                bossHeal();
//                bossNoti2();
//            }
//            else if (bot < 14)
//            {
//                bossElemental();
//                bossNoti3();
//            }
//            else{
//                bossBurst();
//                bossNoti4();
//            }
//        }
//        while (check() == true);
//    }
    public void setOption(int option){this.option = option;}
    public int getOption(){return this.option;}
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
    public void petNoti0(){
        if (Pet.getPassiveMode() && Pet.getPassiveTurn() > 0)
            System.out.println(Pet.getName() + " su dung " + Pet.getPassive() + " trong " + Pet.getPassiveTurn() + " luot. ");
    }
    public void petNoti1(){
        int damage = (Pet.getDamage() - Boss.getArmor());
         Boss.healDown(damage);
        System.out.println("Ban su dung tan cong");
        System.out.println("Don danh gay " + damage + " sat thuong. ");

    }
    public void petNoti2(){

        System.out.println("Ban su dung hoi phuc. ");

    }
    public void petNoti3(){
        int damage = (Pet.getDamage() - Boss.getArmor());
        Boss.healDown(damage);
        System.out.println("Ban su dung "+ Pet.getElemental() );
        System.out.println("Don danh gay " + damage + " sat thuong. ");
    }
    public void petNoti4(){
        int damage = (Pet.getDamage() - Boss.getArmor());
        Boss.healDown(damage);
        System.out.println("Ban su dung " + Pet.getBurst());
        System.out.println("Don danh gay " + damage + " sat thuong. ");
    }
    public void bossNoti0(){
        if (Boss.getPassiveMode() && Boss.getPassiveTurn() > 0)
            System.out.println(Boss.getName() + " su dung " + Boss.getPassive() + " trong " + Pet.getPassiveTurn() + " luot. ");
    }
    public void bossNoti1(){
        int damage = (Boss.getDamage() - Pet.getArmor());
        System.out.println(Boss.getName() + " su dung tan cong");
        System.out.println("Don danh gay " + damage + " sat thuong. ");
        Pet.healDown(damage);
    }
    public void bossNoti2(){
        System.out.println(Boss.getName() + " su dung hoi phuc. ");
    }
    public void bossNoti3(){
        int damage = (Boss.getDamage() - Pet.getArmor());
        System.out.println(Boss.getName() + " su dung " + Boss.getElemental());
        System.out.println("Don danh gay " + damage + " sat thuong. ");
        Pet.healDown(damage);
    }
    public void bossNoti4(){
        int damage = (Boss.getDamage() - Pet.getArmor());
        System.out.println(Boss.getName() + " su dung tan cong");
        System.out.println("Don danh gay " + damage + " sat thuong. ");
        Pet.healDown(damage);
    }

//    public static void main(String[] args) {
//        battleGameFirstFirst b = new battleGameFirstFirst();
//        b.battle();
//    }
}
