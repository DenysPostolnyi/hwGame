public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Hit enemy by arrow");
    }
}
