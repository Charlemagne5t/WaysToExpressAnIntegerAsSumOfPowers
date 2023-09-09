import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numberOfWaysTest1() {
        int n = 10;
        int x = 2;
        int expected = 1;
        int actual = new Solution().numberOfWays(n, x);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfWaysTest2() {
        int n = 4;
        int x = 1;
        int expected = 2;
        int actual = new Solution().numberOfWays(n, x);

        Assert.assertEquals(expected, actual);
    }
}
