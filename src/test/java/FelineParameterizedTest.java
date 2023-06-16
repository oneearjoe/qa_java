import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int expectedKittensCount;
    private final int kittensCount;

    public FelineParameterizedTest(int expectedKittensCount, int kittensCount) {
        this.expectedKittensCount = expectedKittensCount;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters(name = "Количество котят: {0}, {1}")
    public static Object[][] params() {
        return new Object[][]{
                {1, 1},
                {2, 2},
        };
    }

    @Test
    public void checkGetKittensReturnsKittenCount() {
        Feline feline = new Feline();
        assertEquals(expectedKittensCount, feline.getKittens(kittensCount));
    }
}