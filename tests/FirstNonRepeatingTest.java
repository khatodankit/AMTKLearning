import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatingTest {

    @Test
    public void findFirstNonRepeating() {
        Assert.assertEquals(java.util.Optional.of('a').get(), new FirstNonRepeating().findFirstNonRepeating("ankit"));
        Assert.assertEquals(java.util.Optional.of('a').get(), new FirstNonRepeating().findFirstNonRepeating("bbddffrrakkbb"));

        Assert.assertEquals(java.util.Optional.of('z').get(), new FirstNonRepeating().findFirstNonRepeating("aabbzhhjc"));

        Assert.assertNull(new FirstNonRepeating().findFirstNonRepeating("aabbcc"));
    }
}