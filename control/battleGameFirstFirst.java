package control;
import model.*;
public class battleGameFirstFirst {
    private firstPet Pet;
    private firstBoss Boss;
    battleGameFirstFirst(){
        Boss = new firstBoss();
        Pet = new firstPet();
    }
    public boolean check(firstBoss Boss, firstPet Pet){
        if (Boss.getHealth() == 0)
            return false;
        else if (Pet.getHealth() == 0)
            return false;
        return true;
    }
    void battle(firstBoss Boss, firstPet Pet){
        do{

        }
        while (check(Boss, Pet));
    }
    public int petHealth(){return Pet.getHealth();}
    public void petNoti0(firstPet Pet){
        if (Pet.getPassiveMode() && Pet.getPassiveTurn() > 0)
            System.out.println(Pet.getName() + " su dung " + Pet.getPassive() + " trong " + Pet.getPassiveTurn() + " luot. ");
    }
    public void petNoti1(firstPet Pet, firstBoss Boss){
        int damage = (Pet.getDamage() - Boss.getArmor());
        System.out.println("Ban su dung tan cong");
        System.out.println("Don danh gay " + damage + " sat thuong. ");
        Boss.setHealth(Boss.getHealth() - damage);
    }
    public void petNoti2(firstPet Pet){
        System.out.println("Ban su dung hoi phuc. ");
    }
    public void petNoti3(firstPet Pet, firstBoss Boss){
        int damage = (Pet.getDamage() - Boss.getArmor());
        System.out.println("Ban su dung " + Pet.getElemental());
        System.out.println("Don danh gay " + damage + " sat thuong. ");
        Boss.setHealth(Boss.getHealth() - damage);
    }
    public void petNoti4(firstPet Pet, firstBoss Boss){
        int damage = (Pet.getDamage() - Boss.getArmor());
        System.out.println("Ban su dung tan cong");
        System.out.println("Don danh gay " + damage + " sat thuong. ");
        Boss.setHealth(Boss.getHealth() - damage);
    }
}
