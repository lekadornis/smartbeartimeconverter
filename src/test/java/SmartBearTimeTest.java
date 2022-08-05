import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.SmartBearTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rasaq Sulaimon
 * @date 05/08/2022 09:29
 */

public class SmartBearTimeTest {
    SmartBearTime smartBearTime;
    @BeforeEach
    void setUp(){
        smartBearTime = new SmartBearTime();
    }

    @Test
    @DisplayName("Check entries for both valid and invalid entries")
    void testDisplayEntries(){

        assertEquals("Noon", smartBearTime.convertEntry("00:00"), "Checking for mid day");
        assertEquals("Invalid entry", smartBearTime.convertEntry("0000"), "Checking invalid time");
        assertEquals("Invalid time entry range", smartBearTime.convertEntry("20:60"), "Checking out of range time");
    }

}
