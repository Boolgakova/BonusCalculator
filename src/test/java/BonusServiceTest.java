import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void test() {
        BonusService service = new BonusService();
        long expected = 300;
        long actual = service.calculate(10_000, true);

        Assertions.assertEquals(expected, actual);
    }
}
