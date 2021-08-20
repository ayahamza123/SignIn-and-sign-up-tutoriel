package com.learning.projetloginregisterjwt.payload.response;

/**
 * @author Ala Hadj Brahim <ala.hajbrahim@gmail.com>
 * @project ProjetLoginRegisterjwt
 * @Created 18/08/2021  6:33.
 */
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
