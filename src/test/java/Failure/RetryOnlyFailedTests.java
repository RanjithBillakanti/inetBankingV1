package Failure;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class RetryOnlyFailedTests extends BaseTest{
    @Test(retryAnalyzer = Retry.class)
    public void test1() {
        //Negative Scenario
        assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
    }
    @Test(retryAnalyzer = Retry.class)
    public void test2() {
        //Negative Scenario
        assertEquals(2+2,3,"Addition Problem! 2+2 must be 4!\n");
    }
    @Test(retryAnalyzer = Retry.class)
    public void test3() {
        //Postive Scenario
        assertEquals(2+2,4,"Addition Problem! 2+2 must be 4!\n");
    }
}
