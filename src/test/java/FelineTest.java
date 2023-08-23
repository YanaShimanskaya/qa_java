import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline;

    public FelineTest() {}

    @Before
    public void feline() {
        feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }


}

