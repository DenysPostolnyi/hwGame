public class Hero {
    private final String name;

    public Hero(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void attackEnemy(Enemy enemy){
        System.out.println("Enemy attacked, damage: 5hp");
        enemy.takeDamage(5);
    }
}
