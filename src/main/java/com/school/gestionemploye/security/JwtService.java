package com.school.gestionemploye.security;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Base64;

@Service
public class JwtService {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private long expiration;

    private SecretKey getSigningKey() {
        byte[] encodedKey = Base64.getEncoder().encode(secret.getBytes());
        return Keys.hmacShaKeyFor(encodedKey);
    }
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

}
