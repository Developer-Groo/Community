package org.example.user.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest {

    @Test
    void givenNameAndProfileImage_whenCreated_thenThrowNothing() {
        // given
        String name = "abcd";
        String profileImageURL = "";

        // when & then
        assertDoesNotThrow(() -> new UserInfo(name, profileImageURL));
    }

    @Test
    void givenBlankNameAndProfileImage_whenCreated_thenThrowNothing() {
        // given
        String name = "";
        String profileImageURL = "";

        // when & then
        assertThrows(IllegalArgumentException.class, () -> new UserInfo(name, profileImageURL));
    }
}