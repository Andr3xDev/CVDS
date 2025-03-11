package edu.eci.cvds.tdd.library.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    public UserTest() {
    }

    @Test
    public void mustCreateUser() {
        User user = new User();
        assertNotNull(user);
    }

    @Test
    public void shouldNotGetName() {
        User user = new User();
        assertNull(user.getName());
    }

    @Test
    public void shouldGetName() {
        User user = new User();
        user.setName("Nicole");
        assertEquals("Nicole", user.getName());
    }

    @Test
    public void shouldSetName() {
        User user = new User();
        assertDoesNotThrow(() -> user.setName("Nicole"));
        assertDoesNotThrow(() -> user.setName(null));

    }

    @Test
    public void shouldNotSetName() {
        User user = new User();
        Object invalidValue = 100;

        assertThrows(ClassCastException.class, () -> {
            user.setName((String) invalidValue);
        });
    }

    @Test
    public void shouldGetId() {
        User user = new User();
        user.setId("cvds10002345");
        assertEquals(user.getId(), "cvds10002345");
    }

    @Test
    public void shouldNotGetId() {
        User user = new User();
        assertNull(user.getId());
    }

    @Test
    public void shouldSetId() {
        User user = new User();
        assertDoesNotThrow(() -> user.setId("cvds10002345"));
        assertDoesNotThrow(() -> user.setId(null));
    }

    @Test
    public void shouldNotSetId() {
        User user = new User();
        Object invalidValue = 88.59;

        assertThrows(ClassCastException.class, () -> {
            user.setName((String) invalidValue);
        });
    }
}
