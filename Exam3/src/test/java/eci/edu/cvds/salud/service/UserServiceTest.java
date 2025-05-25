package eci.edu.cvds.salud.service;

import eci.edu.cvds.salud.model.UserModel;
import eci.edu.cvds.salud.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldCreateUser() {
        UserModel model = new UserModel();

        when(userRepository.save(model)).thenReturn(model);

        UserModel modeline = userService.createUser(model);

        assertNotNull(modeline);
    }
}
