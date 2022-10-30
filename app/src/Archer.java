public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Hit enemy by arrow, damage: 10hp");
        enemy.takeDamage(10);
    }
}
