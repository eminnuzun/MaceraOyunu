package Places;

import Armors.EasyArmor;
import Armors.HardArmor;
import Armors.MediumArmor;
import Characters.Character;
import Weapons.*;

import java.util.Scanner;

public class Store {

    public void buyWeapon(Character gamer){
        Scanner scanner = new Scanner(System.in);
        Pistol pistol = new Pistol();
        Rifle rifle = new Rifle();
        Sword sword = new Sword();

        System.out.println("Hangi silahı satın almak istersiniz?");
        System.out.println("1-Tabanca\tDamage: "+pistol.getDamage()+ "\tMoney: "+pistol.getMoney()+  "\n" +
                            "2-Kılıc\tDamage: "+sword.getDamage()+ "\tMoney: "+sword.getMoney()+  "\n"+
                            "3-Tufek\tDamage: "+rifle.getDamage()+ "\tMoney: "+rifle.getMoney()+  "\n"+
                             "0- Cıkıs icin");

        int weaponChoice = scanner.nextInt();

        switch (weaponChoice){
            case 1:

                System.out.println("Tabanca\n");
                System.out.println(pistol.getDamage());
                System.out.println(pistol.getMoney());

                if(pistol.getMoney()<=gamer.getMoney() && !gamer.isOwnerPistol() && !gamer.isOwnerSword() && !gamer.isOwnerRifle()){
                    gamer.moneyReduction(pistol.getMoney());
                    gamer.damageIncrease(pistol.getDamage());
                    gamer.setOwnerPistol(true);

                }
                else if(gamer.isOwnerPistol()){
                    System.out.println("Zaten bu silaha sahipsiniz \n\n\n");
                }
                else if(gamer.isOwnerSword() || gamer.isOwnerRifle()){
                    System.out.println("Zaten daha iyi bir silaha sahipsiniz \n\n\n");
                }
                else{
                    System.out.println("Yetersiz bakiye \n\n\n");
                }


                break;

            case 2:
                System.out.println("Sword\n");
                System.out.println(sword.getDamage());
                System.out.println(sword.getMoney());

                if(sword.getMoney()<=gamer.getMoney() && !gamer.isOwnerSword() && !gamer.isOwnerRifle()){
                    gamer.moneyReduction(sword.getMoney());
                    gamer.damageIncrease(sword.getDamage());
                    gamer.setOwnerSword(true);

                    if(gamer.isOwnerPistol()){
                        gamer.damageReduction(pistol.getDamage());
                    }

                }
                else if(gamer.isOwnerSword()){
                    System.out.println("Zaten bu silaha sahipsiniz \n\n\n");
                }
                else if(gamer.isOwnerRifle()){
                    System.out.println("Zaten daha iyi bir silaha sahipsiniz \n\n\n");
                }
                else{
                    System.out.println("Yetersiz bakiye \n\n\n");
                }

                break;

            case 3:
                System.out.println("Rifle");
                System.out.println(rifle.getDamage());
                System.out.println(rifle.getMoney());

                if(rifle.getMoney()<= gamer.getMoney() && !gamer.isOwnerRifle()){
                    gamer.moneyReduction(rifle.getMoney());
                    gamer.damageIncrease(rifle.getDamage());
                    gamer.setOwnerRifle(true);

                    if(gamer.isOwnerSword()){
                        gamer.damageReduction(sword.getDamage());
                    }
                    else if(gamer.isOwnerPistol()){
                        gamer.damageReduction(pistol.getDamage());
                    }

                }
                else if(gamer.isOwnerRifle()){
                    System.out.println("Zaten bu silaha sahipsiniz \n\n\n");
                }
                else{
                    System.out.println("Yetersiz bakiye \n\n\n");
                }
                break;
            case 0:
                System.out.println("Geri ddonuluyor \n\n\n");
                break;
            default:
                System.out.println("Hatali giris yaptiniz \n\n\n");
                break;
        }
    }

    public void buyArmor(Character gamer){
        Scanner scanner=new Scanner(System.in);
        EasyArmor easyArmor = new EasyArmor();
        MediumArmor mediumArmor = new MediumArmor();
        HardArmor hardArmor = new HardArmor();

        System.out.println("Armor seciniz");
        System.out.println("1-Easy Armor\tEngelleme: "+easyArmor.getBlock()+"\tPara: "+easyArmor.getMoney()+ "\n"+
                            "2-Medium Armor\tEngelleme : "+mediumArmor.getBlock()+"\tPara: "+mediumArmor.getMoney()+"\n"+
                            "3-Hard Armor\tEngelleme: "+hardArmor.getBlock()+"\tPara: "+hardArmor.getMoney()+"\n");

        int armorChoice = scanner.nextInt();

        switch (armorChoice){
            case 1:
                System.out.println("Easy Armor");
                System.out.println(easyArmor.getBlock());
                System.out.println(easyArmor.getMoney());

                if(easyArmor.getMoney()<= gamer.getMoney() && !gamer.isOwnerEasyArmor() && !gamer.isOwnerMediumArmor() && !gamer.isOwnerHardArmor()){
                    gamer.moneyReduction(easyArmor.getMoney());
                    gamer.blockIncrease(easyArmor.getBlock());
                    gamer.setOwnerEasyArmor(true);
                }
                else if(gamer.isOwnerEasyArmor()){
                    System.out.println("Zaten bu zırha sahipsiniz \n\n\n");
                }
                else if(gamer.isOwnerMediumArmor() || gamer.isOwnerHardArmor()){
                    System.out.println("Zaten daha iyi bir zırha sahipsiniz \n\n\n");
                }
                else {
                    System.out.println("Yetersiz bakiye \n\n\n");
                }
            break;

            case 2:
                System.out.println("Medium Armor");
                System.out.println(mediumArmor.getBlock());
                System.out.println(mediumArmor.getMoney());

                if(mediumArmor.getMoney()<=gamer.getMoney() && !gamer.isOwnerMediumArmor() && !gamer.isOwnerHardArmor()){

                    gamer.moneyReduction(mediumArmor.getMoney());
                    gamer.blockIncrease(mediumArmor.getBlock());
                    gamer.setOwnerMediumArmor(true);

                    if(gamer.isOwnerEasyArmor()){
                        gamer.blockReduction(easyArmor.getBlock());

                    }
                }
                else if(gamer.isOwnerMediumArmor()){
                        System.out.println("Zaten bu zırha sahipsiniz \n\n\n");
                    }
                else if(gamer.isOwnerHardArmor()){
                    System.out.println("Zaten daha iyi bir zırha sahipsiniz \n\n\n");
                }
                else {
                    System.out.println("Yetersiz bakiye \n\n\n");
                }
                break;

            case 3:
                System.out.println("Hard Armor");
                System.out.println(hardArmor.getBlock());
                System.out.println(hardArmor.getMoney());

                if(hardArmor.getMoney()<=gamer.getMoney() && !gamer.isOwnerHardArmor()){
                    gamer.moneyReduction(hardArmor.getMoney());
                    gamer.blockIncrease(hardArmor.getBlock());
                    gamer.setOwnerHardArmor(true);

                    if(gamer.isOwnerMediumArmor()){
                        gamer.blockReduction(mediumArmor.getBlock());
                    }
                    else if(gamer.isOwnerEasyArmor()){
                        gamer.blockReduction(easyArmor.getBlock());
                    }

                }
                else if(gamer.isOwnerHardArmor()){
                    System.out.println("Zaten bu silaha sahipsiniz \n\n\n");
                }
                else{
                    System.out.println("Yetersiz bakiye \n\n\n");
                }
                break;

            case 0:
                System.out.println("Geri donuluyor \n\n\n");
                break;

            default:
                System.out.println("Hatali giris yaptiniz \n\n\n");
                break;
        }

    }


}
