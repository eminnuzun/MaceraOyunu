import Characters.Archer;
import Characters.Character;
import Characters.Knight;
import Characters.Samurai;
import Monsters.Bear;
import Monsters.Monster;
import Monsters.Vampire;
import Monsters.Zombie;

import Places.Store;
import WarZones.*;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Character gamer = null;
        Scanner scanner = new Scanner(System.in);
        boolean validInput =false;
        while(!validInput){             //KARAKTER SEÇİMİ

            System.out.println("Karakter seçiniz\n" +
                                "1-Samuray\n" +
                                "2-Okcu\n" +
                                "3-Sovalye\n" +
                                "0-Cikis");
            int karakterSecimi=scanner.nextInt();

            switch (karakterSecimi){
                case 1:
                    gamer = new Samurai();
                    validInput=true;
                    break;
                case 2:
                    gamer = new Archer();
                    validInput=true;
                    break;
                case 3:
                    gamer = new Knight();
                    validInput=true;
                    break;
                case 0:
                    System.out.println("Oyun kapatılıyor");
                    return;

                default:
                    System.out.println("Hatali karakter secimi");

            }

        }



        System.out.println(gamer.getClass().getSimpleName()+" karakteri oluşturuldu");
        //gamer.setMoney(99999);
        gamer.show();
        System.out.println("***********************************************************");
        System.out.println("***********************************************************");
        System.out.println("***********************************************************");

        while(true){

            System.out.println("Gitmek istediginiz mekani secin");
            System.out.println("1- Güvenli Ev\n"+
                                "2- Mağara\n" +
                                "3- Nehir\n"+
                                "4- Mağaza\n"+
                                "5- Orman\n");
            int placeChoice = scanner.nextInt();

            switch (placeChoice){
                case 1:
                    System.out.println("Güvenli eve giris yapildi");
                    System.out.println("Güvenli eve girerkenki can degeri: "+gamer.getHealthy());
                    gamer.setHealthy(gamer.getFirstHealthy());
                    System.out.println("Can tamamen dolduruldu");
                    System.out.println("Güvenli evden çıkarken can degeri: \n\n\n" +gamer.getHealthy());
                    break;

                case 2:
                    Zombie z = new Zombie();
                    Random randomZombie = new Random();
                    int randomZombieInt= randomZombie.nextInt(3)+1;
                    System.out.println("Zombi: Hasar: "+z.getDamage()+"\tSaglık: "+z.getHealthy()+"\tPara: "+z.getMoney());
                    System.out.println("Magrada "+randomZombieInt+" tane zombi var. Devam edecek misin?\n1-YES\t2-NO");

                    int fightCaveChoice = scanner.nextInt();

                    if(fightCaveChoice==1){
                        Cave cave = new Cave();
                        cave.fight(gamer,randomZombieInt);


                    }

                    gamer.show();
                    System.out.println("\n\n\n");

                    break;

                case 3:
                    Bear b = new Bear();
                    Random randomBear = new Random();
                    int randomBearInt = randomBear.nextInt(3)+1;
                    System.out.println("Ayı: Hasar: "+b.getDamage()+"\tSaglık: "+b.getHealthy()+"\tPara: "+b.getMoney());
                    System.out.println("Magrada "+randomBearInt+" tane zombi var.  Devam edecek misin?\n1-YES\t2-NO");


                    int fightRiverChoice = scanner.nextInt();

                    if(fightRiverChoice ==1){
                        River river = new River();
                        river.fight(gamer,randomBearInt);
                    }
                    gamer.show();

                    System.out.println("\n\n\n");

                    break;
                case 4:
                    System.out.println("Hangisini satın almak istiyorsunuz?");
                    System.out.println("1-Silah\n2-Zırh\n0-Cıkıs");
                    int storeChoice= scanner.nextInt();
                    Store store = new Store();
                    switch (storeChoice){
                        case 1:
                            store.buyWeapon(gamer);
                            gamer.show();
                            System.out.println("\n\n\n");
                          break;

                        case 2:
                            store.buyArmor(gamer);
                            gamer.show();
                            System.out.println("\n\n\n");
                            break;

                        case 0:
                            System.out.println("Cıkıs yapılıyor \n\n\n");
                            break;

                        default:
                            System.out.println("Hatali giris \n\n\n");
                            break;
                    }
                    break;


                case 5:
                    Vampire v = new Vampire();
                    Random randomVampire = new Random();
                    int randomVampireInt = randomVampire.nextInt(3)+1;
                    System.out.println("Vampire: Hasar: "+v.getDamage()+"\tSaglık: "+v.getHealthy()+"\tPara: "+v.getMoney());
                    System.out.println("Ormanda "+ randomVampireInt+" tane vampir var. Devam edecek misin?\n1-YES\t2-NO");

                    int fightForestChoice = scanner.nextInt();

                    if(fightForestChoice==1){
                        Forest forest = new Forest();
                        forest.fight(gamer,randomVampireInt);
                    }
                    gamer.show();
                    System.out.println("\n\n\n");
                    break;

                 default:
                    System.out.println("Yanlis deger girdin");
                    break;

            }

           //returm


            if(gamer.isOwnerFood() && gamer.isOwnerWater() && gamer.isOwnerFirewood()){

                System.out.println("OYUNU KAZANDINIZ");
                return;
            }


            System.out.println("***********************************************************");
            System.out.println("***********************************************************");
            System.out.println("***********************************************************");


        }






    }
}