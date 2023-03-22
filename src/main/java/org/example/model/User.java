package org.example.model;

import org.example.model.Account;
//  Bikin sebuah class User yang memilik attribute: username dan password
public class User {
    public String username = "loey";
    public String password = "rahasia";

    // Buatlah constructor full attribute untuk class User
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }
}
