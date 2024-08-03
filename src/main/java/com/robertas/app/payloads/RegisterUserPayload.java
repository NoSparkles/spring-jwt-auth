package com.robertas.app.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserPayload {
    private String email;

    private String password;

    private String fullName;

}
