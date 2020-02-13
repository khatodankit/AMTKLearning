import org.junit.Assert;

public class ReverseStringTest {

    @org.junit.Test
    public void reverseString() {
        Assert.assertEquals("abcd", new ReverseString().reverseString("dcba"));
    }
}