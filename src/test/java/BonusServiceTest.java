import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void testWithDataFromFile(long amount, boolean isRegistered, long expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);
        assertEquals(expected, actual);
    }
}