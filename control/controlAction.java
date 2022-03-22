package control;

public class controlAction {
    battleGameFirstFirst b= new battleGameFirstFirst();
     public void AttackAction(){
         System.out.println("Player's Turn: ");
         System.out.println("Attack Skill");

         b.petAttack();
//         b.petNoti1();

         if (b.bossHealth()<=0) {
             System.out.println("Ban da thang!");

             System.exit(0);
         } else {
             //Boss Turn
             System.out.println("Boss's Turn: ");
             b.BossAction();

         }
         if(b.petHealth()<=0){
             System.out.println("Ban da thua!");
             System.exit(0);
         }
     }
}
