package com.school.gestionemploye.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(
        @NotEmpty(message = "username is required")
        String username ,
        @NotEmpty(message = "username is required")
        String password
) {
}
