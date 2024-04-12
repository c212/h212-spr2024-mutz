import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem5 {

    public static void main(String[] args) {
        Zombie testZombie = new Zombie();

        Assertions.assertEquals(testZombie.getX(), 0);
        Assertions.assertEquals(testZombie.getY(), 0);

        testZombie.move(Zombie.Direction.North);
        Assertions.assertEquals(testZombie.getX(), 1);

        testZombie.move(Zombie.Direction.East);
        Assertions.assertEquals(testZombie.getY(), 1);

        testZombie.move(Zombie.Direction.South);
        Assertions.assertEquals(testZombie.getX(), 0);

        testZombie.move(Zombie.Direction.West);
        Assertions.assertEquals(testZombie.getY(), 0);
    }
}
