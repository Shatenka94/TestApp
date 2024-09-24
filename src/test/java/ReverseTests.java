import org.junit.Assert;
import org.junit.Test;

public class ReverseTests {
    @Test
    public void reverseString(){
        Assert.assertNull(ReverseStringClass.reverseString(null));
        System.out.println("output passed");
    }
    @Test
    public void reverseTestWithDigit(){
        Assert.assertEquals("cba3218",ReverseStringClass.reverseString("123abc"));
        System.out.println("reverseTestWithDigit");
    }

    @Test
    public void reverseTestHappyPath(){
        Assert.assertEquals("elppa",ReverseStringClass.reverseString("apple"));
        System.out.println("reverseTestHappyPathHello");
    }

}
