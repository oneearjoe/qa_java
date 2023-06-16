import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlexPositiveTest {

    Alex alex;

    @Before
    public void setUp() throws Exception {
        alex = new Alex(new Feline());
    }

    @Test
    public void checkAlexFriends(){
        Assert.assertEquals("Марти, Глория, Мелман", alex.getFriends());
    }

    @Test
    public void checkAlexPlaceOfLiving() throws Exception {
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void checkAlexGetKitten() {
        Assert.assertEquals(0, alex.getKittens());
    }

}