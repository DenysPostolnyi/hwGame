public class Mage extends Hero{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Magic hit, damage: 15hp");
        enemy.takeDamage(15);
    }
}
