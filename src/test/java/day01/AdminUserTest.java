package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testInnit() {
        AdminUser adminUser = new AdminUser("g@g.org","pass");
        assertTrue(adminUser != null);
    }

    @Test
    void testMail() {
        AdminUser adminUser = new AdminUser("g@g.org","pass");
        assertEquals("g@g.org", adminUser.getUserEmail());
    }

    @Test
    void testPass() {
        AdminUser adminUser = new AdminUser("g@g.org","pass");
        assertEquals("****", adminUser.getPassword());
    }

}