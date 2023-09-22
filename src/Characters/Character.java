package Characters;

public abstract class Character {

    private int damage;
    private int healthy;
    private int money;

    private int firstHealthy;

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    private int block=0;

    public boolean isOwnerEasyArmor() {
        return ownerEasyArmor;
    }

    public void setOwnerEasyArmor(boolean ownerEasyArmor) {
        this.ownerEasyArmor = ownerEasyArmor;
    }

    public boolean isOwnerMediumArmor() {
        return ownerMediumArmor;
    }

    public void setOwnerMediumArmor(boolean ownerMediumArmor) {
        this.ownerMediumArmor = ownerMediumArmor;
    }

    public boolean isOwnerHardArmor() {
        return ownerHardArmor;
    }

    public void setOwnerHardArmor(boolean ownerHardArmor) {
        this.ownerHardArmor = ownerHardArmor;
    }

    boolean ownerEasyArmor=false;
    boolean ownerMediumArmor=false;
    boolean ownerHardArmor=false;


    public boolean isOwnerFirewood() {
        return ownerFirewood;
    }

    public void setOwnerFirewood(boolean ownerFirewood) {
        this.ownerFirewood = ownerFirewood;
    }

    boolean ownerFirewood = false;
    public boolean isOwnerWater() {
        return ownerWater;
    }

    public void setOwnerWater(boolean ownerWater) {
        this.ownerWater = ownerWater;
    }

    boolean ownerWater=false;
    public boolean isOwnerFood() {
        return ownerFood;
    }

    public void setOwnerFood(boolean ownerFood) {
        this.ownerFood = ownerFood;
    }

    boolean ownerFood=false;

    public boolean isOwnerPistol() {
        return ownerPistol;
    }

    public void setOwnerPistol(boolean ownerPistol) {
        this.ownerPistol = ownerPistol;
    }

    public boolean isOwnerRifle() {
        return ownerRifle;
    }

    public void setOwnerRifle(boolean ownerRifle) {
        this.ownerRifle = ownerRifle;
    }

    public boolean isOwnerSword() {
        return ownerSword;
    }

    public void setOwnerSword(boolean ownerSword) {
        this.ownerSword = ownerSword;
    }

    boolean ownerPistol = false;
    boolean ownerRifle=false;
    boolean ownerSword =false;

    public int getFirstHealthy() {
        return firstHealthy;
    }

    public void setFirstHealthy(int firstHealthy) {
        this.firstHealthy = firstHealthy;
    }




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

    public void show(){
        System.out.println("Damage: :"+getDamage());
        System.out.println("Healthy :" +getHealthy());
        System.out.println("Money :"+ getMoney());
        System.out.println("Block: "+getBlock());
    }

    public void damageIncrease(int damage){


        int lastDamage = getDamage();
        lastDamage +=damage;
        setDamage(lastDamage);
    }
    public void moneyReduction(int money){
        int lastMoney = getMoney();
        lastMoney -=money;
        setMoney(lastMoney);

    }
    public void moneyIncrease(int money){
        int lastMoney = getMoney();
        lastMoney +=money;
        setMoney(lastMoney);

    }

    public void damageReduction(int damage){
        int lastDamage = getDamage();
        lastDamage -=damage;
        setDamage(lastDamage);
    }

    public void blockIncrease(int block){
        int lastBlock = getBlock();
        lastBlock +=block;
        setBlock(lastBlock);
    }
    public void blockReduction(int block){
        int lastBlock = getBlock();
        lastBlock -=block;
        setBlock(lastBlock);
    }

    public void healthyReduction(int damage){
        int lastHealthy = getHealthy();
        if(damage>block){
            lastHealthy -= damage-block;
        }
        setHealthy(lastHealthy);

    }


}
