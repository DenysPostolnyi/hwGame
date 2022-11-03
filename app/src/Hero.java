public abstract class Hero implements Mortal {
    private final String name;
    private int health = 100;

    public boolean blockAttack = false;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        if(Mage.block){
            System.out.println("Magic protection broken");
            Mage.block = false;
        }
        else {
            if (damage > health) {
                health = 0;
            } else {
                health -= damage;
            }
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract void superPower();
}
