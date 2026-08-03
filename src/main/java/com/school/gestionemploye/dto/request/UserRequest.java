package com.school.gestionemploye.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record UserRequest(
        @NotEmpty(message = "username is required")
        String username ,
        @NotEmpty(message = "password is required")
        String password ,
        @NotEmpty(message = "email is required")
        @Email
        String email
) {
}
