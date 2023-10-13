package br.edu.ifal.todolist.user;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name ="tbl_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator= "UUID")
    private UUID id;
    
    // @Column(name = "usuario")
    private String username;
    private String name;
    private String password;
    
}
