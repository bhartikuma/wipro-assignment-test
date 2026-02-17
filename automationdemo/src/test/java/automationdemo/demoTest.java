package automationdemo;

import org.testng.annotations.Test;
import org.testng.Assert;

public class demoTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5);
    }
}

