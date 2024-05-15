import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class ExerciseTest {

    @BeforeEach
    public void setUp() {
        // Kod för att konfigurera testmiljön innan varje testfall
    }

    @AfterEach
    public void tearDown() {
        // Kod för att rensa upp testmiljön efter varje testfall
    }

    @Test
    public void testSomething() {
        // Kod för att utföra ett testfall
        assertEquals(expectedOutput, outContent.toString().trim(), "Main-metoden skriver inte ut den förväntade raden.");
    }
}
