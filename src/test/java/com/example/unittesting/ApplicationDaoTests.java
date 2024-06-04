package com.example.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ApplicationDaoTests {
    @Mock
    ApplicationDao applicationDao;
    @Mock
    User user;
    @Test
    @DisplayName("User updated successfully")
    public void updateUsername() throws Exception {
        User user = new User();
        Mocking mocking= new Mocking();
        mocking.setApplicationDao(applicationDao);
        mocking.setUser(user);
        user.setUserName("Ronaldo");
        Assertions.assertEquals(1, mocking.updateUsername("3211", "Messi"));

    }
}
