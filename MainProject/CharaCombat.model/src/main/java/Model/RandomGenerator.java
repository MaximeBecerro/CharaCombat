/*
 *
 */
package Model;

/*
 *
 */
import java.util.Random;

import Contract.IRandomGenerator;

public class RandomGenerator implements IRandomGenerator {
    private final Random r = new Random();

    public float getRandom() {
        return this.r.nextFloat() * 100;
    }
}
