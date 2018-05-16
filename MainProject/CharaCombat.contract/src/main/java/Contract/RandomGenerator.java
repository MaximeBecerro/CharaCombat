/*
 *
 */
package Contract;

/*
 *
 */
import java.util.Random;

public class RandomGenerator implements IRandomGenerator {
    private final Random r = new Random();

    public float getRandom() {
        return this.r.nextFloat() * 100;
    }
}
