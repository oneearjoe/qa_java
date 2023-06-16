import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatPositiveTest {

    @Test
    public void checkCatMakesMeowSound() {
        Cat cat = new Cat(new Feline());
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void checkCatEatsMeat() throws Exception {
        Cat cat = new Cat(new Feline());
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
