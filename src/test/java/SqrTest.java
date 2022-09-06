import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SqrTest {

    @Test
    public void shouldCalcSqr15() {
        SQRService service = new SQRService();

        int actual = service.calcSQR(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

}
