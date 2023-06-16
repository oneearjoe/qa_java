import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class LionNegativeTest {

    Feline feline;

    @Test(expected = Exception.class)
    public void checkNotValidSexThrowsException() throws Exception {
        String sex = "Мальчик";
        Lion lion = new Lion(feline, sex);
        lion.doesHaveMane();
    }
}
