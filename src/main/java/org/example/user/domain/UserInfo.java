package org.example.user.domain;

public class UserInfo {

    private final String name;
    private final String profileImageURL;

    public UserInfo(String name, String profileImageURL) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.profileImageURL = profileImageURL;
    }
}
