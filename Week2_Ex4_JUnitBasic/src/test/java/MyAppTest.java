
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyAppTest {

    private MyApp app;

    @Before
    public void setUp() {
        // Arrange
        app = new MyApp();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Teardown
        System.out.println("Teardown complete");
        app = null;
    }

    @Test
    public void testAddition() {
        // Act
        int result = app.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testDivision() {
        // Act
        int result = app.divide(10, 2);

        // Assert
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        // Act
        app.divide(5, 0);

        // Assert is handled by the expected exception
    }
}
