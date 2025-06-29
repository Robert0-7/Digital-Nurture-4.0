import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTestWithSetup {

    private Calculator calc;

    @Before
    public void setUp() {
        // Arrange: Runs before each test
        calc = new Calculator();
        System.out.println("Setup: New Calculator instance created.");
    }

    @After
    public void tearDown() {
        // Teardown: Runs after each test
        System.out.println("Teardown: Test finished.");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calc.subtract(10, 5);

        // Assert
        assertEquals(5, result);
    }
}
