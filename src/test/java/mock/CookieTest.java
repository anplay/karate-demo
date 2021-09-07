package mock;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CookieTest {

    @Test
    public void testParallel() {
        Results results = Runner.path("classpath:mock/async/main.feature")
                .configDir("classpath:mock/async")
                .parallel(1);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

}
