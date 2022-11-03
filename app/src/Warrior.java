import java.util.Random;

public class Warrior extends Hero{
    private int enemyHP;
    private int damage;
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(blockAttack){
            blockAttack = false;
            System.out.println("Attack unblocked");
        }
        if(super.isAlive()){
            enemyHP = enemy.getHealth();
            superPower();
            enemy.takeDamage(damage, this);
            System.out.printf("Warrior hit enemy, damage: %shp\n", damage);
            damage = 20;
        }
    }

    @Override
    public void superPower() { // 1 ударом убивает врага
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 7 == 0) {
            damage = enemyHP;
            System.out.println("Warrior super power - kill enemy");
        }
    }
}
