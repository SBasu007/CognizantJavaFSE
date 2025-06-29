

import org.junit.Test;
import static org.junit.Assert.*;

public class MyAppTest {
    @Test
    public void testAdd() {
        MyApp app = new MyApp();
        assertEquals(5, app.add(2, 3));
    }
}
