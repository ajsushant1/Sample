import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
    Sample sample=new Sample();
    @Test
    public void callMethod_ShouldReturn() {

        String world = sample.printMessage("World");
        Assert.assertEquals("Hello World",world);
    }

    @Test
    public void givenTwoIntegers_ShouldReturnAddition() {
        int addition = sample.getAddition(4, 5);
        Assert.assertEquals(9,addition);

    }
}
