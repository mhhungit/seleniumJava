import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAsd {
    @Test
    void Test_01() {
        asd asd = new asd();
        int c = asd.c();
        Assert.assertEquals(c,3,"C bi sai");
    }
}
