import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionException() throws Exception {
        String exceptionMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> new Lion("Гемафродит", feline));
        assertEquals(exceptionMessage, exception.getMessage());
    }
}