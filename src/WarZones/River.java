package WarZones;

import Characters.Character;
import Monsters.Bear;

public class River extends WarZone{

    public River(){

    }
    public void fight(){

    }

    @Override
    public void fight(Character gamer, int randomInt) {
        Bear bearUsual = new Bear();
        for(int i=0;i<randomInt;i++){
            Bear bear = new Bear();

            while(bear.getHealthy()>0){
                bear.healthyReduction(gamer.getDamage());
                System.out.println((i+1)+". Ayının cani "+bear.getHealthy()+" 'ya düstü");

                gamer.healthyReduction(bear.getDamage());
                System.out.println("Canin " +gamer.getHealthy()+"'ya düstü \n\n\n");

                if(gamer.getHealthy()<=0){
                    System.out.println("GAME OVER");
                    return;
                }



            }
        }
        gamer.moneyIncrease(bearUsual.getMoney()*randomInt);
        gamer.setOwnerWater(true);
    }

    public void loot(){

    }
}
