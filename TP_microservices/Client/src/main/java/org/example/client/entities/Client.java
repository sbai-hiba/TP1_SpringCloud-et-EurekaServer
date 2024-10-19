package org.example.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Float age;

}