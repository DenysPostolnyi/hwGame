import java.util.Random;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }
    private int damage = 10;
    @Override
    public void attackEnemy(Enemy enemy) {
        if(blockAttack){
            blockAttack = false;
            System.out.println("Attack unblocked");
        }
        if (super.isAlive()) {
            superPower();
            enemy.takeDamage(damage, this);
            System.out.printf("Archer hit enemy, damage: %shp\n", damage);
            damage = 10;
        }
    }

    @Override
    public void superPower() { // делает двойной выстрел по противнику
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 3 == 0) {
            damage = 20;
            System.out.println("Archer super power - 2x hit");
        }
    }
}
