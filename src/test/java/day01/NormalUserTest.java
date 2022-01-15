package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testInnit() {
        User user = new NormalUser("g@g.org","pass");
        assertTrue(user != null);
    }

    @Test
    void testMail() {
        User user = new NormalUser("g@g.org","pass");
        assertEquals("g@g.org", user.getUserEmail());
    }

    @Test
    void testPass() {
        User user = new NormalUser("g@g.org","pass");
        assertEquals("pass", user.getPassword());
    }

}