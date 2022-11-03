public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage, Hero hero){
        if(damage > health){
            health = 0;
        }
        else {
            health -= damage;
            attackHero(hero);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void superPower();

    public abstract void attackHero(Hero hero);
}
