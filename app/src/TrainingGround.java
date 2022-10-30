public class TrainingGround {
    public static void main(String[] args) {
        Warrior heroJack = new Warrior("Warrior Jack");
        Mage heroLeyla = new Mage("Mage Leyla");
        Archer heroAlex = new Archer("Archer Alex");
        System.out.println("Hero's name: " + heroJack.getName());
        heroJack.attackEnemy();
        System.out.println("<---------->");
        System.out.println("Hero's name: " + heroLeyla.getName());
        heroLeyla.attackEnemy();
        System.out.println("<---------->");
        System.out.println("Hero's name: " + heroAlex.getName());
        heroAlex.attackEnemy();
    }
}