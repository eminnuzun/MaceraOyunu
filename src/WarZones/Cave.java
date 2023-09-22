package WarZones;

import Characters.Character;
import Monsters.Zombie;

public class Cave extends WarZone{

    public Cave(){

    }

    public void fight(Character gamer,int randomInt){
        Zombie zombieUsual = new Zombie();
        for(int i=0;i<randomInt;i++){
            Zombie zombie = new Zombie();

            while(zombie.getHealthy()>0){
                zombie.healthyReduction(gamer.getDamage());
                System.out.println((i+1)+". Zombinin canı " +zombie.getHealthy()+" 'ya dustü");

                gamer.healthyReduction(zombie.getDamage());
                System.out.println("Canın "+gamer.getHealthy()+"'ya dustü \n\n\n");

                if(gamer.getHealthy()<=0){
                    System.out.println("GAME OVER");
                    return;
                }

            }

        }
        gamer.moneyIncrease(zombieUsual.getMoney()*randomInt);
        gamer.setOwnerFood(true);
    }
    public void loot(){

    }


}
