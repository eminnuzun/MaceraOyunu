package WarZones;

import Characters.Character;
import Monsters.Monster;

public abstract class WarZone {
    Monster monster;
    boolean item=false;

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public boolean isItem() {
        return item;
    }

    public void setItem(boolean item) {
        this.item = item;
    }

    public abstract void fight(Character character,int randomInt);
    public abstract void loot();



}
