import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")

    public void test(long amount, boolean registered, long expected) {
        BonusService bonusService = new BonusService();

        long actual = bonusService.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}
