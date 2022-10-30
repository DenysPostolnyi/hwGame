public class TrainingGround {
    public static void main(String[] args) {
        Warrior heroJack = new Warrior("Warrior Jack");
        Mage heroLeyla = new Mage("Mage Leyla");
        Archer heroAlex = new Archer("Archer Alex");
        Enemy enemy = new Enemy(100);
        
        System.out.println("Enemy's hp: " + enemy.getHealth());
        System.out.println("<---------->");

        System.out.println("Hero's name: " + heroJack.getName());
        heroJack.attackEnemy(enemy);
        System.out.println("Enemy's hp: " + enemy.getHealth());
        System.out.println("<---------->");
        System.out.println("Hero's name: " + heroLeyla.getName());
        heroLeyla.attackEnemy(enemy);
        System.out.println("Enemy's hp: " + enemy.getHealth());
        System.out.println("<---------->");
        System.out.println("Hero's name: " + heroAlex.getName());
        heroAlex.attackEnemy(enemy);
        System.out.println("Enemy's hp: " + enemy.getHealth());
    }
}