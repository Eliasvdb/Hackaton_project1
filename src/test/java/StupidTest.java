import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;

public class StupidTest {
    @Test
//    @Ignore
    public void testWillFail() throws InterruptedException {
        System.out.println("Testing...");

        Thread.sleep(10000);

        Assertions.fail("Test is supposed to fail...");
    }

    @Test
    public void testWillSucceed() throws InterruptedException {
        System.out.println("Testing...");

        Thread.sleep(10000);
    }
}
