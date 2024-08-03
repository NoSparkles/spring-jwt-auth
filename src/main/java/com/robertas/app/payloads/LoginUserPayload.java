package com.robertas.app.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginUserPayload {
    private String email;
    private String password;
}
