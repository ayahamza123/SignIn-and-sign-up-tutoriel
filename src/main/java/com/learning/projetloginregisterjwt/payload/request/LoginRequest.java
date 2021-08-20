package com.learning.projetloginregisterjwt.payload.request;

import javax.validation.constraints.NotBlank;

/**
 * @author Ala Hadj Brahim <ala.hajbrahim@gmail.com>
 * @project ProjetLoginRegisterjwt
 * @Created 18/08/2021  6:22.
 */
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
