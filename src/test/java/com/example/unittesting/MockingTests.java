package com.example.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockingTests {
    @Mock
    User user;

    @Test
    @DisplayName("Permission assigned successfully")
    public void assignPermissions() {
        Mocking mocking = new Mocking();
        mocking.setUser(user);
        when(user.getRole()).thenReturn("admin");
        when(user.getUserName()).thenReturn("Rauf");
        Assertions.assertEquals(1, mocking.assignPermission());
    }

    @Test
    @DisplayName("Permission failed..")
    public void assignPermissions2() {
        Mocking mocking = new Mocking();
        mocking.setUser(user);
        when(user.getRole()).thenReturn("user");
        when(user.getUserName()).thenReturn("Rauf");
        Assertions.assertEquals(-1, mocking.assignPermission());
    }

}
