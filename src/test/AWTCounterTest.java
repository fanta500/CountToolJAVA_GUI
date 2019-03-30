package test;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import production.AWTCounter;
import org.junit.Before;

import static org.hamcrest.MatcherAssert.assertThat;

public class AWTCounterTest {
    private AWTCounter testCounter;
    @Before
    public void setUp() {
        testCounter = new AWTCounter();
    }

    @Test
    public void factorialOf3Is6() {
        assertThat(testCounter.factorial(3), is(6L));

    }
}
