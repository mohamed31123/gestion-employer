package com.school.gestionemploye.Entity;


import com.school.gestionemploye.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String username ;

    @Enumerated(EnumType.STRING)
    private Role role;
    

}
