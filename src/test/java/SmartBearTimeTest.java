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

        assertEquals("Midnight", smartBearTime.convertEntry("00:00"), "Checking for mid day");
        assertEquals("Noon", smartBearTime.convertEntry("12:00"), "Checking for noon");
        assertEquals("Invalid entry. Please try again (hh:mm): ", smartBearTime.convertEntry("0000"), "Checking invalid time");
        assertEquals("Invalid entry. Please try again (hh:mm): ", smartBearTime.convertEntry("20:60"), "Checking out of range time");
    }

}
