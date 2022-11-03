import java.util.Random;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void superPower() {         // восстанавливает здоровье
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 3 == 0) {
            if (super.getHealth() < 70) {
                super.setHealth(super.getHealth() + 30);
                System.out.println("Zombie recovered, his hp: " + getHealth());
            }
        }
    }

    @Override
    public void attackHero(Hero hero) {
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 2 == 0) {
            if (super.isAlive()) {
                System.out.printf("Zombie attacked %s, damage: 15hp\n", hero.getName());
                hero.takeDamage(15);
            }
        }
    }
}
