import java.util.ArrayList;
import java.util.Random;

import static java.lang.Thread.sleep;

public class BattleGround {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        Warrior heroJack = new Warrior("Warrior Jack");
        Mage heroLeyla = new Mage("Mage Leyla");
        Archer heroArcher = new Archer("Archer Alex");

        Skilletron skilletron = new Skilletron(100);
        Spider spider = new Spider(100);
        Zombie zombie = new Zombie(100);

        ArrayList<Enemy> enemies = new ArrayList<>();
        ArrayList<Hero> heroes = new ArrayList<>();

        enemies.add(skilletron);
        enemies.add(spider);
        enemies.add(zombie);

        heroes.add(heroArcher);
        heroes.add(heroLeyla);
        heroes.add(heroJack);

        System.out.println("Battle began");
        System.out.println("!!!!!!!!!!!!");
        while ((spider.isAlive() || skilletron.isAlive() || zombie.isAlive()) && (heroArcher.isAlive() || heroJack.isAlive() || heroLeyla.isAlive())) {
            int randomHero = random.nextInt(0, heroes.size() - 1);
            int randomEnemy = random.nextInt(0, heroes.size() - 1);
            while (!heroes.get(randomHero).isAlive()) {
                if (randomHero < heroes.size() - 1) {
                    randomHero++;
                } else {
                    randomHero = 0;
                }
            }
            while (!enemies.get(randomEnemy).isAlive()) {
                if (randomEnemy < enemies.size() - 1) {
                    randomEnemy++;
                } else {
                    randomEnemy = 0;
                }
            }
            heroes.get(randomHero).attackEnemy(enemies.get(randomEnemy));
            if (enemies.get(randomEnemy).isAlive()) {
                System.out.println(enemies.get(randomEnemy).getClass().getName() + "'s hp: " + enemies.get(randomEnemy).getHealth());
            } else {
                System.out.println(enemies.get(randomEnemy).getClass().getName() + " died");
            }
//            sleep(3000);
            System.out.println("<------>");
        }

        if ((heroArcher.isAlive() && heroJack.isAlive() && heroLeyla.isAlive()))
            System.out.println("Enemy lost");
        else
            System.out.print("Heroes lost");
    }
}
