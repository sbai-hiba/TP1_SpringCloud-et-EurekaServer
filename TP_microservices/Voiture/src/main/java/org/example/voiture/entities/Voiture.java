package org.example.voiture.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;

    @Transient
    @ManyToOne
    private Client client;
}
