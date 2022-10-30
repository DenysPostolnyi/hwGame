public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Hit enemy by sword, damage: 20hp");
        enemy.takeDamage(20);
    }
}
