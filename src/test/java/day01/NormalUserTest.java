package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testInnit() {
        NormalUser normalUser = new NormalUser("g@g.org","pass");
        assertTrue(normalUser != null);
    }

    @Test
    void testMail() {
        NormalUser normalUser = new NormalUser("g@g.org","pass");
        assertEquals("g@g.org", normalUser.getUserEmail());
    }

    @Test
    void testPass() {
        NormalUser normalUser = new NormalUser("g@g.org","pass");
        assertEquals("pass", normalUser.getPassword());
    }

}