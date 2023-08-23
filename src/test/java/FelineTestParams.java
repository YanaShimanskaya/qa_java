import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FelineTestParams {
    private final int expected;
    private final int expKittensCount = 1;
    Feline feline;

    public FelineTestParams(int kittensCount) {
        this.expected = kittensCount;
    }

    @Parameterized.Parameters(name = "Kittens count. Test data: {0}")
    public static Object[][] kittenCount() {
        return new Object[][]{
                {0},
                {1},
                {5},

        };
    }

    @Before
    public void feline() {
        feline = new Feline();
    }

    @Test
    public void getKittensWoParams() {
        assertEquals(expKittensCount, feline.getKittens());
    }

    @Test
    public void getKittensWithParams() {
        int actual = feline.getKittens(expected);
        assertEquals(expected, actual);
    }
}

