import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelinePositiveTest {

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

}
