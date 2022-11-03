import java.util.Random;

public class Spider extends Enemy {
    public Spider(int health) {
        super(health);
    }

    private boolean power = false;

    @Override
    public void superPower() { // блокирует возможность удара жертве
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 3 == 0) {
            power = true;
            System.out.println("Spider super power - block hero's hit");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 2 == 0) {
            if (super.isAlive()) {
                System.out.printf("Spider attacked %s, damage: 5hp\n", hero.getName());
                hero.takeDamage(5);
                superPower();
                if (power) {
                    hero.blockAttack = true;
                }
            }
        }
    }
}
