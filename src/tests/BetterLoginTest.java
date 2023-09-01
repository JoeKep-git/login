import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetterLoginTest {
    private static final BetterLogin login = new BetterLogin();

    @Test
    void AdminSuccessLogin() {
        assertTrue(login.login("admin", "Password"));
    }
    @Test
    void BruceSuccessLogin() {
        assertTrue(login.login("bruce", "Wayne"));
    }
    @Test
    void SelinaSuccessLogin() {
        assertTrue(login.login("selina", "Kyle"));
    }
    @Test
    void AdminFailLogin() {
        assertFalse(login.login("admin", "password"));
    }
}