import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    // test if we detect capital usage and is the first test
    @Test
    public void detectCapitalUseTest1()
    {
        myString.setString("String");
        assertEquals(true, myString.detectCapitalUse());
    }

    // test if detect a capital letter was not used
    @Test
    public void detectCapitalUseTest2()
    {
        myString.setString("string");
        assertEquals(false, myString.detectCapitalUse());
    }
}
