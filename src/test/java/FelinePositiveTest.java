import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelinePositiveTest {
    private final int expectedKittensCount;
    private final int kittensCount;

    public FelinePositiveTest(int expectedKittensCount, int kittensCount) {
        this.expectedKittensCount = expectedKittensCount;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters(name = "ТестДата: Количество котят: {0}, {1}")
    public static Object[][] params() {
        return new Object[][]{
                {1, 1},
                {2, 2},
        };
    }

    @Test
    public void checkFelineEatsMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkFamilyIsFeline() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void checkGetKittensReturnsKittenCount() {
        Feline feline = new Feline();
        assertEquals(expectedKittensCount, feline.getKittens(kittensCount));
    }
}
