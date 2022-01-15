package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testInnit() {
        User user = new AdminUser("g@g.org","pass");
        assertTrue(user != null);
    }

    @Test
    void testMail() {
        User user = new AdminUser("g@g.org","pass");
        assertEquals("g@g.org", user.getUserEmail());
    }

    @Test
    void testPass() {
        User user = new AdminUser("g@g.org","pass");
        assertEquals("****", user.getPassword());
    }

}