package WarZones;

import Characters.Character;
import Monsters.Vampire;

public class Forest extends WarZone{

    public Forest(){
        super.setMonster(new Vampire());
    }


    @Override
    public void fight(Character gamer, int randomInt) {
        Vampire vampireUsual = new Vampire();
        for(int i=0;i<randomInt;i++){
            Vampire vampire = new Vampire();

            while(vampire.getHealthy()>0){
                vampire.healthyReduction(gamer.getDamage());
                System.out.println((i+1)+". vampirin canı " + vampire.getHealthy()+"'ya düstü");

                gamer.healthyReduction(vampire.getDamage());
                System.out.println("Canın " + gamer.getHealthy()+"'ya düstü \n\n\n");

                if(gamer.getHealthy() <=0){
                    System.out.println("GAME OVER");
                    return;
                }

            }
        }
        gamer.moneyIncrease(vampireUsual.getMoney()*randomInt);
        gamer.setOwnerFirewood(true);
    }

    public void loot(){

    }
}
