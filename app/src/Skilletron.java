import java.util.Random;

public class Skilletron extends Enemy {
    private boolean rec = false;

    public Skilletron(int health) {
        super(health);
    }

    @Override
    public void superPower() { // восстанавливает свое здоровье за счет здоровья героя
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 3 == 0) {
            System.out.println("Skilletron super power - take hero's health");
            rec = true;
        }
    }

    @Override
    public void attackHero(Hero hero) {
        Random random = new Random();
        int randNumber = random.nextInt();
        if (randNumber % 2 == 0) {
            if (super.isAlive()) {
                System.out.printf("Skilletron attacked %s, damage: 10hp\n", hero.getName());
                hero.takeDamage(10);
                superPower();
                if (rec) {
                    super.setHealth(super.getHealth() + 10);
                    System.out.println("Skilletron cured on 10hp after attack on hero");
                    rec = false;
                }
            }
        }
    }
}
