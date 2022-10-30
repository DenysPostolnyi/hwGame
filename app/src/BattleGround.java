import static java.lang.Thread.sleep;

public class BattleGround {
    public static void main(String[] args) throws InterruptedException {
        Warrior heroJack = new Warrior("Warrior Jack");
        Mage heroLeyla = new Mage("Mage Leyla");
        Enemy enemy = new Enemy(100);
        System.out.println("Battle began");
        int steps = 0;
        while (enemy.isAlive()) {
            if (steps % 2 == 0) {
                System.out.println(heroJack.getName() + " attacks");
                heroJack.attackEnemy(enemy);
                System.out.println("Enemy's hp: " + enemy.getHealth());
            }
            else {
                System.out.println(heroLeyla.getName() + " attacks");
                heroLeyla.attackEnemy(enemy);
                System.out.println("Enemy's hp: " + enemy.getHealth());
            }
            System.out.println("<------>");
            steps++;
            sleep(2000);
        }
        System.out.printf("Enemy killed in %s steps", steps);
    }
}
