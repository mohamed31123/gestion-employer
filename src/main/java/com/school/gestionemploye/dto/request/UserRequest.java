package com.school.gestionemploye.dto.request;

public record UserRequest(
        String username ,
        String password ,
        String email
) {
}
