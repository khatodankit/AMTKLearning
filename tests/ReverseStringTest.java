import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        Assert.assertEquals("abcd", new ReverseString().reverseStringBasic("dcba"));

        Assert.assertEquals("abcd", new ReverseString().reverseStringSingleVarSpace("dcba"));
        Assert.assertEquals("abcde", new ReverseString().reverseStringSingleVarSpace("edcba"));
    }
}