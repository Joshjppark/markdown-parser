import static org.junit.Assert.*;
import org.junit.*;

public class helloTest {
    
    @Test
    public void addition() {
        assertEquals(2, 1+1); // checks that 2 == 1+1
    }

    @Test
    public void testmultiply() {
        assertEquals(4, hello.multiply(2, 2)); // checks that 2 == 1+1
    }
}
