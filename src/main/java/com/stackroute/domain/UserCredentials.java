package com.stackroute.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCredentials {
    @Id
    private  String email;
    @Column
    private String password;
}

