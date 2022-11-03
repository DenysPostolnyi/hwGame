import java.util.Random;

public class Mage extends Hero {
    public static boolean block = false;

    public Mage(String name) {
        super(name);
    }



    @Override
    public void attackEnemy(Enemy enemy) {
        if(blockAttack){
            blockAttack = false;
            System.out.println("Attack unblocked");
        }
        if (super.isAlive()) {
            System.out.println("Mage hit enemy, damage: 15hp");
            enemy.takeDamage(15, this);
            superPower();
        }
    }

    @Override
    public void superPower() {  // ставит одноразовую защиту от врага на всех героев
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 3 == 0) {
            if (!block){
                block = true;
                System.out.println("Magic super power - protection for all heroes");
            }
        }
    }
}
