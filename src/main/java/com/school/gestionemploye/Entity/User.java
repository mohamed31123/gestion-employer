package com.school.gestionemploye.Entity;


import com.school.gestionemploye.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "users")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotEmpty(message = "username should is required")
    private String username ;
    @Column(name = "email")
    private String email;
    @NotEmpty(message = "password is required")
    @Size(min = 8 ,  max = 50 , message = "password should contain at least 8 caracters ")
    private String password ;

    @Enumerated(EnumType.STRING)
    private Role role;
    

}
