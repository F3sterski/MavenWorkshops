import com.google.common.math.IntMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompileTimeTest {
    @Test
    public void binomialTest() {
        int result = IntMath.binomial(6, 3);

        assertEquals(20, result);
    }

}
