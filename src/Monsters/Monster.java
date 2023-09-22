package Monsters;

public abstract class Monster {

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    int damage;
    int healthy;
    int money;

    public void healthyReduction(int damage){
        int lastHealthy = getHealthy();
        lastHealthy -=damage;
        setHealthy(lastHealthy);
    }
}
