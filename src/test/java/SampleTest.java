import org.junit.Assert;
import org.junit.Test;

public class SampleTest {
    @Test
    public void callMethod_ShouldReturn() {
        Sample sample=new Sample();
        String world = sample.printMessage("World");
        Assert.assertEquals("Hello World",world);
    }
}
